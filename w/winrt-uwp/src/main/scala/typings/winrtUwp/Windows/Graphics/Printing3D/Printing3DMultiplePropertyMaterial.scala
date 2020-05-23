package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a combination of properties and/or materials from the material groups specified in ( MaterialGroupIndices ). */
trait Printing3DMultiplePropertyMaterial extends js.Object {
  /** Gets the indices of the properties and/or materials combined in the multi-property material. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  var materialIndices: IVector[Double]
}

object Printing3DMultiplePropertyMaterial {
  @scala.inline
  def apply(materialIndices: IVector[Double]): Printing3DMultiplePropertyMaterial = {
    val __obj = js.Dynamic.literal(materialIndices = materialIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMultiplePropertyMaterial]
  }
}

