package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullSymbolInfo extends js.Object {
  var aliasSymbol: PullTypeAliasSymbol
  var ast: AST
  var enclosingScopeSymbol: PullSymbol
  var symbol: PullSymbol
}

object PullSymbolInfo {
  @scala.inline
  def apply(aliasSymbol: PullTypeAliasSymbol, ast: AST, enclosingScopeSymbol: PullSymbol, symbol: PullSymbol): PullSymbolInfo = {
    val __obj = js.Dynamic.literal(aliasSymbol = aliasSymbol, ast = ast, enclosingScopeSymbol = enclosingScopeSymbol, symbol = symbol)
  
    __obj.asInstanceOf[PullSymbolInfo]
  }
}

