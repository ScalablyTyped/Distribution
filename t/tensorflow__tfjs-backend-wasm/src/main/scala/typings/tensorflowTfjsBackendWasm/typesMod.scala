package typings.tensorflowTfjsBackendWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait CppDType extends StObject
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/types", "CppDType")
  @js.native
  object CppDType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CppDType & Double] = js.native
    
    @js.native
    sealed trait bool
      extends StObject
         with CppDType
    /* 2 */ val bool: typings.tensorflowTfjsBackendWasm.typesMod.CppDType.bool & Double = js.native
    
    @js.native
    sealed trait complex64
      extends StObject
         with CppDType
    /* 4 */ val complex64: typings.tensorflowTfjsBackendWasm.typesMod.CppDType.complex64 & Double = js.native
    
    @js.native
    sealed trait float32
      extends StObject
         with CppDType
    /* 0 */ val float32: typings.tensorflowTfjsBackendWasm.typesMod.CppDType.float32 & Double = js.native
    
    @js.native
    sealed trait int32
      extends StObject
         with CppDType
    /* 1 */ val int32: typings.tensorflowTfjsBackendWasm.typesMod.CppDType.int32 & Double = js.native
    
    @js.native
    sealed trait string
      extends StObject
         with CppDType
    /* 3 */ val string: typings.tensorflowTfjsBackendWasm.typesMod.CppDType.string & Double = js.native
  }
  
  @js.native
  sealed trait FusableActivation extends StObject
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/types", "FusableActivation")
  @js.native
  object FusableActivation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FusableActivation & Double] = js.native
    
    @js.native
    sealed trait elu
      extends StObject
         with FusableActivation
    /* 6 */ val elu: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.elu & Double = js.native
    
    @js.native
    sealed trait leakyrelu
      extends StObject
         with FusableActivation
    /* 4 */ val leakyrelu: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.leakyrelu & Double = js.native
    
    @js.native
    sealed trait linear
      extends StObject
         with FusableActivation
    /* 0 */ val linear: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.linear & Double = js.native
    
    @js.native
    sealed trait prelu
      extends StObject
         with FusableActivation
    /* 3 */ val prelu: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.prelu & Double = js.native
    
    @js.native
    sealed trait relu
      extends StObject
         with FusableActivation
    /* 1 */ val relu: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.relu & Double = js.native
    
    @js.native
    sealed trait relu6
      extends StObject
         with FusableActivation
    /* 2 */ val relu6: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.relu6 & Double = js.native
    
    @js.native
    sealed trait sigmoid
      extends StObject
         with FusableActivation
    /* 5 */ val sigmoid: typings.tensorflowTfjsBackendWasm.typesMod.FusableActivation.sigmoid & Double = js.native
  }
}
