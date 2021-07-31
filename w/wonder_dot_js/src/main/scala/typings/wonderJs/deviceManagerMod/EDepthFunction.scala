package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepthFunction extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EDepthFunction")
@js.native
object EDepthFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepthFunction & Double] = js.native
  
  @js.native
  sealed trait ALWAYS
    extends StObject
       with EDepthFunction
  /* 1 */ val ALWAYS: typings.wonderJs.deviceManagerMod.EDepthFunction.ALWAYS & Double = js.native
  
  @js.native
  sealed trait EQUAL
    extends StObject
       with EDepthFunction
  /* 4 */ val EQUAL: typings.wonderJs.deviceManagerMod.EDepthFunction.EQUAL & Double = js.native
  
  @js.native
  sealed trait GEQUAL
    extends StObject
       with EDepthFunction
  /* 5 */ val GEQUAL: typings.wonderJs.deviceManagerMod.EDepthFunction.GEQUAL & Double = js.native
  
  @js.native
  sealed trait GREATER
    extends StObject
       with EDepthFunction
  /* 6 */ val GREATER: typings.wonderJs.deviceManagerMod.EDepthFunction.GREATER & Double = js.native
  
  @js.native
  sealed trait LEQUAL
    extends StObject
       with EDepthFunction
  /* 3 */ val LEQUAL: typings.wonderJs.deviceManagerMod.EDepthFunction.LEQUAL & Double = js.native
  
  @js.native
  sealed trait LESS
    extends StObject
       with EDepthFunction
  /* 2 */ val LESS: typings.wonderJs.deviceManagerMod.EDepthFunction.LESS & Double = js.native
  
  @js.native
  sealed trait NEVER
    extends StObject
       with EDepthFunction
  /* 0 */ val NEVER: typings.wonderJs.deviceManagerMod.EDepthFunction.NEVER & Double = js.native
  
  @js.native
  sealed trait NOTEQUAL
    extends StObject
       with EDepthFunction
  /* 7 */ val NOTEQUAL: typings.wonderJs.deviceManagerMod.EDepthFunction.NOTEQUAL & Double = js.native
}
