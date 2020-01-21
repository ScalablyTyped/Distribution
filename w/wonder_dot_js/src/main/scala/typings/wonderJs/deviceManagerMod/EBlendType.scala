package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBlendType extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendType")
@js.native
object EBlendType extends js.Object {
  @js.native
  sealed trait ADDITIVE extends EBlendType
  
  @js.native
  sealed trait ADDITIVEALPHA extends EBlendType
  
  @js.native
  sealed trait MULTIPLICATIVE extends EBlendType
  
  @js.native
  sealed trait NONE extends EBlendType
  
  @js.native
  sealed trait NORMAL extends EBlendType
  
  @js.native
  sealed trait PREMULTIPLIED extends EBlendType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendType with Double] = js.native
  /* 2 */ @js.native
  object ADDITIVE extends TopLevel[ADDITIVE with Double]
  
  /* 3 */ @js.native
  object ADDITIVEALPHA extends TopLevel[ADDITIVEALPHA with Double]
  
  /* 4 */ @js.native
  object MULTIPLICATIVE extends TopLevel[MULTIPLICATIVE with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 5 */ @js.native
  object PREMULTIPLIED extends TopLevel[PREMULTIPLIED with Double]
  
}

