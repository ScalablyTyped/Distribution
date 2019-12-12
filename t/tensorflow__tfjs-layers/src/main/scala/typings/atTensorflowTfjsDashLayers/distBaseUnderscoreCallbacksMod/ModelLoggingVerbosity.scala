package typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity.SILENT
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity.VERBOSE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelLoggingVerbosity with Double] = js.native
  /* 0 */ @js.native
  object SILENT extends TopLevel[SILENT with Double]
  
  /* 1 */ @js.native
  object VERBOSE extends TopLevel[VERBOSE with Double]
  
}

