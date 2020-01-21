package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ESide extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "ESide")
@js.native
object ESide extends js.Object {
  @js.native
  sealed trait BACK extends ESide
  
  @js.native
  sealed trait BOTH extends ESide
  
  @js.native
  sealed trait FRONT extends ESide
  
  @js.native
  sealed trait NONE extends ESide
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESide with Double] = js.native
  /* 2 */ @js.native
  object BACK extends TopLevel[BACK with Double]
  
  /* 1 */ @js.native
  object BOTH extends TopLevel[BOTH with Double]
  
  /* 3 */ @js.native
  object FRONT extends TopLevel[FRONT with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

