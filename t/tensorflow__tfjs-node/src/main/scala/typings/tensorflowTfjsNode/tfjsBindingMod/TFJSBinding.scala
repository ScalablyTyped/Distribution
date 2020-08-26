package typings.tensorflowTfjsNode.tfjsBindingMod

import org.scalablytyped.runtime.Instantiable0
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TFJSBinding extends js.Object {
  var TFEOpAttr: Instantiable0[typings.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr] = js.native
  var TF_ATTR_BOOL: Double = js.native
  var TF_ATTR_FLOAT: Double = js.native
  var TF_ATTR_INT: Double = js.native
  var TF_ATTR_RESOURCE: Double = js.native
  var TF_ATTR_SHAPE: Double = js.native
  var TF_ATTR_STRING: Double = js.native
  var TF_ATTR_TYPE: Double = js.native
  var TF_BOOL: Double = js.native
  var TF_COMPLEX64: Double = js.native
  var TF_FLOAT: Double = js.native
  var TF_INT32: Double = js.native
  var TF_INT64: Double = js.native
  var TF_RESOURCE: Double = js.native
  var TF_STRING: Double = js.native
  var TF_UINT8: Double = js.native
  var TF_Version: String = js.native
  var TensorMetadata: Instantiable0[typings.tensorflowTfjsNode.tfjsBindingMod.TensorMetadata] = js.native
  def createTensor(shape: js.Array[Double], dtype: Double, buffer: BackendValues): Double = js.native
  def deleteSavedModel(savedModelId: Double): Unit = js.native
  def deleteTensor(tensorId: Double): Unit = js.native
  def executeOp(opName: String, opAttrs: js.Array[TFEOpAttr], inputTensorIds: js.Array[Double], numOutputs: Double): js.Array[TensorMetadata] = js.native
  def getNumOfSavedModels(): Double = js.native
  def isUsingGpuDevice(): Boolean = js.native
  def loadSavedModel(exportDir: String, tags: String): Double = js.native
  def runSavedModel(
    savedModelId: Double,
    inputTensorIds: js.Array[Double],
    inputOpNames: String,
    outputOpNames: String
  ): js.Array[TensorMetadata] = js.native
  def tensorDataSync(tensorId: Double): Float32Array | Int32Array | Uint8Array = js.native
}

object TFJSBinding {
  @scala.inline
  def apply(
    TFEOpAttr: Instantiable0[TFEOpAttr],
    TF_ATTR_BOOL: Double,
    TF_ATTR_FLOAT: Double,
    TF_ATTR_INT: Double,
    TF_ATTR_RESOURCE: Double,
    TF_ATTR_SHAPE: Double,
    TF_ATTR_STRING: Double,
    TF_ATTR_TYPE: Double,
    TF_BOOL: Double,
    TF_COMPLEX64: Double,
    TF_FLOAT: Double,
    TF_INT32: Double,
    TF_INT64: Double,
    TF_RESOURCE: Double,
    TF_STRING: Double,
    TF_UINT8: Double,
    TF_Version: String,
    TensorMetadata: Instantiable0[TensorMetadata],
    createTensor: (js.Array[Double], Double, BackendValues) => Double,
    deleteSavedModel: Double => Unit,
    deleteTensor: Double => Unit,
    executeOp: (String, js.Array[TFEOpAttr], js.Array[Double], Double) => js.Array[TensorMetadata],
    getNumOfSavedModels: () => Double,
    isUsingGpuDevice: () => Boolean,
    loadSavedModel: (String, String) => Double,
    runSavedModel: (Double, js.Array[Double], String, String) => js.Array[TensorMetadata],
    tensorDataSync: Double => Float32Array | Int32Array | Uint8Array
  ): TFJSBinding = {
    val __obj = js.Dynamic.literal(TFEOpAttr = TFEOpAttr.asInstanceOf[js.Any], TF_ATTR_BOOL = TF_ATTR_BOOL.asInstanceOf[js.Any], TF_ATTR_FLOAT = TF_ATTR_FLOAT.asInstanceOf[js.Any], TF_ATTR_INT = TF_ATTR_INT.asInstanceOf[js.Any], TF_ATTR_RESOURCE = TF_ATTR_RESOURCE.asInstanceOf[js.Any], TF_ATTR_SHAPE = TF_ATTR_SHAPE.asInstanceOf[js.Any], TF_ATTR_STRING = TF_ATTR_STRING.asInstanceOf[js.Any], TF_ATTR_TYPE = TF_ATTR_TYPE.asInstanceOf[js.Any], TF_BOOL = TF_BOOL.asInstanceOf[js.Any], TF_COMPLEX64 = TF_COMPLEX64.asInstanceOf[js.Any], TF_FLOAT = TF_FLOAT.asInstanceOf[js.Any], TF_INT32 = TF_INT32.asInstanceOf[js.Any], TF_INT64 = TF_INT64.asInstanceOf[js.Any], TF_RESOURCE = TF_RESOURCE.asInstanceOf[js.Any], TF_STRING = TF_STRING.asInstanceOf[js.Any], TF_UINT8 = TF_UINT8.asInstanceOf[js.Any], TF_Version = TF_Version.asInstanceOf[js.Any], TensorMetadata = TensorMetadata.asInstanceOf[js.Any], createTensor = js.Any.fromFunction3(createTensor), deleteSavedModel = js.Any.fromFunction1(deleteSavedModel), deleteTensor = js.Any.fromFunction1(deleteTensor), executeOp = js.Any.fromFunction4(executeOp), getNumOfSavedModels = js.Any.fromFunction0(getNumOfSavedModels), isUsingGpuDevice = js.Any.fromFunction0(isUsingGpuDevice), loadSavedModel = js.Any.fromFunction2(loadSavedModel), runSavedModel = js.Any.fromFunction4(runSavedModel), tensorDataSync = js.Any.fromFunction1(tensorDataSync))
    __obj.asInstanceOf[TFJSBinding]
  }
  @scala.inline
  implicit class TFJSBindingOps[Self <: TFJSBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTFEOpAttr(value: Instantiable0[TFEOpAttr]): Self = this.set("TFEOpAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_BOOL(value: Double): Self = this.set("TF_ATTR_BOOL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_FLOAT(value: Double): Self = this.set("TF_ATTR_FLOAT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_INT(value: Double): Self = this.set("TF_ATTR_INT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_RESOURCE(value: Double): Self = this.set("TF_ATTR_RESOURCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_SHAPE(value: Double): Self = this.set("TF_ATTR_SHAPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_STRING(value: Double): Self = this.set("TF_ATTR_STRING", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_ATTR_TYPE(value: Double): Self = this.set("TF_ATTR_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_BOOL(value: Double): Self = this.set("TF_BOOL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_COMPLEX64(value: Double): Self = this.set("TF_COMPLEX64", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_FLOAT(value: Double): Self = this.set("TF_FLOAT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_INT32(value: Double): Self = this.set("TF_INT32", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_INT64(value: Double): Self = this.set("TF_INT64", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_RESOURCE(value: Double): Self = this.set("TF_RESOURCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_STRING(value: Double): Self = this.set("TF_STRING", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_UINT8(value: Double): Self = this.set("TF_UINT8", value.asInstanceOf[js.Any])
    @scala.inline
    def setTF_Version(value: String): Self = this.set("TF_Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setTensorMetadata(value: Instantiable0[TensorMetadata]): Self = this.set("TensorMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTensor(value: (js.Array[Double], Double, BackendValues) => Double): Self = this.set("createTensor", js.Any.fromFunction3(value))
    @scala.inline
    def setDeleteSavedModel(value: Double => Unit): Self = this.set("deleteSavedModel", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteTensor(value: Double => Unit): Self = this.set("deleteTensor", js.Any.fromFunction1(value))
    @scala.inline
    def setExecuteOp(value: (String, js.Array[TFEOpAttr], js.Array[Double], Double) => js.Array[TensorMetadata]): Self = this.set("executeOp", js.Any.fromFunction4(value))
    @scala.inline
    def setGetNumOfSavedModels(value: () => Double): Self = this.set("getNumOfSavedModels", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUsingGpuDevice(value: () => Boolean): Self = this.set("isUsingGpuDevice", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadSavedModel(value: (String, String) => Double): Self = this.set("loadSavedModel", js.Any.fromFunction2(value))
    @scala.inline
    def setRunSavedModel(value: (Double, js.Array[Double], String, String) => js.Array[TensorMetadata]): Self = this.set("runSavedModel", js.Any.fromFunction4(value))
    @scala.inline
    def setTensorDataSync(value: Double => Float32Array | Int32Array | Uint8Array): Self = this.set("tensorDataSync", js.Any.fromFunction1(value))
  }
  
}

