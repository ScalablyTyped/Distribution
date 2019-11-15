package typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod

import org.scalablytyped.runtime.Instantiable0
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFJSBinding extends js.Object {
  var TFEOpAttr: Instantiable0[typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TFEOpAttr]
  var TF_ATTR_BOOL: Double
  var TF_ATTR_FLOAT: Double
  var TF_ATTR_INT: Double
  var TF_ATTR_RESOURCE: Double
  var TF_ATTR_SHAPE: Double
  var TF_ATTR_STRING: Double
  var TF_ATTR_TYPE: Double
  var TF_BOOL: Double
  var TF_COMPLEX64: Double
  var TF_FLOAT: Double
  var TF_INT32: Double
  var TF_INT64: Double
  var TF_RESOURCE: Double
  var TF_STRING: Double
  var TF_UINT8: Double
  var TF_Version: String
  var TensorMetadata: Instantiable0[typings.atTensorflowTfjsDashNode.distTfjsUnderscoreBindingMod.TensorMetadata]
  def createTensor(shape: js.Array[Double], dtype: Double, buffer: BackendValues): Double
  def deleteSavedModel(savedModelId: Double): Unit
  def deleteTensor(tensorId: Double): Unit
  def executeOp(opName: String, opAttrs: js.Array[TFEOpAttr], inputTensorIds: js.Array[Double], numOutputs: Double): js.Array[TensorMetadata]
  def isUsingGpuDevice(): Boolean
  def loadSavedModel(exportDir: String, tags: String): Double
  def runSavedModel(
    savedModelId: Double,
    inputTensorIds: js.Array[Double],
    inputOpNames: String,
    outputOpNames: String
  ): js.Array[TensorMetadata]
  def tensorDataSync(tensorId: Double): Float32Array | Int32Array | Uint8Array
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
    isUsingGpuDevice: () => Boolean,
    loadSavedModel: (String, String) => Double,
    runSavedModel: (Double, js.Array[Double], String, String) => js.Array[TensorMetadata],
    tensorDataSync: Double => Float32Array | Int32Array | Uint8Array
  ): TFJSBinding = {
    val __obj = js.Dynamic.literal(TFEOpAttr = TFEOpAttr, TF_ATTR_BOOL = TF_ATTR_BOOL, TF_ATTR_FLOAT = TF_ATTR_FLOAT, TF_ATTR_INT = TF_ATTR_INT, TF_ATTR_RESOURCE = TF_ATTR_RESOURCE, TF_ATTR_SHAPE = TF_ATTR_SHAPE, TF_ATTR_STRING = TF_ATTR_STRING, TF_ATTR_TYPE = TF_ATTR_TYPE, TF_BOOL = TF_BOOL, TF_COMPLEX64 = TF_COMPLEX64, TF_FLOAT = TF_FLOAT, TF_INT32 = TF_INT32, TF_INT64 = TF_INT64, TF_RESOURCE = TF_RESOURCE, TF_STRING = TF_STRING, TF_UINT8 = TF_UINT8, TF_Version = TF_Version, TensorMetadata = TensorMetadata, createTensor = js.Any.fromFunction3(createTensor), deleteSavedModel = js.Any.fromFunction1(deleteSavedModel), deleteTensor = js.Any.fromFunction1(deleteTensor), executeOp = js.Any.fromFunction4(executeOp), isUsingGpuDevice = js.Any.fromFunction0(isUsingGpuDevice), loadSavedModel = js.Any.fromFunction2(loadSavedModel), runSavedModel = js.Any.fromFunction4(runSavedModel), tensorDataSync = js.Any.fromFunction1(tensorDataSync))
  
    __obj.asInstanceOf[TFJSBinding]
  }
}

