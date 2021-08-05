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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelRegistryMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/kernel_registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyRegisteredKernels(registeredBackendName: String, newBackendName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyRegisteredKernels")(registeredBackendName.asInstanceOf[js.Any], newBackendName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getGradient(kernelName: String): GradConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getGradient")(kernelName.asInstanceOf[js.Any]).asInstanceOf[GradConfig]
  
  inline def getKernel(kernelName: String, backendName: String): KernelConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getKernel")(kernelName.asInstanceOf[js.Any], backendName.asInstanceOf[js.Any])).asInstanceOf[KernelConfig]
  
  inline def getKernelsForBackend(backendName: String): js.Array[KernelConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKernelsForBackend")(backendName.asInstanceOf[js.Any]).asInstanceOf[js.Array[KernelConfig]]
  
  inline def registerGradient(config: GradConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerGradient")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerKernel(config: KernelConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerKernel")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterGradient(kernelName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterGradient")(kernelName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterKernel(kernelName: String, backendName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterKernel")(kernelName.asInstanceOf[js.Any], backendName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Attribute = AttributeValue | RecursiveArray[AttributeValue]
  
  type AttributeValue = Double | (js.Array[Boolean | Double | String]) | Boolean | String | NamedAttrMap
  
  type DataId = js.Object
  
  trait GradConfig extends StObject {
    
    def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap
    def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap
    @JSName("gradFunc")
    var gradFunc_Original: GradFunc
    
    var inputsToSave: js.UndefOr[js.Array[String]] = js.undefined
    
    var kernelName: String
    
    var outputsToSave: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    var saveAllInputs: js.UndefOr[Boolean] = js.undefined
  }
  object GradConfig {
    
    inline def apply(
      gradFunc: (/* dy */ Tensor[Rank] | js.Array[Tensor[Rank]], /* saved */ js.Array[Tensor[Rank]], /* attrs */ NamedAttrMap) => NamedGradientMap,
      kernelName: String
    ): GradConfig = {
      val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction3(gradFunc), kernelName = kernelName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GradConfig]
    }
    
    extension [Self <: GradConfig](x: Self) {
      
      inline def setGradFunc(
        value: (/* dy */ Tensor[Rank] | js.Array[Tensor[Rank]], /* saved */ js.Array[Tensor[Rank]], /* attrs */ NamedAttrMap) => NamedGradientMap
      ): Self = StObject.set(x, "gradFunc", js.Any.fromFunction3(value))
      
      inline def setInputsToSave(value: js.Array[String]): Self = StObject.set(x, "inputsToSave", value.asInstanceOf[js.Any])
      
      inline def setInputsToSaveUndefined: Self = StObject.set(x, "inputsToSave", js.undefined)
      
      inline def setInputsToSaveVarargs(value: String*): Self = StObject.set(x, "inputsToSave", js.Array(value :_*))
      
      inline def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      inline def setOutputsToSave(value: js.Array[Boolean]): Self = StObject.set(x, "outputsToSave", value.asInstanceOf[js.Any])
      
      inline def setOutputsToSaveUndefined: Self = StObject.set(x, "outputsToSave", js.undefined)
      
      inline def setOutputsToSaveVarargs(value: Boolean*): Self = StObject.set(x, "outputsToSave", js.Array(value :_*))
      
      inline def setSaveAllInputs(value: Boolean): Self = StObject.set(x, "saveAllInputs", value.asInstanceOf[js.Any])
      
      inline def setSaveAllInputsUndefined: Self = StObject.set(x, "saveAllInputs", js.undefined)
    }
  }
  
  type GradFunc = js.Function3[
    /* dy */ Tensor[Rank] | js.Array[Tensor[Rank]], 
    /* saved */ js.Array[Tensor[Rank]], 
    /* attrs */ NamedAttrMap, 
    NamedGradientMap
  ]
  
  trait KernelConfig extends StObject {
    
    var backendName: String
    
    var disposeFunc: js.UndefOr[KernelDisposeFunc] = js.undefined
    
    def kernelFunc(params: Attrs): TensorInfo | js.Array[TensorInfo]
    @JSName("kernelFunc")
    var kernelFunc_Original: KernelFunc
    
    var kernelName: String
    
    var setupFunc: js.UndefOr[KernelSetupFunc] = js.undefined
  }
  object KernelConfig {
    
    inline def apply(
      backendName: String,
      kernelFunc: /* params */ Attrs => TensorInfo | js.Array[TensorInfo],
      kernelName: String
    ): KernelConfig = {
      val __obj = js.Dynamic.literal(backendName = backendName.asInstanceOf[js.Any], kernelFunc = js.Any.fromFunction1(kernelFunc), kernelName = kernelName.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelConfig]
    }
    
    extension [Self <: KernelConfig](x: Self) {
      
      inline def setBackendName(value: String): Self = StObject.set(x, "backendName", value.asInstanceOf[js.Any])
      
      inline def setDisposeFunc(value: /* backend */ js.Object => Unit): Self = StObject.set(x, "disposeFunc", js.Any.fromFunction1(value))
      
      inline def setDisposeFuncUndefined: Self = StObject.set(x, "disposeFunc", js.undefined)
      
      inline def setKernelFunc(value: /* params */ Attrs => TensorInfo | js.Array[TensorInfo]): Self = StObject.set(x, "kernelFunc", js.Any.fromFunction1(value))
      
      inline def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      inline def setSetupFunc(value: /* backend */ js.Object => Unit): Self = StObject.set(x, "setupFunc", js.Any.fromFunction1(value))
      
      inline def setSetupFuncUndefined: Self = StObject.set(x, "setupFunc", js.undefined)
    }
  }
  
  type KernelDisposeFunc = KernelSetupFunc
  
  type KernelFunc = js.Function1[/* params */ Attrs, TensorInfo | js.Array[TensorInfo]]
  
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, Unit]
  
  trait NamedAttrMap
    extends StObject
       with /* name */ StringDictionary[Attribute]
  object NamedAttrMap {
    
    inline def apply(): NamedAttrMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedAttrMap]
    }
  }
  
  type NamedTensorInfoMap = StringDictionary[TensorInfo]
  
  trait TensorInfo extends StObject {
    
    var dataId: DataId
    
    var dtype: DataType
    
    var shape: js.Array[Double]
  }
  object TensorInfo {
    
    inline def apply(dataId: DataId, dtype: DataType, shape: js.Array[Double]): TensorInfo = {
      val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorInfo]
    }
    
    extension [Self <: TensorInfo](x: Self) {
      
      inline def setDataId(value: DataId): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
}
