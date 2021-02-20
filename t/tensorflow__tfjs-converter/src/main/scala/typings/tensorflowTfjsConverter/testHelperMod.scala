package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.InputParamValue
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.operationsTypesMod.OpMapper
import typings.tensorflowTfjsConverter.operationsTypesMod.ParamValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testHelperMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createBoolAttr")
  @js.native
  def createBoolAttr(value: Boolean): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createDtypeAttr")
  @js.native
  def createDtypeAttr(dtype: String): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createNumberAttr")
  @js.native
  def createNumberAttr(value: Double): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createNumberAttrFromIndex")
  @js.native
  def createNumberAttrFromIndex(inputIndex: Double): InputParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createNumericArrayAttr")
  @js.native
  def createNumericArrayAttr(value: js.Array[Double]): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createNumericArrayAttrFromIndex")
  @js.native
  def createNumericArrayAttrFromIndex(inputIndex: Double): InputParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createShapeAttrFromIndex")
  @js.native
  def createShapeAttrFromIndex(inputIndex: Double): InputParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createStrArrayAttr")
  @js.native
  def createStrArrayAttr(strs: js.Array[String]): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createStrAttr")
  @js.native
  def createStrAttr(str: String): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createTensorAttr")
  @js.native
  def createTensorAttr(index: Double): InputParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createTensorShapeAttr")
  @js.native
  def createTensorShapeAttr(value: js.Array[Double]): ParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "createTensorsAttr")
  @js.native
  def createTensorsAttr(index: Double, paramLength: Double): InputParamValue = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "validateParam")
  @js.native
  def validateParam(node: Node, opMappers: js.Array[OpMapper]): Boolean = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", "validateParam")
  @js.native
  def validateParam(node: Node, opMappers: js.Array[OpMapper], tfOpName: String): Boolean = js.native
}
