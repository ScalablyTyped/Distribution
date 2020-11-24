package typings.tensorflowTfjsLayers.baseCallbacksMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelLoggingVerbosity extends js.Object
@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "ModelLoggingVerbosity")
@js.native
object ModelLoggingVerbosity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelLoggingVerbosity with Double] = js.native
  
  @js.native
  sealed trait SILENT extends ModelLoggingVerbosity
  /* 0 */ @js.native
  object SILENT extends TopLevel[SILENT with Double]
  
  @js.native
  sealed trait VERBOSE extends ModelLoggingVerbosity
  /* 1 */ @js.native
  object VERBOSE extends TopLevel[VERBOSE with Double]
}
