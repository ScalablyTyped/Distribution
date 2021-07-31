package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBlendEquation extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendEquation")
@js.native
object EBlendEquation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendEquation & Double] = js.native
  
  @js.native
  sealed trait ADD
    extends StObject
       with EBlendEquation
  /* 0 */ val ADD: typings.wonderJs.deviceManagerMod.EBlendEquation.ADD & Double = js.native
  
  @js.native
  sealed trait REVERSE_SUBTRAC
    extends StObject
       with EBlendEquation
  /* 2 */ val REVERSE_SUBTRAC: typings.wonderJs.deviceManagerMod.EBlendEquation.REVERSE_SUBTRAC & Double = js.native
  
  @js.native
  sealed trait SUBTRACT
    extends StObject
       with EBlendEquation
  /* 1 */ val SUBTRACT: typings.wonderJs.deviceManagerMod.EBlendEquation.SUBTRACT & Double = js.native
}
