package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.TsParserConfig
  - typings.swcWasm.mod.EsParserConfig
*/
trait ParserConfig extends StObject
object ParserConfig {
  
  inline def EsParserConfig(): typings.swcWasm.mod.EsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "ecmascript")
    __obj.asInstanceOf[typings.swcWasm.mod.EsParserConfig]
  }
  
  inline def TsParserConfig(): typings.swcWasm.mod.TsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "typescript")
    __obj.asInstanceOf[typings.swcWasm.mod.TsParserConfig]
  }
}
