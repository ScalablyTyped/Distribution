package typings.wordpressEditor

import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typings.wordpressCoreData.schemaMod.Schema.User
import typings.wordpressEditor.wordpressEditorStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompletersMod {
  
  @JSImport("@wordpress/editor/components/autocompleters", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  @JSImport("@wordpress/editor/components/autocompleters", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
}
