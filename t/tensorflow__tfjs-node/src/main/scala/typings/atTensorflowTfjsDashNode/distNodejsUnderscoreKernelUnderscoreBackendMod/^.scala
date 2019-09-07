package typings.atTensorflowTfjsDashNode.distNodejsUnderscoreKernelUnderscoreBackendMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashNode.Anon_Name
import typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFEOpAttr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/nodejs_kernel_backend", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTensorsTypeOpAttr(attrName: String, tensors: js.Array[Tensor[Rank]]): Anon_Name = js.native
  def createTensorsTypeOpAttr(attrName: String, tensors: Tensor[Rank]): Anon_Name = js.native
  def createTypeOpAttr(attrName: String, dtype: DataType): TFEOpAttr = js.native
  def ensureTensorflowBackend(): Unit = js.native
  def getTFDType(dataType: DataType): Double = js.native
  def nodeBackend(): NodeJSKernelBackend = js.native
}

