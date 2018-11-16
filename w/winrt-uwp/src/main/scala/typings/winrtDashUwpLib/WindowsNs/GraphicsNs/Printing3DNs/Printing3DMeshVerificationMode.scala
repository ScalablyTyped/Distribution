package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

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
  sealed trait findAllErrors
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DMeshVerificationMode
  
  /** Return results upon finding the first failure. */
  @js.native
  sealed trait findFirstError
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DMeshVerificationMode
  
  val findAllErrors: findAllErrors with java.lang.String = js.native
  val findFirstError: findFirstError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DMeshVerificationMode with java.lang.String
  ] = js.native
}

