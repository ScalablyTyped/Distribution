package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a multi-property material group. */
trait Printing3DMultiplePropertyMaterialGroup extends js.Object {
  /** Gets the identifier (ID) of the multi-property material group. */
  var materialGroupId: Double
  /** Gets an ordered list of material groups ( MaterialGroupId values) that are used to define property-material combinations in the multi-property group. The order of material groups is maintained in the combinations defined by MultipleProperties . */
  var materialGroupIndices: IVector[Double]
  /** Gets a list of property-material combinations. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  var multipleProperties: IVector[Printing3DMultiplePropertyMaterial]
}

object Printing3DMultiplePropertyMaterialGroup {
  @scala.inline
  def apply(
    materialGroupId: Double,
    materialGroupIndices: IVector[Double],
    multipleProperties: IVector[Printing3DMultiplePropertyMaterial]
  ): Printing3DMultiplePropertyMaterialGroup = {
    val __obj = js.Dynamic.literal(materialGroupId = materialGroupId.asInstanceOf[js.Any], materialGroupIndices = materialGroupIndices.asInstanceOf[js.Any], multipleProperties = multipleProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMultiplePropertyMaterialGroup]
  }
}

