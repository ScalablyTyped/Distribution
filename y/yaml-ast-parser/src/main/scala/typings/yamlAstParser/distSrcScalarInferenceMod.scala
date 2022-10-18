package typings.yamlAstParser

import typings.yamlAstParser.distSrcYamlASTMod.YAMLScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcScalarInferenceMod {
  
  @JSImport("yaml-ast-parser/dist/src/scalarInference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ScalarType extends StObject
  @JSImport("yaml-ast-parser/dist/src/scalarInference", "ScalarType")
  @js.native
  object ScalarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScalarType & Double] = js.native
    
    @js.native
    sealed trait bool
      extends StObject
         with ScalarType
    /* 1 */ val bool: typings.yamlAstParser.distSrcScalarInferenceMod.ScalarType.bool & Double = js.native
    
    @js.native
    sealed trait float
      extends StObject
         with ScalarType
    /* 3 */ val float: typings.yamlAstParser.distSrcScalarInferenceMod.ScalarType.float & Double = js.native
    
    @js.native
    sealed trait int
      extends StObject
         with ScalarType
    /* 2 */ val int: typings.yamlAstParser.distSrcScalarInferenceMod.ScalarType.int & Double = js.native
    
    @js.native
    sealed trait `null`
      extends StObject
         with ScalarType
    /* 0 */ val `null`: typings.yamlAstParser.distSrcScalarInferenceMod.ScalarType.`null` & Double = js.native
    
    @js.native
    sealed trait string
      extends StObject
         with ScalarType
    /* 4 */ val string: typings.yamlAstParser.distSrcScalarInferenceMod.ScalarType.string & Double = js.native
  }
  
  inline def determineScalarType(node: YAMLScalar): ScalarType = ^.asInstanceOf[js.Dynamic].applyDynamic("determineScalarType")(node.asInstanceOf[js.Any]).asInstanceOf[ScalarType]
  
  inline def parseYamlBoolean(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlBoolean")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseYamlFloat(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlFloat")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseYamlInteger(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYamlInteger")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
}
