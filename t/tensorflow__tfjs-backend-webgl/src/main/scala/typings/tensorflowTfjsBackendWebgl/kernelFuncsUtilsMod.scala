package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.sharedMod.SimpleBinaryKernelImplCPU
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelFuncsUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "CHECK_NAN_SNIPPET_BINARY")
  @js.native
  val CHECK_NAN_SNIPPET_BINARY: /* "\n  if (isnan(a)) return a;\n  if (isnan(b)) return b;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "CHECK_NAN_SNIPPET_BINARY_PACKED")
  @js.native
  val CHECK_NAN_SNIPPET_BINARY_PACKED: /* "\n  result.r = isNaN.r > 0. ? NAN : result.r;\n  result.g = isNaN.g > 0. ? NAN : result.g;\n  result.b = isNaN.b > 0. ? NAN : result.b;\n  result.a = isNaN.a > 0. ? NAN : result.a;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "CHECK_NAN_SNIPPET_UNARY")
  @js.native
  val CHECK_NAN_SNIPPET_UNARY: /* "if (isnan(x)) return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "binaryKernelFunc")
  @js.native
  def binaryKernelFunc(
    hasOpSnippetPackedOpSnippetCheckOutOfBoundsSupportsComplexCpuKernelImplDtype: BinaryKernelFuncConfig
  ): KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/kernel_funcs_utils", "unaryKernelFunc")
  @js.native
  def unaryKernelFunc(opSnippet: String): KernelFunc = js.native
  
  @js.native
  trait BinaryKernelFuncConfig extends StObject {
    
    var checkOutOfBounds: js.UndefOr[Boolean] = js.native
    
    var cpuKernelImpl: js.UndefOr[SimpleBinaryKernelImplCPU] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    var opSnippet: String = js.native
    
    var packedOpSnippet: js.UndefOr[String] = js.native
    
    var supportsComplex: js.UndefOr[Boolean] = js.native
  }
  object BinaryKernelFuncConfig {
    
    @scala.inline
    def apply(opSnippet: String): BinaryKernelFuncConfig = {
      val __obj = js.Dynamic.literal(opSnippet = opSnippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryKernelFuncConfig]
    }
    
    @scala.inline
    implicit class BinaryKernelFuncConfigMutableBuilder[Self <: BinaryKernelFuncConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckOutOfBounds(value: Boolean): Self = StObject.set(x, "checkOutOfBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckOutOfBoundsUndefined: Self = StObject.set(x, "checkOutOfBounds", js.undefined)
      
      @scala.inline
      def setCpuKernelImpl(
        value: (/* aShape */ js.Array[Double], /* bShape */ js.Array[Double], /* aVals */ TypedArray, /* bVals */ TypedArray, /* dtype */ DataType) => js.Tuple2[TypedArray, js.Array[Double]]
      ): Self = StObject.set(x, "cpuKernelImpl", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCpuKernelImplUndefined: Self = StObject.set(x, "cpuKernelImpl", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setOpSnippet(value: String): Self = StObject.set(x, "opSnippet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackedOpSnippet(value: String): Self = StObject.set(x, "packedOpSnippet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackedOpSnippetUndefined: Self = StObject.set(x, "packedOpSnippet", js.undefined)
      
      @scala.inline
      def setSupportsComplex(value: Boolean): Self = StObject.set(x, "supportsComplex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsComplexUndefined: Self = StObject.set(x, "supportsComplex", js.undefined)
    }
  }
}
