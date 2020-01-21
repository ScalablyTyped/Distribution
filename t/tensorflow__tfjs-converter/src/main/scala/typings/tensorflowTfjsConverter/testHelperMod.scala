package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.InputParamValue
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.operationsTypesMod.OpMapper
import typings.tensorflowTfjsConverter.operationsTypesMod.ParamValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/test_helper", JSImport.Namespace)
@js.native
object testHelperMod extends js.Object {
  def createBoolAttr(value: Boolean): ParamValue = js.native
  def createDtypeAttr(dtype: String): ParamValue = js.native
  def createNumberAttr(value: Double): ParamValue = js.native
  def createNumberAttrFromIndex(inputIndex: Double): InputParamValue = js.native
  def createNumericArrayAttr(value: js.Array[Double]): ParamValue = js.native
  def createNumericArrayAttrFromIndex(inputIndex: Double): InputParamValue = js.native
  def createStrArrayAttr(strs: js.Array[String]): ParamValue = js.native
  def createStrAttr(str: String): ParamValue = js.native
  def createTensorAttr(index: Double): InputParamValue = js.native
  def createTensorShapeAttr(value: js.Array[Double]): ParamValue = js.native
  def createTensorsAttr(index: Double, paramLength: Double): InputParamValue = js.native
  def validateParam(node: Node, opMappers: js.Array[OpMapper]): Boolean = js.native
  def validateParam(node: Node, opMappers: js.Array[OpMapper], tfOpName: String): Boolean = js.native
}

