package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorProps extends js.Object {
  
  // Clash with HTMLAttributes interface declared in React module
  // that includes a non-standard HTML attribute `color?: string`.
  // Type here should be `ResponsiveValue<CSS.Property.Color>`.
  val color: js.UndefOr[js.Any] = js.native
}
object ColorProps {
  
  @scala.inline
  def apply(): ColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps]
  }
  
  @scala.inline
  implicit class ColorPropsOps[Self <: ColorProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
