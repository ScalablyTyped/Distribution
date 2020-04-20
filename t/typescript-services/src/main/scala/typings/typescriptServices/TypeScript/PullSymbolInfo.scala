package typings.typescriptServices.TypeScript

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
    val __obj = js.Dynamic.literal(aliasSymbol = aliasSymbol.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullSymbolInfo]
  }
}

