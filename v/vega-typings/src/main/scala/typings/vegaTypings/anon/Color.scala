package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ColorHCL
import typings.vegaTypings.encodeMod.ColorHSL
import typings.vegaTypings.encodeMod.ColorLAB
import typings.vegaTypings.encodeMod.ColorRGB
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends _ColorValueRef {
  
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL = js.native
}
object Color {
  
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Self = this.set("color", value.asInstanceOf[js.Any])
  }
}
