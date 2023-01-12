package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distKernelUtilsSharedMod.SimpleBinaryKernelImplCPU
import typings.tensorflowTfjsBackendWebgl.distKernelUtilsSharedMod.SimpleUnaryKernelImplCPU
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsKernelFuncsUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "CHECK_NAN_SNIPPET_UNARY")
  @js.native
  val CHECK_NAN_SNIPPET_UNARY: /* "if (isnan(x)) return x;" */ String = js.native
  
  inline def binaryKernelFunc(param0: BinaryKernelFuncConfig): KernelFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(param0.asInstanceOf[js.Any]).asInstanceOf[KernelFunc]
  
  inline def mapActivationToShaderProgram(activation: Activation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mapActivationToShaderProgram")(activation.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mapActivationToShaderProgram(activation: Activation, packed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapActivationToShaderProgram")(activation.asInstanceOf[js.Any], packed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unaryKernelFunc(param0: UnaryKernelFuncConfig): KernelFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("unaryKernelFunc")(param0.asInstanceOf[js.Any]).asInstanceOf[KernelFunc]
  
  trait BinaryKernelFuncConfig extends StObject {
    
    var checkOutOfBounds: js.UndefOr[Boolean] = js.undefined
    
    var cpuKernelImpl: js.UndefOr[SimpleBinaryKernelImplCPU] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    var opSnippet: String
    
    var packedOpSnippet: js.UndefOr[String] = js.undefined
    
    var supportsComplex: js.UndefOr[Boolean] = js.undefined
  }
  object BinaryKernelFuncConfig {
    
    inline def apply(opSnippet: String): BinaryKernelFuncConfig = {
      val __obj = js.Dynamic.literal(opSnippet = opSnippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryKernelFuncConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryKernelFuncConfig] (val x: Self) extends AnyVal {
      
      inline def setCheckOutOfBounds(value: Boolean): Self = StObject.set(x, "checkOutOfBounds", value.asInstanceOf[js.Any])
      
      inline def setCheckOutOfBoundsUndefined: Self = StObject.set(x, "checkOutOfBounds", js.undefined)
      
      inline def setCpuKernelImpl(
        value: (/* aShape */ js.Array[Double], /* bShape */ js.Array[Double], /* aVals */ TypedArray | js.Array[String], /* bVals */ TypedArray | js.Array[String], /* dtype */ DataType) => js.Tuple2[TypedArray, js.Array[Double]]
      ): Self = StObject.set(x, "cpuKernelImpl", js.Any.fromFunction5(value))
      
      inline def setCpuKernelImplUndefined: Self = StObject.set(x, "cpuKernelImpl", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setOpSnippet(value: String): Self = StObject.set(x, "opSnippet", value.asInstanceOf[js.Any])
      
      inline def setPackedOpSnippet(value: String): Self = StObject.set(x, "packedOpSnippet", value.asInstanceOf[js.Any])
      
      inline def setPackedOpSnippetUndefined: Self = StObject.set(x, "packedOpSnippet", js.undefined)
      
      inline def setSupportsComplex(value: Boolean): Self = StObject.set(x, "supportsComplex", value.asInstanceOf[js.Any])
      
      inline def setSupportsComplexUndefined: Self = StObject.set(x, "supportsComplex", js.undefined)
    }
  }
  
  trait UnaryKernelFuncConfig extends StObject {
    
    var cpuKernelImpl: js.UndefOr[SimpleUnaryKernelImplCPU] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    var opSnippet: String
    
    var packedOpSnippet: js.UndefOr[String] = js.undefined
  }
  object UnaryKernelFuncConfig {
    
    inline def apply(opSnippet: String): UnaryKernelFuncConfig = {
      val __obj = js.Dynamic.literal(opSnippet = opSnippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnaryKernelFuncConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnaryKernelFuncConfig] (val x: Self) extends AnyVal {
      
      inline def setCpuKernelImpl(
        value: (/* values */ TypedArray, /* dtype */ DataType, /* attrs */ js.UndefOr[NamedAttrMap]) => TypedArray
      ): Self = StObject.set(x, "cpuKernelImpl", js.Any.fromFunction3(value))
      
      inline def setCpuKernelImplUndefined: Self = StObject.set(x, "cpuKernelImpl", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setOpSnippet(value: String): Self = StObject.set(x, "opSnippet", value.asInstanceOf[js.Any])
      
      inline def setPackedOpSnippet(value: String): Self = StObject.set(x, "packedOpSnippet", value.asInstanceOf[js.Any])
      
      inline def setPackedOpSnippetUndefined: Self = StObject.set(x, "packedOpSnippet", js.undefined)
    }
  }
}
