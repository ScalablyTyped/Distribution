package typings.yaireoTagify.mod

import typings.std.ClipboardEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Promise-based hooks for async program flow scenarios at runtime.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
@js.native
trait HooksRuntime[T /* <: BaseTagData */] extends StObject {
  
  /**
    * Hook invoked when the user pastes a string into Tagify. It can be used to change
    * the pasted string before it gets added to Tagify.
    * @param event Clipboard event
    * @param data Data object with pasted text and clipboard data.
    * @return Promise with optional string value. If the promise resolves with a string value,
    * this value gets added to Tagify. Without any value, the original paste value gets added.
    */
  def beforePaste(event: ClipboardEvent, data: BeforePasteData[T]): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Hook invoked before a tag is removed. Can be used to perform a custom
    * action. The tag is removed only when the promise is fulfilled. When
    * the promise is rejected, the tag is not removed.
    */
  def beforeRemoveTag(tags: js.Array[T]): js.Promise[Unit] = js.native
  
  def suggestionClick(event: KeyboardEvent, data: SuggestionClickData[T]): js.Promise[Unit] = js.native
  /**
    * Hook invoked when the user clicks on (or selects via Enter key) a suggestion in the dropdown
    * menu. Can be used to perform custom actions, such as removing a
    * suggestion from the dropdown menu via a custom remove button. The
    * suggestion is accepted and a new tag is added only when the promise
    * is fulfilled. When the promise is rejected, the suggestion is not
    * accepted and no tag is added.
    */
  def suggestionClick(event: MouseEvent, data: SuggestionClickData[T]): js.Promise[Unit] = js.native
}
