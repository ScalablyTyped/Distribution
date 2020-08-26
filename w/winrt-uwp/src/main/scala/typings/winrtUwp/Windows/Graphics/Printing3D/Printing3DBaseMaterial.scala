package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the base material used for manufacturing certain objects in the 3D model. */
@js.native
trait Printing3DBaseMaterial extends js.Object {
  /** Gets or sets the color of the base material. */
  var color: Printing3DColorMaterial = js.native
  /** Gets or sets the name of the base material. */
  var name: String = js.native
}

object Printing3DBaseMaterial {
  @scala.inline
  def apply(color: Printing3DColorMaterial, name: String): Printing3DBaseMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterial]
  }
  @scala.inline
  implicit class Printing3DBaseMaterialOps[Self <: Printing3DBaseMaterial] (val x: Self) extends AnyVal {
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
    def setColor(value: Printing3DColorMaterial): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

