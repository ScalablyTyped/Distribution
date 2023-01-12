package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data associated with hiding a dialog.
  **/
trait ContentDialogHideInfo extends StObject {
  
  /***
    * The dialog's dismissal result. May be 'primary', 'secondary', 'none', or whatever custom value was passed to hide.
    **/
  var result: String
}
object ContentDialogHideInfo {
  
  inline def apply(result: String): ContentDialogHideInfo = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDialogHideInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentDialogHideInfo] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
