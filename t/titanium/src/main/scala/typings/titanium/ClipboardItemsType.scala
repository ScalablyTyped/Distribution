package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the items for <Titanium.UI.Clipboard.setItems>.
  */
@js.native
trait ClipboardItemsType extends StObject {
  
  /**
    * An array of key-value items to add to the clipboard. The key must a valid mime-type
    * matching the mime-type of the value.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The privacy options to apply to all the items on the clipboard. The available options are
    * described in `Ti.UI.CLIPBOARD_OPTION_*`. Depending on the key, the value can be a Date or
    * Boolean.
    */
  var options: js.UndefOr[js.Any] = js.native
}
object ClipboardItemsType {
  
  @scala.inline
  def apply(): ClipboardItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardItemsType]
  }
  
  @scala.inline
  implicit class ClipboardItemsTypeMutableBuilder[Self <: ClipboardItemsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
