package typings.winrtDashUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Printing3DMeshVerificationMode extends js.Object

/** Specifies how the mesh is verified. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationMode")
@js.native
object Printing3DMeshVerificationMode extends js.Object {
  /** Wait to return results until the verification is complete. */
  @js.native
  sealed trait findAllErrors extends Printing3DMeshVerificationMode
  
  /** Return results upon finding the first failure. */
  @js.native
  sealed trait findFirstError extends Printing3DMeshVerificationMode
  
  /* 1 */ val findAllErrors: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findAllErrors with Double = js.native
  /* 0 */ val findFirstError: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findFirstError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DMeshVerificationMode with Double] = js.native
}

