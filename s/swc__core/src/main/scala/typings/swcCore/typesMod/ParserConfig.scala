package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.TsParserConfig
  - typings.swcCore.typesMod.EsParserConfig
*/
trait ParserConfig extends StObject
object ParserConfig {
  
  inline def EsParserConfig(): typings.swcCore.typesMod.EsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "ecmascript")
    __obj.asInstanceOf[typings.swcCore.typesMod.EsParserConfig]
  }
  
  inline def TsParserConfig(): typings.swcCore.typesMod.TsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "typescript")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsParserConfig]
  }
}
