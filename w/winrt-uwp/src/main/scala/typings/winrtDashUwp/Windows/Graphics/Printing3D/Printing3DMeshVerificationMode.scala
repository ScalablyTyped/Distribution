package typings.winrtDashUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findAllErrors
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode.findFirstError
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DMeshVerificationMode with Double] = js.native
  /* 1 */ @js.native
  object findAllErrors extends TopLevel[findAllErrors with Double]
  
  /* 0 */ @js.native
  object findFirstError extends TopLevel[findFirstError with Double]
  
}

