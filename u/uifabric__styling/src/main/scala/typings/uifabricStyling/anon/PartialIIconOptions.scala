package typings.uifabricStyling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/utilities/icons.IIconOptions> */
@js.native
trait PartialIIconOptions extends js.Object {
  
  var disableWarnings: js.UndefOr[Boolean] = js.native
  
  var warnOnMissingIcons: js.UndefOr[Boolean] = js.native
}
object PartialIIconOptions {
  
  @scala.inline
  def apply(): PartialIIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIIconOptions]
  }
  
  @scala.inline
  implicit class PartialIIconOptionsOps[Self <: PartialIIconOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableWarnings(value: Boolean): Self = this.set("disableWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWarnings: Self = this.set("disableWarnings", js.undefined)
    
    @scala.inline
    def setWarnOnMissingIcons(value: Boolean): Self = this.set("warnOnMissingIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnOnMissingIcons: Self = this.set("warnOnMissingIcons", js.undefined)
  }
}
