package typings.webpackDevServer

import typings.std.Record
import typings.webpackDevServer.webpackDevServerStrings.RegExp
import typings.webpackDevServer.webpackDevServerStrings.`enum`
import typings.webpackDevServer.webpackDevServerStrings.boolean
import typings.webpackDevServer.webpackDevServerStrings.number
import typings.webpackDevServer.webpackDevServerStrings.path
import typings.webpackDevServer.webpackDevServerStrings.reset
import typings.webpackDevServer.webpackDevServerStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processArgumentsMod {
  
  /**
    * @param {Record<string, Argument>} args object of arguments
    * @param {any} config configuration
    * @param {Record<string, string | number | boolean | RegExp | (string | number | boolean | RegExp)[]>} values object with values
    * @returns {Problem[] | null} problems or null for success
    */
  inline def apply(
    args: Record[String, Argument],
    config: Any,
    values: Record[
      String, 
      String | Double | Boolean | js.RegExp | (js.Array[String | Double | Boolean | js.RegExp])
    ]
  ): js.Array[Problem] | Null = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[Problem] | Null]
  
  @JSImport("webpack-dev-server/types/bin/process-arguments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Argument extends StObject {
    
    var configs: js.Array[ArgumentConfig]
    
    var description: String
    
    var multiple: Boolean
    
    var simpleType: string | number | boolean
  }
  object Argument {
    
    inline def apply(
      configs: js.Array[ArgumentConfig],
      description: String,
      multiple: Boolean,
      simpleType: string | number | boolean
    ): Argument = {
      val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], simpleType = simpleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    extension [Self <: Argument](x: Self) {
      
      inline def setConfigs(value: js.Array[ArgumentConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsVarargs(value: ArgumentConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setSimpleType(value: string | number | boolean): Self = StObject.set(x, "simpleType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArgumentConfig extends StObject {
    
    var description: String
    
    var multiple: Boolean
    
    var path: String
    
    var `type`: `enum` | string | path | number | boolean | RegExp | reset
    
    var values: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ArgumentConfig {
    
    inline def apply(
      description: String,
      multiple: Boolean,
      path: String,
      `type`: `enum` | string | path | number | boolean | RegExp | reset
    ): ArgumentConfig = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentConfig]
    }
    
    extension [Self <: ArgumentConfig](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: `enum` | string | path | number | boolean | RegExp | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait LocalProblem extends StObject {
    
    var expected: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var `type`: ProblemType
  }
  object LocalProblem {
    
    inline def apply(path: String, `type`: ProblemType): LocalProblem = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalProblem]
    }
    
    extension [Self <: LocalProblem](x: Self) {
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProblemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Problem extends StObject {
    
    var argument: String
    
    var expected: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var path: String
    
    var `type`: ProblemType
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Problem {
    
    inline def apply(argument: String, path: String, `type`: ProblemType): Problem = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Problem]
    }
    
    extension [Self <: Problem](x: Self) {
      
      inline def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProblemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackDevServer.webpackDevServerStrings.`unknown-argument`
    - typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-array-in-path`
    - typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-object-in-path`
    - typings.webpackDevServer.webpackDevServerStrings.`multiple-values-unexpected`
    - typings.webpackDevServer.webpackDevServerStrings.`invalid-value`
  */
  trait ProblemType extends StObject
  object ProblemType {
    
    inline def `invalid-value`: typings.webpackDevServer.webpackDevServerStrings.`invalid-value` = "invalid-value".asInstanceOf[typings.webpackDevServer.webpackDevServerStrings.`invalid-value`]
    
    inline def `multiple-values-unexpected`: typings.webpackDevServer.webpackDevServerStrings.`multiple-values-unexpected` = "multiple-values-unexpected".asInstanceOf[typings.webpackDevServer.webpackDevServerStrings.`multiple-values-unexpected`]
    
    inline def `unexpected-non-array-in-path`: typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-array-in-path` = "unexpected-non-array-in-path".asInstanceOf[typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-array-in-path`]
    
    inline def `unexpected-non-object-in-path`: typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-object-in-path` = "unexpected-non-object-in-path".asInstanceOf[typings.webpackDevServer.webpackDevServerStrings.`unexpected-non-object-in-path`]
    
    inline def `unknown-argument`: typings.webpackDevServer.webpackDevServerStrings.`unknown-argument` = "unknown-argument".asInstanceOf[typings.webpackDevServer.webpackDevServerStrings.`unknown-argument`]
  }
}
