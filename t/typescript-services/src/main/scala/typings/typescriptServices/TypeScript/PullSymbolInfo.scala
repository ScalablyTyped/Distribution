package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullSymbolInfo extends StObject {
  
  var aliasSymbol: PullTypeAliasSymbol
  
  var ast: AST
  
  var enclosingScopeSymbol: PullSymbol
  
  var symbol: PullSymbol
}
object PullSymbolInfo {
  
  inline def apply(aliasSymbol: PullTypeAliasSymbol, ast: AST, enclosingScopeSymbol: PullSymbol, symbol: PullSymbol): PullSymbolInfo = {
    val __obj = js.Dynamic.literal(aliasSymbol = aliasSymbol.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullSymbolInfo]
  }
  
  extension [Self <: PullSymbolInfo](x: Self) {
    
    inline def setAliasSymbol(value: PullTypeAliasSymbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setEnclosingScopeSymbol(value: PullSymbol): Self = StObject.set(x, "enclosingScopeSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: PullSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
