package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensLegend extends StObject {
  
  /**
    * The token modifiers a server uses.
    */
  var tokenModifiers: js.Array[String]
  
  /**
    * The token types a server uses.
    */
  var tokenTypes: js.Array[String]
}
object SemanticTokensLegend {
  
  inline def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): SemanticTokensLegend = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensLegend]
  }
  
  extension [Self <: SemanticTokensLegend](x: Self) {
    
    inline def setTokenModifiers(value: js.Array[String]): Self = StObject.set(x, "tokenModifiers", value.asInstanceOf[js.Any])
    
    inline def setTokenModifiersVarargs(value: String*): Self = StObject.set(x, "tokenModifiers", js.Array(value*))
    
    inline def setTokenTypes(value: js.Array[String]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    inline def setTokenTypesVarargs(value: String*): Self = StObject.set(x, "tokenTypes", js.Array(value*))
  }
}
