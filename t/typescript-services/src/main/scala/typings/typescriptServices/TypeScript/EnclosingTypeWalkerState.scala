package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnclosingTypeWalkerState extends js.Object {
  var _currentSymbols: js.Array[PullSymbol] = js.native
  var _hasSetEnclosingType: Boolean = js.native
}

object EnclosingTypeWalkerState {
  @scala.inline
  def apply(_currentSymbols: js.Array[PullSymbol], _hasSetEnclosingType: Boolean): EnclosingTypeWalkerState = {
    val __obj = js.Dynamic.literal(_currentSymbols = _currentSymbols.asInstanceOf[js.Any], _hasSetEnclosingType = _hasSetEnclosingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosingTypeWalkerState]
  }
  @scala.inline
  implicit class EnclosingTypeWalkerStateOps[Self <: EnclosingTypeWalkerState] (val x: Self) extends AnyVal {
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
    def set_currentSymbolsVarargs(value: PullSymbol*): Self = this.set("_currentSymbols", js.Array(value :_*))
    @scala.inline
    def set_currentSymbols(value: js.Array[PullSymbol]): Self = this.set("_currentSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def set_hasSetEnclosingType(value: Boolean): Self = this.set("_hasSetEnclosingType", value.asInstanceOf[js.Any])
  }
  
}

