package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VerifyAsync method. */
trait Printing3DMeshVerificationResult extends js.Object {
  /** Gets a value that indicates if the mesh is valid. */
  var isValid: Boolean
  /** Gets the triangles with non-manifold edges, if applicable. */
  var nonmanifoldTriangles: IVectorView[Double]
  /** Gets the reverse normal triangles, if applicable. */
  var reversedNormalTriangles: IVectorView[Double]
}

object Printing3DMeshVerificationResult {
  @scala.inline
  def apply(
    isValid: Boolean,
    nonmanifoldTriangles: IVectorView[Double],
    reversedNormalTriangles: IVectorView[Double]
  ): Printing3DMeshVerificationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], nonmanifoldTriangles = nonmanifoldTriangles.asInstanceOf[js.Any], reversedNormalTriangles = reversedNormalTriangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMeshVerificationResult]
  }
}

