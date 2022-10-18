package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentTransformEtransformstateMod {
  
  @js.native
  sealed trait ETransformState extends StObject
  @JSImport("wonder.js/dist/es2015/component/transform/ETransformState", "ETransformState")
  @js.native
  object ETransformState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ETransformState & Double] = js.native
    
    @js.native
    sealed trait ISLOCALROTATE
      extends StObject
         with ETransformState
    /* 4 */ val ISLOCALROTATE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISLOCALROTATE & Double = js.native
    
    @js.native
    sealed trait ISLOCALSCALE
      extends StObject
         with ETransformState
    /* 5 */ val ISLOCALSCALE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISLOCALSCALE & Double = js.native
    
    @js.native
    sealed trait ISLOCALTRANSLATE
      extends StObject
         with ETransformState
    /* 3 */ val ISLOCALTRANSLATE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISLOCALTRANSLATE & Double = js.native
    
    @js.native
    sealed trait ISROTATE
      extends StObject
         with ETransformState
    /* 1 */ val ISROTATE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISROTATE & Double = js.native
    
    @js.native
    sealed trait ISSCALE
      extends StObject
         with ETransformState
    /* 2 */ val ISSCALE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISSCALE & Double = js.native
    
    @js.native
    sealed trait ISTRANSLATE
      extends StObject
         with ETransformState
    /* 0 */ val ISTRANSLATE: typings.wonderJs.distEs2015ComponentTransformEtransformstateMod.ETransformState.ISTRANSLATE & Double = js.native
  }
}
