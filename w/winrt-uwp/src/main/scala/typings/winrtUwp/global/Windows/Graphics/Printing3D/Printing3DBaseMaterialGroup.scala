package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of base materials used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup")
@js.native
class Printing3DBaseMaterialGroup protected ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup {
  /**
    * Creates an instance of the Printing3DBaseMaterialGroup class.
    * @param MaterialGroupId The identifier for the group of base materials used in the 3D model; a value greater than zero.
    */
  def this(MaterialGroupId: Double) = this()
  /** Gets a group of base materials used in the 3D model. */
  /* CompleteClass */
  override var bases: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterial] = js.native
  /** Gets the identifier (ID) of the base material group. */
  /* CompleteClass */
  override var materialGroupId: Double = js.native
}

