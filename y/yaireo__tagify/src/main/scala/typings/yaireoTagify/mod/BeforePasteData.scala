package typings.yaireoTagify.mod

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data passed with beforePaste hook {@link Hooks.beforePaste}.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait BeforePasteData[T /* <: BaseTagData */] extends StObject {
  
  /**
    * The raw clipboard data transfer object as provided by the paste event.
    */
  var clipboardData: DataTransfer
  
  /**
    * Text content that have been pasted into Tagify.
    */
  var pastedText: String
  
  /**
    * Tagify instance.
    */
  var tagify: Tagify[T]
}
object BeforePasteData {
  
  inline def apply[T /* <: BaseTagData */](clipboardData: DataTransfer, pastedText: String, tagify: Tagify[T]): BeforePasteData[T] = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any], pastedText = pastedText.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePasteData[T]]
  }
  
  extension [Self <: BeforePasteData[?], T /* <: BaseTagData */](x: Self & BeforePasteData[T]) {
    
    inline def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
    
    inline def setPastedText(value: String): Self = StObject.set(x, "pastedText", value.asInstanceOf[js.Any])
    
    inline def setTagify(value: Tagify[T]): Self = StObject.set(x, "tagify", value.asInstanceOf[js.Any])
  }
}
