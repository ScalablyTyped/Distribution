package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DComponentWithMatrix")
@js.native
class Printing3DComponentWithMatrix () extends js.Object {
  /** Gets or sets the 3D Manufacturing Format (3MF) primitive component that's applied to the object definition with a matrix transform. */
  var component: Printing3DComponent = js.native
  /** Gets or sets the matrix transform that's applied to the 3D Manufacturing Format (3MF) primitive component. */
  var matrix: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Matrix4x4 = js.native
}

