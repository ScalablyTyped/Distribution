package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendEquation extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendEquation")
@js.native
object EBlendEquation extends js.Object {
  @js.native
  sealed trait ADD extends EBlendEquation
  
  @js.native
  sealed trait REVERSE_SUBTRAC extends EBlendEquation
  
  @js.native
  sealed trait SUBTRACT extends EBlendEquation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendEquation with Double] = js.native
  /* 0 */ @js.native
  object ADD extends TopLevel[ADD with Double]
  
  /* 2 */ @js.native
  object REVERSE_SUBTRAC extends TopLevel[REVERSE_SUBTRAC with Double]
  
  /* 1 */ @js.native
  object SUBTRACT extends TopLevel[SUBTRACT with Double]
  
}

