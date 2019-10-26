package typings.atTensorflowTfjsDashCore.distKernelUnderscoreRegistryMod

import typings.atTensorflowTfjsDashCore.Anon_Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelConfig extends js.Object {
  var backendName: String = js.native
  var disposeFunc: js.UndefOr[KernelDisposeFunc] = js.native
  @JSName("kernelFunc")
  var kernelFunc_Original: KernelFunc = js.native
  var kernelName: String = js.native
  var setupFunc: js.UndefOr[KernelSetupFunc] = js.native
  def kernelFunc(params: Anon_Attrs): TensorInfo | js.Array[TensorInfo] = js.native
}

