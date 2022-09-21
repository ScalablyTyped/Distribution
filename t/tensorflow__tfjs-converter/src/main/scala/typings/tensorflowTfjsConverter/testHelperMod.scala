package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.InputParamValue
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.operationsTypesMod.OpMapper
import typings.tensorflowTfjsConverter.operationsTypesMod.ParamValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testHelperMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/executors/test_helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBoolAttr(value: Boolean): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createBoolAttr")(value.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createBooleanArrayAttrFromIndex(inputIndex: Double): InputParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createBooleanArrayAttrFromIndex")(inputIndex.asInstanceOf[js.Any]).asInstanceOf[InputParamValue]
  
  inline def createDtypeAttr(dtype: String): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createDtypeAttr")(dtype.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createNumberAttr(value: Double): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberAttr")(value.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createNumberAttrFromIndex(inputIndex: Double): InputParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberAttrFromIndex")(inputIndex.asInstanceOf[js.Any]).asInstanceOf[InputParamValue]
  
  inline def createNumericArrayAttr(value: js.Array[Double]): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumericArrayAttr")(value.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createNumericArrayAttrFromIndex(inputIndex: Double): InputParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumericArrayAttrFromIndex")(inputIndex.asInstanceOf[js.Any]).asInstanceOf[InputParamValue]
  
  inline def createShapeAttrFromIndex(inputIndex: Double): InputParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createShapeAttrFromIndex")(inputIndex.asInstanceOf[js.Any]).asInstanceOf[InputParamValue]
  
  inline def createStrArrayAttr(strs: js.Array[String]): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createStrArrayAttr")(strs.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createStrAttr(str: String): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createStrAttr")(str.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createTensorAttr(index: Double): InputParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createTensorAttr")(index.asInstanceOf[js.Any]).asInstanceOf[InputParamValue]
  
  inline def createTensorShapeAttr(value: js.Array[Double]): ParamValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createTensorShapeAttr")(value.asInstanceOf[js.Any]).asInstanceOf[ParamValue]
  
  inline def createTensorsAttr(index: Double, paramLength: Double): InputParamValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createTensorsAttr")(index.asInstanceOf[js.Any], paramLength.asInstanceOf[js.Any])).asInstanceOf[InputParamValue]
  
  inline def uncapitalize[Name /* <: String */](name: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uncapitalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateParam(node: Node, opMappers: js.Array[OpMapper]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateParam")(node.asInstanceOf[js.Any], opMappers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateParam(node: Node, opMappers: js.Array[OpMapper], tfOpName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateParam")(node.asInstanceOf[js.Any], opMappers.asInstanceOf[js.Any], tfOpName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
