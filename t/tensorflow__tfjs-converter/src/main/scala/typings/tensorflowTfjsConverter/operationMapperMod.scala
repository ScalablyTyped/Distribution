package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import typings.tensorflowTfjsConverter.compiledApiMod.IGraphDef
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.compiledApiMod.ITensorShape
import typings.tensorflowTfjsConverter.operationsTypesMod.Graph
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMapperMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper")
  @js.native
  class OperationMapper protected () extends StObject {
    
    var mapArgToTensorInfo: js.Any = js.native
    
    var mapArgsToSignature: js.Any = js.native
    
    var mapFunction: js.Any = js.native
    
    var mapNode: js.Any = js.native
    
    var mapSignatureEntries: js.Any = js.native
    
    var opMappers: js.Any = js.native
    
    def transformGraph(graph: IGraphDef): Graph = js.native
    def transformGraph(graph: IGraphDef, signature: ISignatureDef): Graph = js.native
  }
  /* static members */
  object OperationMapper {
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper.Instance")
    @js.native
    val Instance: OperationMapper = js.native
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def decodeBase64(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBoolArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Boolean]): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoolArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  @scala.inline
  def getBoolParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoolParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getDtypeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[DataType]): js.Array[DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDtypeArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataType]]
  
  @scala.inline
  def getDtypeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: DataType): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDtypeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  @scala.inline
  def getFuncParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFuncParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getNumberParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getNumericArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumericArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String], keepCase: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String, keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTensorShapeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  @scala.inline
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String): js.UndefOr[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Double]]]
  @scala.inline
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.UndefOr[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  @scala.inline
  def parseDtypeParam(value: String): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDtypeParam")(value.asInstanceOf[js.Any]).asInstanceOf[DataType]
  @scala.inline
  def parseDtypeParam(value: typings.tensorflowTfjsConverter.compiledApiMod.DataType): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDtypeParam")(value.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  @scala.inline
  def parseStringParam(s: String, keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringParam")(s.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parseStringParam(s: js.Array[js.Any], keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringParam")(s.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseTensorShapeParam(shape: ITensorShape): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTensorShapeParam")(shape.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
}
