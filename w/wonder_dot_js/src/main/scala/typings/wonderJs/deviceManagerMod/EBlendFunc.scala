package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBlendFunc extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EBlendFunc")
@js.native
object EBlendFunc extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBlendFunc & Double] = js.native
  
  @js.native
  sealed trait DST_ALPHA
    extends StObject
       with EBlendFunc
  /* 9 */ val DST_ALPHA: typings.wonderJs.deviceManagerMod.EBlendFunc.DST_ALPHA & Double = js.native
  
  @js.native
  sealed trait DST_COLOR
    extends StObject
       with EBlendFunc
  /* 4 */ val DST_COLOR: typings.wonderJs.deviceManagerMod.EBlendFunc.DST_COLOR & Double = js.native
  
  @js.native
  sealed trait ONE
    extends StObject
       with EBlendFunc
  /* 1 */ val ONE: typings.wonderJs.deviceManagerMod.EBlendFunc.ONE & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DST_ALPH
    extends StObject
       with EBlendFunc
  /* 10 */ val ONE_MINUS_DST_ALPH: typings.wonderJs.deviceManagerMod.EBlendFunc.ONE_MINUS_DST_ALPH & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_DST_COLOR
    extends StObject
       with EBlendFunc
  /* 5 */ val ONE_MINUS_DST_COLOR: typings.wonderJs.deviceManagerMod.EBlendFunc.ONE_MINUS_DST_COLOR & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SRC_ALPHA
    extends StObject
       with EBlendFunc
  /* 8 */ val ONE_MINUS_SRC_ALPHA: typings.wonderJs.deviceManagerMod.EBlendFunc.ONE_MINUS_SRC_ALPHA & Double = js.native
  
  @js.native
  sealed trait ONE_MINUS_SRC_COLOR
    extends StObject
       with EBlendFunc
  /* 3 */ val ONE_MINUS_SRC_COLOR: typings.wonderJs.deviceManagerMod.EBlendFunc.ONE_MINUS_SRC_COLOR & Double = js.native
  
  @js.native
  sealed trait SRC_ALPHA
    extends StObject
       with EBlendFunc
  /* 6 */ val SRC_ALPHA: typings.wonderJs.deviceManagerMod.EBlendFunc.SRC_ALPHA & Double = js.native
  
  @js.native
  sealed trait SRC_ALPHA_SATURATE
    extends StObject
       with EBlendFunc
  /* 7 */ val SRC_ALPHA_SATURATE: typings.wonderJs.deviceManagerMod.EBlendFunc.SRC_ALPHA_SATURATE & Double = js.native
  
  @js.native
  sealed trait SRC_COLOR
    extends StObject
       with EBlendFunc
  /* 2 */ val SRC_COLOR: typings.wonderJs.deviceManagerMod.EBlendFunc.SRC_COLOR & Double = js.native
  
  @js.native
  sealed trait ZERO
    extends StObject
       with EBlendFunc
  /* 0 */ val ZERO: typings.wonderJs.deviceManagerMod.EBlendFunc.ZERO & Double = js.native
}
