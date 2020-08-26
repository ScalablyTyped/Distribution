package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of color materials used in the 3D model. */
@js.native
trait Printing3DColorMaterialGroup extends js.Object {
  /** Gets a group of color materials used in the 3D model. */
  var colors: IVector[Printing3DColorMaterial] = js.native
  /** Gets the identifier (ID) for the color material group. */
  var materialGroupId: Double = js.native
}

object Printing3DColorMaterialGroup {
  @scala.inline
  def apply(colors: IVector[Printing3DColorMaterial], materialGroupId: Double): Printing3DColorMaterialGroup = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterialGroup]
  }
  @scala.inline
  implicit class Printing3DColorMaterialGroupOps[Self <: Printing3DColorMaterialGroup] (val x: Self) extends AnyVal {
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
    def setColors(value: IVector[Printing3DColorMaterial]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterialGroupId(value: Double): Self = this.set("materialGroupId", value.asInstanceOf[js.Any])
  }
  
}

