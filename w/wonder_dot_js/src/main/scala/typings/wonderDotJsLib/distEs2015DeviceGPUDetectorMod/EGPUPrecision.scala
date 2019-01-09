package typings
package wonderDotJsLib.distEs2015DeviceGPUDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EGPUPrecision extends js.Object

@JSImport("wonder.js/dist/es2015/device/GPUDetector", "EGPUPrecision")
@js.native
object EGPUPrecision extends js.Object {
  @js.native
  sealed trait HIGHP
    extends wonderDotJsLib.distEs2015DeviceGPUDetectorMod.EGPUPrecision
  
  @js.native
  sealed trait LOWP
    extends wonderDotJsLib.distEs2015DeviceGPUDetectorMod.EGPUPrecision
  
  @js.native
  sealed trait MEDIUMP
    extends wonderDotJsLib.distEs2015DeviceGPUDetectorMod.EGPUPrecision
  
  /* 0 */ val HIGHP: HIGHP with scala.Double = js.native
  /* 2 */ val LOWP: LOWP with scala.Double = js.native
  /* 1 */ val MEDIUMP: MEDIUMP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015DeviceGPUDetectorMod.EGPUPrecision with scala.Double] = js.native
}

