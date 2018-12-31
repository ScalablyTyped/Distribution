package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents all material resources in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMaterial")
@js.native
/** Creates an instance of the Printing3DMaterial class. */
class Printing3DMaterial () extends js.Object {
  /** Gets all base material groups used in the 3D model. */
  var baseGroups: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DBaseMaterialGroup] = js.native
  /** Gets all color material groups used in the 3D model. */
  var colorGroups: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DColorMaterialGroup] = js.native
  /** Gets all composite material groups used in the 3D model. */
  var compositeGroups: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DCompositeMaterialGroup] = js.native
  /** Gets all multi-property groups used in the 3D model. */
  var multiplePropertyGroups: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DMultiplePropertyMaterialGroup] = js.native
  /** Gets all 2D texture material groups used in the 3D model. */
  var texture2CoordGroups: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DTexture2CoordMaterialGroup] = js.native
}

