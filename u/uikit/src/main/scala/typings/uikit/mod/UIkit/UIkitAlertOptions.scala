package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitAlertOptions extends js.Object {
  
  var animation: js.UndefOr[Boolean | String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var `sel-close`: js.UndefOr[String] = js.native
}
object UIkitAlertOptions {
  
  @scala.inline
  def apply(): UIkitAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitAlertOptions]
  }
  
  @scala.inline
  implicit class UIkitAlertOptionsOps[Self <: UIkitAlertOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def `setSel-close`(value: String): Self = this.set("sel-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSel-close`: Self = this.set("sel-close", js.undefined)
  }
}
