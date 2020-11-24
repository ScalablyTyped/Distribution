package typings.uiBox.enhancePropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedPropsResult extends js.Object {
  
  var className: String = js.native
  
  var enhancedProps: PreservedProps = js.native
}
object EnhancedPropsResult {
  
  @scala.inline
  def apply(className: String, enhancedProps: PreservedProps): EnhancedPropsResult = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], enhancedProps = enhancedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedPropsResult]
  }
  
  @scala.inline
  implicit class EnhancedPropsResultOps[Self <: EnhancedPropsResult] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedProps(value: PreservedProps): Self = this.set("enhancedProps", value.asInstanceOf[js.Any])
  }
}
