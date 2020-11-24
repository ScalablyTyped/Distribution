package typings.tensorflowTfjsCore.kernelRegistryMod

import typings.tensorflowTfjsCore.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelConfig extends js.Object {
  
  var backendName: String = js.native
  
  var disposeFunc: js.UndefOr[KernelDisposeFunc] = js.native
  
  def kernelFunc(params: Attrs): TensorInfo | js.Array[TensorInfo] = js.native
  @JSName("kernelFunc")
  var kernelFunc_Original: KernelFunc = js.native
  
  var kernelName: String = js.native
  
  var setupFunc: js.UndefOr[KernelSetupFunc] = js.native
}
