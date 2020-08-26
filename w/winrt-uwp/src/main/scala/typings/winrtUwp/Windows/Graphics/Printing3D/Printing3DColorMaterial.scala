package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a color material used in the 3D model. */
@js.native
trait Printing3DColorMaterial extends js.Object {
  /** Gets or sets the color of the material. */
  var color: Color = js.native
  /** Gets or sets the color value of the material. */
  var value: Double = js.native
}

object Printing3DColorMaterial {
  @scala.inline
  def apply(color: Color, value: Double): Printing3DColorMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterial]
  }
  @scala.inline
  implicit class Printing3DColorMaterialOps[Self <: Printing3DColorMaterial] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

