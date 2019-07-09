package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelLoggingVerbosity extends js.Object

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "ModelLoggingVerbosity")
@js.native
object ModelLoggingVerbosity extends js.Object {
  @js.native
  sealed trait SILENT
    extends atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  
  @js.native
  sealed trait VERBOSE
    extends atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  
  /* 0 */ val SILENT: SILENT with scala.Double = js.native
  /* 1 */ val VERBOSE: VERBOSE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity with scala.Double
  ] = js.native
}

