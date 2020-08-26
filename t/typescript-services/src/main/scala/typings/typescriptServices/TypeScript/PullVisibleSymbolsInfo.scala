package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullVisibleSymbolsInfo extends js.Object {
  var enclosingScopeSymbol: PullSymbol = js.native
  var symbols: js.Array[PullSymbol] = js.native
}

object PullVisibleSymbolsInfo {
  @scala.inline
  def apply(enclosingScopeSymbol: PullSymbol, symbols: js.Array[PullSymbol]): PullVisibleSymbolsInfo = {
    val __obj = js.Dynamic.literal(enclosingScopeSymbol = enclosingScopeSymbol.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullVisibleSymbolsInfo]
  }
  @scala.inline
  implicit class PullVisibleSymbolsInfoOps[Self <: PullVisibleSymbolsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnclosingScopeSymbol(value: PullSymbol): Self = this.set("enclosingScopeSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolsVarargs(value: PullSymbol*): Self = this.set("symbols", js.Array(value :_*))
    @scala.inline
    def setSymbols(value: js.Array[PullSymbol]): Self = this.set("symbols", value.asInstanceOf[js.Any])
  }
  
}

