package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evariabletypeMod {
  
  @js.native
  sealed trait EVariableType extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/shader/variable/EVariableType", "EVariableType")
  @js.native
  object EVariableType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVariableType & Double] = js.native
    
    @js.native
    sealed trait BUFFER
      extends StObject
         with EVariableType
    /* 10 */ val BUFFER: typings.wonderJs.evariabletypeMod.EVariableType.BUFFER & Double = js.native
    
    @js.native
    sealed trait COLOR_3
      extends StObject
         with EVariableType
    /* 7 */ val COLOR_3: typings.wonderJs.evariabletypeMod.EVariableType.COLOR_3 & Double = js.native
    
    @js.native
    sealed trait FLOAT_1
      extends StObject
         with EVariableType
    /* 0 */ val FLOAT_1: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_1 & Double = js.native
    
    @js.native
    sealed trait FLOAT_2
      extends StObject
         with EVariableType
    /* 1 */ val FLOAT_2: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_2 & Double = js.native
    
    @js.native
    sealed trait FLOAT_3
      extends StObject
         with EVariableType
    /* 2 */ val FLOAT_3: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_3 & Double = js.native
    
    @js.native
    sealed trait FLOAT_4
      extends StObject
         with EVariableType
    /* 3 */ val FLOAT_4: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_4 & Double = js.native
    
    @js.native
    sealed trait FLOAT_MAT3
      extends StObject
         with EVariableType
    /* 8 */ val FLOAT_MAT3: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_MAT3 & Double = js.native
    
    @js.native
    sealed trait FLOAT_MAT4
      extends StObject
         with EVariableType
    /* 9 */ val FLOAT_MAT4: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_MAT4 & Double = js.native
    
    @js.native
    sealed trait FLOAT_MAT4_ARRAY
      extends StObject
         with EVariableType
    /* 17 */ val FLOAT_MAT4_ARRAY: typings.wonderJs.evariabletypeMod.EVariableType.FLOAT_MAT4_ARRAY & Double = js.native
    
    @js.native
    sealed trait NUMBER_1
      extends StObject
         with EVariableType
    /* 13 */ val NUMBER_1: typings.wonderJs.evariabletypeMod.EVariableType.NUMBER_1 & Double = js.native
    
    @js.native
    sealed trait SAMPLER_2D
      extends StObject
         with EVariableType
    /* 12 */ val SAMPLER_2D: typings.wonderJs.evariabletypeMod.EVariableType.SAMPLER_2D & Double = js.native
    
    @js.native
    sealed trait SAMPLER_ARRAY
      extends StObject
         with EVariableType
    /* 16 */ val SAMPLER_ARRAY: typings.wonderJs.evariabletypeMod.EVariableType.SAMPLER_ARRAY & Double = js.native
    
    @js.native
    sealed trait SAMPLER_CUBE
      extends StObject
         with EVariableType
    /* 11 */ val SAMPLER_CUBE: typings.wonderJs.evariabletypeMod.EVariableType.SAMPLER_CUBE & Double = js.native
    
    @js.native
    sealed trait STRUCTURE
      extends StObject
         with EVariableType
    /* 14 */ val STRUCTURE: typings.wonderJs.evariabletypeMod.EVariableType.STRUCTURE & Double = js.native
    
    @js.native
    sealed trait STRUCTURES
      extends StObject
         with EVariableType
    /* 15 */ val STRUCTURES: typings.wonderJs.evariabletypeMod.EVariableType.STRUCTURES & Double = js.native
    
    @js.native
    sealed trait VECTOR_2
      extends StObject
         with EVariableType
    /* 4 */ val VECTOR_2: typings.wonderJs.evariabletypeMod.EVariableType.VECTOR_2 & Double = js.native
    
    @js.native
    sealed trait VECTOR_3
      extends StObject
         with EVariableType
    /* 5 */ val VECTOR_3: typings.wonderJs.evariabletypeMod.EVariableType.VECTOR_3 & Double = js.native
    
    @js.native
    sealed trait VECTOR_4
      extends StObject
         with EVariableType
    /* 6 */ val VECTOR_4: typings.wonderJs.evariabletypeMod.EVariableType.VECTOR_4 & Double = js.native
  }
}
