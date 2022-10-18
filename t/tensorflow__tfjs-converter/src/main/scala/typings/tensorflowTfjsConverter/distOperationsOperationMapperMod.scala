package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.IAttrValue
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.IGraphDef
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.ITensorShape
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Graph
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsOperationMapperMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper")
  @js.native
  /* private */ open class OperationMapper () extends StObject {
    
    /* private */ var mapArgToTensorInfo: Any = js.native
    
    /* private */ var mapArgsToSignature: Any = js.native
    
    /* private */ var mapFunction: Any = js.native
    
    /* private */ var mapNode: Any = js.native
    
    /* private */ var mapSignatureEntries: Any = js.native
    
    /* private */ var opMappers: Any = js.native
    
    def transformGraph(graph: IGraphDef): Graph = js.native
    def transformGraph(graph: IGraphDef, signature: ISignatureDef): Graph = js.native
  }
  /* static members */
  object OperationMapper {
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-converter/dist/operations/operation_mapper", "OperationMapper._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  }
  
  inline def decodeBase64(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBoolArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Boolean]): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoolArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  inline def getBoolParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoolParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDtypeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[DataType]): js.Array[DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDtypeArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataType]]
  
  inline def getDtypeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: DataType): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDtypeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  inline def getFuncParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFuncParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNumberParam(attrs: StringDictionary[IAttrValue], name: String, `def`: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNumericArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumericArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getStringArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[String], keepCase: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStringParam(attrs: StringDictionary[IAttrValue], name: String, `def`: String, keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTensorShapeArrayParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeArrayParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String): js.UndefOr[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Double]]]
  inline def getTensorShapeParam(attrs: StringDictionary[IAttrValue], name: String, `def`: js.Array[Double]): js.UndefOr[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTensorShapeParam")(attrs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  inline def parseDtypeParam(value: String): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDtypeParam")(value.asInstanceOf[js.Any]).asInstanceOf[DataType]
  inline def parseDtypeParam(value: typings.tensorflowTfjsConverter.distDataCompiledApiMod.DataType): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDtypeParam")(value.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  inline def parseStringParam(s: String, keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringParam")(s.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseStringParam(s: js.Array[Any], keepCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringParam")(s.asInstanceOf[js.Any], keepCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseTensorShapeParam(shape: ITensorShape): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTensorShapeParam")(shape.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
}
