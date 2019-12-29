package typings.atTensorflowTfjsDashConverter

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.IAttrValue
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.IGraphDef
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.ISignatureDef
import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.ITensorShape
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Graph
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/operation_mapper", JSImport.Namespace)
@js.native
object distSrcOperationsOperationUnderscoreMapperMod extends js.Object {
  @js.native
  class OperationMapper protected () extends js.Object {
    var mapNode: js.Any = js.native
    var mapSignatureEntries: js.Any = js.native
    var opMappers: js.Any = js.native
    def transformGraph(graph: IGraphDef): Graph = js.native
    def transformGraph(graph: IGraphDef, signature: ISignatureDef): Graph = js.native
  }
  
  def decodeBase64(text: String): String = js.native
  def getBoolArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Boolean]): js.Array[Boolean] = js.native
  def getBoolParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Boolean): Boolean = js.native
  def getDtypeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[DataType]): js.Array[DataType] = js.native
  def getDtypeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: DataType): DataType = js.native
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
  def parseDtypeParam(value: typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.DataType): DataType = js.native
  def parseStringParam(s: String, keepCase: Boolean): String = js.native
  def parseStringParam(s: js.Array[js.Any], keepCase: Boolean): String = js.native
  def parseTensorShapeParam(shape: ITensorShape): js.UndefOr[js.Array[Double]] = js.native
  /* static members */
  @js.native
  object OperationMapper extends js.Object {
    val Instance: OperationMapper = js.native
    var _instance: js.Any = js.native
  }
  
}

