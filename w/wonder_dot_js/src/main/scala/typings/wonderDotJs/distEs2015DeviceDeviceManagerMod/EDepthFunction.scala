package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepthFunction extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EDepthFunction")
@js.native
object EDepthFunction extends js.Object {
  @js.native
  sealed trait ALWAYS extends EDepthFunction
  
  @js.native
  sealed trait EQUAL extends EDepthFunction
  
  @js.native
  sealed trait GEQUAL extends EDepthFunction
  
  @js.native
  sealed trait GREATER extends EDepthFunction
  
  @js.native
  sealed trait LEQUAL extends EDepthFunction
  
  @js.native
  sealed trait LESS extends EDepthFunction
  
  @js.native
  sealed trait NEVER extends EDepthFunction
  
  @js.native
  sealed trait NOTEQUAL extends EDepthFunction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepthFunction with Double] = js.native
  /* 1 */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with Double]
  
  /* 4 */ @js.native
  object EQUAL extends TopLevel[EQUAL with Double]
  
  /* 5 */ @js.native
  object GEQUAL extends TopLevel[GEQUAL with Double]
  
  /* 6 */ @js.native
  object GREATER extends TopLevel[GREATER with Double]
  
  /* 3 */ @js.native
  object LEQUAL extends TopLevel[LEQUAL with Double]
  
  /* 2 */ @js.native
  object LESS extends TopLevel[LESS with Double]
  
  /* 0 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
  
  /* 7 */ @js.native
  object NOTEQUAL extends TopLevel[NOTEQUAL with Double]
  
}

