package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object etransformstateMod {
  
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
    /* 4 */ val ISLOCALROTATE: typings.wonderJs.etransformstateMod.ETransformState.ISLOCALROTATE & Double = js.native
    
    @js.native
    sealed trait ISLOCALSCALE
      extends StObject
         with ETransformState
    /* 5 */ val ISLOCALSCALE: typings.wonderJs.etransformstateMod.ETransformState.ISLOCALSCALE & Double = js.native
    
    @js.native
    sealed trait ISLOCALTRANSLATE
      extends StObject
         with ETransformState
    /* 3 */ val ISLOCALTRANSLATE: typings.wonderJs.etransformstateMod.ETransformState.ISLOCALTRANSLATE & Double = js.native
    
    @js.native
    sealed trait ISROTATE
      extends StObject
         with ETransformState
    /* 1 */ val ISROTATE: typings.wonderJs.etransformstateMod.ETransformState.ISROTATE & Double = js.native
    
    @js.native
    sealed trait ISSCALE
      extends StObject
         with ETransformState
    /* 2 */ val ISSCALE: typings.wonderJs.etransformstateMod.ETransformState.ISSCALE & Double = js.native
    
    @js.native
    sealed trait ISTRANSLATE
      extends StObject
         with ETransformState
    /* 0 */ val ISTRANSLATE: typings.wonderJs.etransformstateMod.ETransformState.ISTRANSLATE & Double = js.native
  }
}
