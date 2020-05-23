package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents all material resources in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMaterial")
@js.native
/** Creates an instance of the Printing3DMaterial class. */
class Printing3DMaterial ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMaterial {
  /** Gets all base material groups used in the 3D model. */
  /* CompleteClass */
  override var baseGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup] = js.native
  /** Gets all color material groups used in the 3D model. */
  /* CompleteClass */
  override var colorGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DColorMaterialGroup] = js.native
  /** Gets all composite material groups used in the 3D model. */
  /* CompleteClass */
  override var compositeGroups: IVector[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup] = js.native
  /** Gets all multi-property groups used in the 3D model. */
  /* CompleteClass */
  override var multiplePropertyGroups: IVector[
    typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup
  ] = js.native
  /** Gets all 2D texture material groups used in the 3D model. */
  /* CompleteClass */
  override var texture2CoordGroups: IVector[
    typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DTexture2CoordMaterialGroup
  ] = js.native
}

