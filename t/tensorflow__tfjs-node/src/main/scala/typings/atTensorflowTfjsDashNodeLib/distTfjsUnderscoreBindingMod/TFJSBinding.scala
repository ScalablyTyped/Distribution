package typings
package atTensorflowTfjsDashNodeLib.distTfjsUnderscoreBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFJSBinding extends js.Object {
  var TFEOpAttr: org.scalablytyped.runtime.Instantiable0[TFEOpAttr]
  var TF_ATTR_BOOL: scala.Double
  var TF_ATTR_FLOAT: scala.Double
  var TF_ATTR_INT: scala.Double
  var TF_ATTR_RESOURCE: scala.Double
  var TF_ATTR_SHAPE: scala.Double
  var TF_ATTR_STRING: scala.Double
  var TF_ATTR_TYPE: scala.Double
  var TF_BOOL: scala.Double
  var TF_COMPLEX64: scala.Double
  var TF_FLOAT: scala.Double
  var TF_INT32: scala.Double
  var TF_INT64: scala.Double
  var TF_RESOURCE: scala.Double
  var TF_STRING: scala.Double
  var TF_UINT8: scala.Double
  var TF_Version: java.lang.String
  var TensorMetadata: org.scalablytyped.runtime.Instantiable0[TensorMetadata]
  def createTensor(
    shape: js.Array[scala.Double],
    dtype: scala.Double,
    buffer: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues
  ): scala.Double
  def deleteTensor(tensorId: scala.Double): scala.Unit
  def executeOp(
    opName: java.lang.String,
    opAttrs: js.Array[TFEOpAttr],
    inputTensorIds: js.Array[scala.Double],
    numOutputs: scala.Double
  ): js.Array[TensorMetadata]
  def tensorDataSync(tensorId: scala.Double): stdLib.Float32Array | stdLib.Int32Array | stdLib.Uint8Array
}

object TFJSBinding {
  @scala.inline
  def apply(
    TFEOpAttr: org.scalablytyped.runtime.Instantiable0[TFEOpAttr],
    TF_ATTR_BOOL: scala.Double,
    TF_ATTR_FLOAT: scala.Double,
    TF_ATTR_INT: scala.Double,
    TF_ATTR_RESOURCE: scala.Double,
    TF_ATTR_SHAPE: scala.Double,
    TF_ATTR_STRING: scala.Double,
    TF_ATTR_TYPE: scala.Double,
    TF_BOOL: scala.Double,
    TF_COMPLEX64: scala.Double,
    TF_FLOAT: scala.Double,
    TF_INT32: scala.Double,
    TF_INT64: scala.Double,
    TF_RESOURCE: scala.Double,
    TF_STRING: scala.Double,
    TF_UINT8: scala.Double,
    TF_Version: java.lang.String,
    TensorMetadata: org.scalablytyped.runtime.Instantiable0[TensorMetadata],
    createTensor: (js.Array[scala.Double], scala.Double, atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues) => scala.Double,
    deleteTensor: scala.Double => scala.Unit,
    executeOp: (java.lang.String, js.Array[TFEOpAttr], js.Array[scala.Double], scala.Double) => js.Array[TensorMetadata],
    tensorDataSync: scala.Double => stdLib.Float32Array | stdLib.Int32Array | stdLib.Uint8Array
  ): TFJSBinding = {
    val __obj = js.Dynamic.literal(TFEOpAttr = TFEOpAttr, TF_ATTR_BOOL = TF_ATTR_BOOL, TF_ATTR_FLOAT = TF_ATTR_FLOAT, TF_ATTR_INT = TF_ATTR_INT, TF_ATTR_RESOURCE = TF_ATTR_RESOURCE, TF_ATTR_SHAPE = TF_ATTR_SHAPE, TF_ATTR_STRING = TF_ATTR_STRING, TF_ATTR_TYPE = TF_ATTR_TYPE, TF_BOOL = TF_BOOL, TF_COMPLEX64 = TF_COMPLEX64, TF_FLOAT = TF_FLOAT, TF_INT32 = TF_INT32, TF_INT64 = TF_INT64, TF_RESOURCE = TF_RESOURCE, TF_STRING = TF_STRING, TF_UINT8 = TF_UINT8, TF_Version = TF_Version, TensorMetadata = TensorMetadata, createTensor = js.Any.fromFunction3(createTensor), deleteTensor = js.Any.fromFunction1(deleteTensor), executeOp = js.Any.fromFunction4(executeOp), tensorDataSync = js.Any.fromFunction1(tensorDataSync))
  
    __obj.asInstanceOf[TFJSBinding]
  }
}

