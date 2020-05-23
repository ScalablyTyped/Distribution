package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a multi-property material group. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup")
@js.native
class Printing3DMultiplePropertyMaterialGroup protected ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup {
  /**
    * Creates a new instance of the Printing3DMultiplePropertyMaterialGroup class.
    * @param MaterialGroupId The identifier (ID) of the multi-property material group; a value greater than zero.
    */
  def this(MaterialGroupId: Double) = this()
  /** Gets the identifier (ID) of the multi-property material group. */
  /* CompleteClass */
  override var materialGroupId: Double = js.native
  /** Gets an ordered list of material groups ( MaterialGroupId values) that are used to define property-material combinations in the multi-property group. The order of material groups is maintained in the combinations defined by MultipleProperties . */
  /* CompleteClass */
  override var materialGroupIndices: IVector[Double] = js.native
  /** Gets a list of property-material combinations. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  /* CompleteClass */
  override var multipleProperties: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial] = js.native
}

