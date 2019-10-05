package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullVisibleSymbolsInfo extends js.Object {
  var enclosingScopeSymbol: PullSymbol
  var symbols: js.Array[PullSymbol]
}

object PullVisibleSymbolsInfo {
  @scala.inline
  def apply(enclosingScopeSymbol: PullSymbol, symbols: js.Array[PullSymbol]): PullVisibleSymbolsInfo = {
    val __obj = js.Dynamic.literal(enclosingScopeSymbol = enclosingScopeSymbol, symbols = symbols)
  
    __obj.asInstanceOf[PullVisibleSymbolsInfo]
  }
}

