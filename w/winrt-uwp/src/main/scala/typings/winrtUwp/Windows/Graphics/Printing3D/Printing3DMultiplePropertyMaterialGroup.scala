package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a multi-property material group. */
@js.native
trait Printing3DMultiplePropertyMaterialGroup extends js.Object {
  
  /** Gets the identifier (ID) of the multi-property material group. */
  var materialGroupId: Double = js.native
  
  /** Gets an ordered list of material groups ( MaterialGroupId values) that are used to define property-material combinations in the multi-property group. The order of material groups is maintained in the combinations defined by MultipleProperties . */
  var materialGroupIndices: IVector[Double] = js.native
  
  /** Gets a list of property-material combinations. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  var multipleProperties: IVector[Printing3DMultiplePropertyMaterial] = js.native
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
  
  @scala.inline
  implicit class Printing3DMultiplePropertyMaterialGroupOps[Self <: Printing3DMultiplePropertyMaterialGroup] (val x: Self) extends AnyVal {
    
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
    def setMaterialGroupId(value: Double): Self = this.set("materialGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialGroupIndices(value: IVector[Double]): Self = this.set("materialGroupIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleProperties(value: IVector[Printing3DMultiplePropertyMaterial]): Self = this.set("multipleProperties", value.asInstanceOf[js.Any])
  }
}
