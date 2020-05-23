package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a color material used in the 3D model. */
trait Printing3DColorMaterial extends js.Object {
  /** Gets or sets the color of the material. */
  var color: Color
  /** Gets or sets the color value of the material. */
  var value: Double
}

object Printing3DColorMaterial {
  @scala.inline
  def apply(color: Color, value: Double): Printing3DColorMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterial]
  }
}

