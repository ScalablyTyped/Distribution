package typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelLoggingVerbosity extends js.Object

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "ModelLoggingVerbosity")
@js.native
object ModelLoggingVerbosity extends js.Object {
  @js.native
  sealed trait SILENT extends ModelLoggingVerbosity
  
  @js.native
  sealed trait VERBOSE extends ModelLoggingVerbosity
  
  /* 0 */ val SILENT: typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity.SILENT with Double = js.native
  /* 1 */ val VERBOSE: typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity.VERBOSE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelLoggingVerbosity with Double] = js.native
}

