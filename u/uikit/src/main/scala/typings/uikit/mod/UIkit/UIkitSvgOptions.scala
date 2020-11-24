package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSvgOptions extends js.Object {
  
  var src: js.UndefOr[String] = js.native
  
  var `stroke-animation`: js.UndefOr[Boolean] = js.native
}
object UIkitSvgOptions {
  
  @scala.inline
  def apply(): UIkitSvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSvgOptions]
  }
  
  @scala.inline
  implicit class UIkitSvgOptionsOps[Self <: UIkitSvgOptions] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def `setStroke-animation`(value: Boolean): Self = this.set("stroke-animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-animation`: Self = this.set("stroke-animation", js.undefined)
  }
}
