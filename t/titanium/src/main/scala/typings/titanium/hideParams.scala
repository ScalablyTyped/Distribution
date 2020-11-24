package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.hide> method.
  */
@js.native
trait hideParams extends js.Object {
  
  /**
    * Determines whether to animate the dialog as it is dismissed.
    */
  var animated: js.UndefOr[Boolean] = js.native
}
object hideParams {
  
  @scala.inline
  def apply(): hideParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hideParams]
  }
  
  @scala.inline
  implicit class hideParamsOps[Self <: hideParams] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
  }
}
