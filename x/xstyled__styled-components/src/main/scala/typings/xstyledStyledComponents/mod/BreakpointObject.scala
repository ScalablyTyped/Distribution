package typings.xstyledStyledComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in @xstyled/styled-components.@xstyled/styled-components.BreakpointName ]:? ArgType} */
@js.native
trait BreakpointObject[ArgType] extends js.Object {
  
  var lg: js.UndefOr[ArgType] = js.native
  
  var md: js.UndefOr[ArgType] = js.native
  
  var sm: js.UndefOr[ArgType] = js.native
  
  var xl: js.UndefOr[ArgType] = js.native
  
  var xs: js.UndefOr[ArgType] = js.native
}
object BreakpointObject {
  
  @scala.inline
  def apply[ArgType](): BreakpointObject[ArgType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointObject[ArgType]]
  }
  
  @scala.inline
  implicit class BreakpointObjectOps[Self <: BreakpointObject[_], ArgType] (val x: Self with BreakpointObject[ArgType]) extends AnyVal {
    
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
    def setLg(value: ArgType): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def setMd(value: ArgType): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setSm(value: ArgType): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def setXl(value: ArgType): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    
    @scala.inline
    def setXs(value: ArgType): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
  }
}
