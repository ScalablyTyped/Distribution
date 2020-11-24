package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import typings.tensorflowTfjsConverter.compiledApiMod.IGraphDef
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.compiledApiMod.ITensorShape
import typings.tensorflowTfjsConverter.operationsTypesMod.Graph
import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", JSImport.Namespace)
@js.native
object operationMapperMod extends js.Object {
  
  def decodeBase64(text: String): String = js.native
  
  def getBoolArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Boolean]): js.Array[Boolean] = js.native
  
  def getBoolParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Boolean): Boolean = js.native
  
  def getDtypeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[DataType]): js.Array[DataType] = js.native
  
  def getDtypeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: DataType): DataType = js.native
  
  def getFuncParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = js.native
  
  def getNumberParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Double): Double = js.native
  
  def getNumericArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.Array[Double] = js.native
  
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String]): js.Array[String] = js.native
  def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String], keepCase: Boolean): js.Array[String] = js.native
  
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = js.native
  def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String, keepCase: Boolean): String = js.native
  
  def getTensorShapeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String): js.UndefOr[js.Array[Double]] = js.native
  def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.UndefOr[js.Array[Double]] = js.native
  
  def parseDtypeParam(value: String): DataType = js.native
  def parseDtypeParam(value: typings.tensorflowTfjsConverter.compiledApiMod.DataType): DataType = js.native
  
  def parseStringParam(s: String, keepCase: Boolean): String = js.native
  def parseStringParam(s: js.Array[js.Any], keepCase: Boolean): String = js.native
  
  def parseTensorShapeParam(shape: ITensorShape): js.UndefOr[js.Array[Double]] = js.native
  
  @js.native
  class OperationMapper protected () extends js.Object {
    
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
  @js.native
  object OperationMapper extends js.Object {
    
    val Instance: OperationMapper = js.native
    
    var _instance: js.Any = js.native
  }
}
