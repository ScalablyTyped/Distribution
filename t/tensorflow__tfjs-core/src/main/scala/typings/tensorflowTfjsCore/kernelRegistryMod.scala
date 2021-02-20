package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.anon.Attrs
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.tapeMod.NamedGradientMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelRegistryMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "copyRegisteredKernels")
  @js.native
  def copyRegisteredKernels(registeredBackendName: String, newBackendName: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "getGradient")
  @js.native
  def getGradient(kernelName: String): GradConfig = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "getKernel")
  @js.native
  def getKernel(kernelName: String, backendName: String): KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "getKernelsForBackend")
  @js.native
  def getKernelsForBackend(backendName: String): js.Array[KernelConfig] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "registerGradient")
  @js.native
  def registerGradient(config: GradConfig): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "registerKernel")
  @js.native
  def registerKernel(config: KernelConfig): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "unregisterGradient")
  @js.native
  def unregisterGradient(kernelName: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", "unregisterKernel")
  @js.native
  def unregisterKernel(kernelName: String, backendName: String): Unit = js.native
  
  type Attribute = AttributeValue | RecursiveArray[AttributeValue]
  
  type AttributeValue = Double | (js.Array[Boolean | Double | String]) | Boolean | String | NamedAttrMap
  
  type DataId = js.Object
  
  @js.native
  trait GradConfig extends StObject {
    
    def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
    def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
    @JSName("gradFunc")
    var gradFunc_Original: GradFunc = js.native
    
    var inputsToSave: js.UndefOr[js.Array[String]] = js.native
    
    var kernelName: String = js.native
    
    var outputsToSave: js.UndefOr[js.Array[Boolean]] = js.native
    
    var saveAllInputs: js.UndefOr[Boolean] = js.native
  }
  
  type GradFunc = js.Function3[
    /* dy */ Tensor[Rank] | js.Array[Tensor[Rank]], 
    /* saved */ js.Array[Tensor[Rank]], 
    /* attrs */ NamedAttrMap, 
    NamedGradientMap
  ]
  
  @js.native
  trait KernelConfig extends StObject {
    
    var backendName: String = js.native
    
    var disposeFunc: js.UndefOr[KernelDisposeFunc] = js.native
    
    def kernelFunc(params: Attrs): TensorInfo | js.Array[TensorInfo] = js.native
    @JSName("kernelFunc")
    var kernelFunc_Original: KernelFunc = js.native
    
    var kernelName: String = js.native
    
    var setupFunc: js.UndefOr[KernelSetupFunc] = js.native
  }
  
  type KernelDisposeFunc = KernelSetupFunc
  
  type KernelFunc = js.Function1[/* params */ Attrs, TensorInfo | js.Array[TensorInfo]]
  
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, Unit]
  
  @js.native
  trait NamedAttrMap extends /* name */ StringDictionary[Attribute]
  object NamedAttrMap {
    
    @scala.inline
    def apply(): NamedAttrMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedAttrMap]
    }
  }
  
  type NamedTensorInfoMap = StringDictionary[TensorInfo]
  
  @js.native
  trait TensorInfo extends StObject {
    
    var dataId: DataId = js.native
    
    var dtype: DataType = js.native
    
    var shape: js.Array[Double] = js.native
  }
  object TensorInfo {
    
    @scala.inline
    def apply(dataId: DataId, dtype: DataType, shape: js.Array[Double]): TensorInfo = {
      val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorInfo]
    }
    
    @scala.inline
    implicit class TensorInfoMutableBuilder[Self <: TensorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataId(value: DataId): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
}
