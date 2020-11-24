package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data associated with hiding a dialog.
  **/
@js.native
trait ContentDialogHideInfo extends js.Object {
  
  /***
    * The dialog's dismissal result. May be 'primary', 'secondary', 'none', or whatever custom value was passed to hide.
    **/
  var result: String = js.native
}
object ContentDialogHideInfo {
  
  @scala.inline
  def apply(result: String): ContentDialogHideInfo = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDialogHideInfo]
  }
  
  @scala.inline
  implicit class ContentDialogHideInfoOps[Self <: ContentDialogHideInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
