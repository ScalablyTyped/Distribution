package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBlendType extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendType")
@js.native
object EBlendType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendType & Double] = js.native
  
  @js.native
  sealed trait ADDITIVE
    extends StObject
       with EBlendType
  /* 2 */ val ADDITIVE: typings.wonderJs.deviceManagerMod.EBlendType.ADDITIVE & Double = js.native
  
  @js.native
  sealed trait ADDITIVEALPHA
    extends StObject
       with EBlendType
  /* 3 */ val ADDITIVEALPHA: typings.wonderJs.deviceManagerMod.EBlendType.ADDITIVEALPHA & Double = js.native
  
  @js.native
  sealed trait MULTIPLICATIVE
    extends StObject
       with EBlendType
  /* 4 */ val MULTIPLICATIVE: typings.wonderJs.deviceManagerMod.EBlendType.MULTIPLICATIVE & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with EBlendType
  /* 0 */ val NONE: typings.wonderJs.deviceManagerMod.EBlendType.NONE & Double = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with EBlendType
  /* 1 */ val NORMAL: typings.wonderJs.deviceManagerMod.EBlendType.NORMAL & Double = js.native
  
  @js.native
  sealed trait PREMULTIPLIED
    extends StObject
       with EBlendType
  /* 5 */ val PREMULTIPLIED: typings.wonderJs.deviceManagerMod.EBlendType.PREMULTIPLIED & Double = js.native
}
