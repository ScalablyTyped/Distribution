package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the 3D model in a 3D Manufacturing Format (3MF) package. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DModel")
@js.native
/** Creates an instance of the Printing3DModel class. */
class Printing3DModel ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModel {
  /** Gets or sets the root 3D Manufacturing Format (3MF) component. It represents the build plate on a 3D printer and defines what will be printed. */
  /* CompleteClass */
  override var build: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent = js.native
  /** Gets all 3D Manufacturing Format (3MF) components used in the 3D model. */
  /* CompleteClass */
  override var components: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent] = js.native
  /** Gets or sets the root material container for the 3D model. */
  /* CompleteClass */
  override var material: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMaterial = js.native
  /** Gets all meshes used in the 3D model. */
  /* CompleteClass */
  override var meshes: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh] = js.native
  /** Gets the metadata for the 3D Manufacturing Format (3MF) package. */
  /* CompleteClass */
  override var metadata: IMap[String, String] = js.native
  /** Gets a list of the extensions required by the 3D Manufacturing Format (3MF) package. */
  /* CompleteClass */
  override var requiredExtensions: IVector[String] = js.native
  /** Gets all textures used in the 3D model. */
  /* CompleteClass */
  override var textures: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelTexture] = js.native
  /** Gets or sets the units of measure used in the 3D model. */
  /* CompleteClass */
  override var unit: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DModelUnit = js.native
  /** Gets or sets the version of the 3D Manufacturing Format (3MF) package. */
  /* CompleteClass */
  override var version: String = js.native
  /**
    * Repairs the 3D model.
    * @return Results of the operation.
    */
  /* CompleteClass */
  override def repairAsync(): IPromiseWithIAsyncAction = js.native
}

