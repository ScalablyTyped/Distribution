package typings
package atTensorflowTfjsDashNodeLib.distTfjsUnderscoreBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TFJSBinding extends js.Object {
  var TFEOpAttr: org.scalablytyped.runtime.Instantiable0[TFEOpAttr] = js.native
  var TF_ATTR_BOOL: scala.Double = js.native
  var TF_ATTR_FLOAT: scala.Double = js.native
  var TF_ATTR_INT: scala.Double = js.native
  var TF_ATTR_RESOURCE: scala.Double = js.native
  var TF_ATTR_SHAPE: scala.Double = js.native
  var TF_ATTR_STRING: scala.Double = js.native
  var TF_ATTR_TYPE: scala.Double = js.native
  var TF_BOOL: scala.Double = js.native
  var TF_COMPLEX64: scala.Double = js.native
  var TF_FLOAT: scala.Double = js.native
  var TF_INT32: scala.Double = js.native
  var TF_INT64: scala.Double = js.native
  var TF_RESOURCE: scala.Double = js.native
  var TF_STRING: scala.Double = js.native
  var TF_Version: java.lang.String = js.native
  var TensorMetadata: org.scalablytyped.runtime.Instantiable0[TensorMetadata] = js.native
  def createTensor(shape: js.Array[scala.Double], dtype: scala.Double, buffer: stdLib.Float32Array): scala.Double = js.native
  def createTensor(shape: js.Array[scala.Double], dtype: scala.Double, buffer: stdLib.Int32Array): scala.Double = js.native
  def createTensor(shape: js.Array[scala.Double], dtype: scala.Double, buffer: stdLib.Uint8Array): scala.Double = js.native
  def deleteTensor(tensorId: scala.Double): scala.Unit = js.native
  def executeOp(
    opName: java.lang.String,
    opAttrs: js.Array[TFEOpAttr],
    inputTensorIds: js.Array[scala.Double],
    numOutputs: scala.Double
  ): js.Array[TensorMetadata] = js.native
  def tensorDataSync(tensorId: scala.Double): stdLib.Float32Array | stdLib.Int32Array | stdLib.Uint8Array = js.native
}

