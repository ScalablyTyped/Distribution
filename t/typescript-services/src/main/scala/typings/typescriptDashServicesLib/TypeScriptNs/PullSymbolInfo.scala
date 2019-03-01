package typings
package typescriptDashServicesLib.TypeScriptNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliasSymbol")(aliasSymbol)
    __obj.updateDynamic("ast")(ast)
    __obj.updateDynamic("enclosingScopeSymbol")(enclosingScopeSymbol)
    __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[PullSymbolInfo]
  }
}

