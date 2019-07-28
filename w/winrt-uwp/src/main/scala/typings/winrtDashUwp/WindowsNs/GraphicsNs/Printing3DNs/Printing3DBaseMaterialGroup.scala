package typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of base materials used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup")
@js.native
class Printing3DBaseMaterialGroup protected () extends js.Object {
  /**
    * Creates an instance of the Printing3DBaseMaterialGroup class.
    * @param MaterialGroupId The identifier for the group of base materials used in the 3D model; a value greater than zero.
    */
  def this(MaterialGroupId: Double) = this()
  /** Gets a group of base materials used in the 3D model. */
  var bases: IVector[Printing3DBaseMaterial] = js.native
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: Double = js.native
}

