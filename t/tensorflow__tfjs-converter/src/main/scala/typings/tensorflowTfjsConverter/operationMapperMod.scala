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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMapperMod {
  
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
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "decodeBase64")
  @js.native
  def decodeBase64(text: String): String = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getBoolArrayParam")
  @js.native
  def getBoolArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Boolean]): js.Array[Boolean] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getBoolParam")
  @js.native
  def getBoolParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Boolean): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getDtypeArrayParam")
  @js.native
  def getDtypeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[DataType]): js.Array[DataType] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getDtypeParam")
  @js.native
  def getDtypeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: DataType): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getFuncParam")
  @js.native
  def getFuncParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getNumberParam")
  @js.native
  def getNumberParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getNumericArrayParam")
  @js.native
  def getNumericArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getStringArrayParam")
  @js.native
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String]): js.Array[String] = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getStringArrayParam")
  @js.native
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String], keepCase: Boolean): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getStringParam")
  @js.native
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getStringParam")
  @js.native
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String, keepCase: Boolean): String = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getTensorShapeArrayParam")
  @js.native
  def getTensorShapeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getTensorShapeParam")
  @js.native
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String): js.UndefOr[js.Array[Double]] = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "getTensorShapeParam")
  @js.native
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.UndefOr[js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "parseDtypeParam")
  @js.native
  def parseDtypeParam(value: String): DataType = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "parseDtypeParam")
  @js.native
  def parseDtypeParam(value: typings.tensorflowTfjsConverter.compiledApiMod.DataType): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "parseStringParam")
  @js.native
  def parseStringParam(s: String, keepCase: Boolean): String = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "parseStringParam")
  @js.native
  def parseStringParam(s: js.Array[js.Any], keepCase: Boolean): String = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "parseTensorShapeParam")
  @js.native
  def parseTensorShapeParam(shape: ITensorShape): js.UndefOr[js.Array[Double]] = js.native
}
