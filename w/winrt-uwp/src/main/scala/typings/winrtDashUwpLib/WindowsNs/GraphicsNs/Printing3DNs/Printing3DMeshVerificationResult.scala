package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VerifyAsync method. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationResult")
@js.native
abstract class Printing3DMeshVerificationResult () extends js.Object {
  /** Gets a value that indicates if the mesh is valid. */
  var isValid: scala.Boolean = js.native
  /** Gets the triangles with non-manifold edges, if applicable. */
  var nonmanifoldTriangles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
  /** Gets the reverse normal triangles, if applicable. */
  var reversedNormalTriangles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
}

