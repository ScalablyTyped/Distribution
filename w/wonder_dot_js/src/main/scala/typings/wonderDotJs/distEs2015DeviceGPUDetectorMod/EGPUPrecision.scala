package typings.wonderDotJs.distEs2015DeviceGPUDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EGPUPrecision extends js.Object

@JSImport("wonder.js/dist/es2015/device/GPUDetector", "EGPUPrecision")
@js.native
object EGPUPrecision extends js.Object {
  @js.native
  sealed trait HIGHP extends EGPUPrecision
  
  @js.native
  sealed trait LOWP extends EGPUPrecision
  
  @js.native
  sealed trait MEDIUMP extends EGPUPrecision
  
  /* 0 */ val HIGHP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.HIGHP with Double = js.native
  /* 2 */ val LOWP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.LOWP with Double = js.native
  /* 1 */ val MEDIUMP: typings.wonderDotJs.distEs2015DeviceGPUDetectorMod.EGPUPrecision.MEDIUMP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EGPUPrecision with Double] = js.native
}

