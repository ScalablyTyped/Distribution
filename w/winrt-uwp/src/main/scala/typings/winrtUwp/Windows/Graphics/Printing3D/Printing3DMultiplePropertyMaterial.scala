package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a combination of properties and/or materials from the material groups specified in ( MaterialGroupIndices ). */
@js.native
trait Printing3DMultiplePropertyMaterial extends js.Object {
  /** Gets the indices of the properties and/or materials combined in the multi-property material. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  var materialIndices: IVector[Double] = js.native
}

object Printing3DMultiplePropertyMaterial {
  @scala.inline
  def apply(materialIndices: IVector[Double]): Printing3DMultiplePropertyMaterial = {
    val __obj = js.Dynamic.literal(materialIndices = materialIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMultiplePropertyMaterial]
  }
  @scala.inline
  implicit class Printing3DMultiplePropertyMaterialOps[Self <: Printing3DMultiplePropertyMaterial] (val x: Self) extends AnyVal {
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
    def setMaterialIndices(value: IVector[Double]): Self = this.set("materialIndices", value.asInstanceOf[js.Any])
  }
  
}

