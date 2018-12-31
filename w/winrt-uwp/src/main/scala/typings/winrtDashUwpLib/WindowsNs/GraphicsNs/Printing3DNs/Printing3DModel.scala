package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the 3D model in a 3D Manufacturing Format (3MF) package. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DModel")
@js.native
/** Creates an instance of the Printing3DModel class. */
class Printing3DModel () extends js.Object {
  /** Gets or sets the root 3D Manufacturing Format (3MF) component. It represents the build plate on a 3D printer and defines what will be printed. */
  var build: Printing3DComponent = js.native
  /** Gets all 3D Manufacturing Format (3MF) components used in the 3D model. */
  var components: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DComponent] = js.native
  /** Gets or sets the root material container for the 3D model. */
  var material: Printing3DMaterial = js.native
  /** Gets all meshes used in the 3D model. */
  var meshes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DMesh] = js.native
  /** Gets the metadata for the 3D Manufacturing Format (3MF) package. */
  var metadata: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets a list of the extensions required by the 3D Manufacturing Format (3MF) package. */
  var requiredExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets all textures used in the 3D model. */
  var textures: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DModelTexture] = js.native
  /** Gets or sets the units of measure used in the 3D model. */
  var unit: Printing3DModelUnit = js.native
  /** Gets or sets the version of the 3D Manufacturing Format (3MF) package. */
  var version: java.lang.String = js.native
  /**
    * Repairs the 3D model.
    * @return Results of the operation.
    */
  def repairAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

