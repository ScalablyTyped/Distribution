package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitScrollspyOptions extends js.Object {
  
  var cls: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var `offset-left`: js.UndefOr[Double] = js.native
  
  var `offset-top`: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[Boolean] = js.native
}
object UIkitScrollspyOptions {
  
  @scala.inline
  def apply(): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
  
  @scala.inline
  implicit class UIkitScrollspyOptionsOps[Self <: UIkitScrollspyOptions] (val x: Self) extends AnyVal {
    
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
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def `setOffset-left`(value: Double): Self = this.set("offset-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-left`: Self = this.set("offset-left", js.undefined)
    
    @scala.inline
    def `setOffset-top`(value: Double): Self = this.set("offset-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-top`: Self = this.set("offset-top", js.undefined)
    
    @scala.inline
    def setRepeat(value: Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
}
