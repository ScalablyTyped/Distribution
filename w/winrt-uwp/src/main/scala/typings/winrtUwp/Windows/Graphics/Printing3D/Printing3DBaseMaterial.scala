package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the base material used for manufacturing certain objects in the 3D model. */
trait Printing3DBaseMaterial extends js.Object {
  /** Gets or sets the color of the base material. */
  var color: Printing3DColorMaterial
  /** Gets or sets the name of the base material. */
  var name: String
}

object Printing3DBaseMaterial {
  @scala.inline
  def apply(color: Printing3DColorMaterial, name: String): Printing3DBaseMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterial]
  }
}

