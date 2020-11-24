package typings.xstyledStyledComponents.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorModeProviderProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var target: HTMLElement = js.native
  
  var targetSelector: String = js.native
}
object ColorModeProviderProps {
  
  @scala.inline
  def apply(target: HTMLElement, targetSelector: String): ColorModeProviderProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetSelector = targetSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorModeProviderProps]
  }
  
  @scala.inline
  implicit class ColorModeProviderPropsOps[Self <: ColorModeProviderProps] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelector(value: String): Self = this.set("targetSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
