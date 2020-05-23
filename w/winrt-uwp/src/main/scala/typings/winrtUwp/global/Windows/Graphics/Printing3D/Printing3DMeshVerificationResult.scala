package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VerifyAsync method. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationResult")
@js.native
abstract class Printing3DMeshVerificationResult ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationResult {
  /** Gets a value that indicates if the mesh is valid. */
  /* CompleteClass */
  override var isValid: Boolean = js.native
  /** Gets the triangles with non-manifold edges, if applicable. */
  /* CompleteClass */
  override var nonmanifoldTriangles: IVectorView[Double] = js.native
  /** Gets the reverse normal triangles, if applicable. */
  /* CompleteClass */
  override var reversedNormalTriangles: IVectorView[Double] = js.native
}

