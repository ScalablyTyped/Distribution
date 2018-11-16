package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of 2D texture materials used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup")
@js.native
class Printing3DTexture2CoordMaterialGroup protected () extends js.Object {
  /**
                   * Creates a instance of the Printing3DTexture2CoordMaterialGroup class.
                   * @param MaterialGroupId The identifier for a group of 2D texture materials used in the 3D model; a value greater than zero.
                   */
  def this(MaterialGroupId: scala.Double) = this()
  /** Gets the identifier (ID) of the 2D texture material group. */
  var materialGroupId: scala.Double = js.native
  /** Gets or sets the texture of the material group. */
  var texture: Printing3DModelTexture = js.native
  /** Gets a group of 2D texture materials used in the 3D model. */
  var texture2Coords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DTexture2CoordMaterial] = js.native
}

