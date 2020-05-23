package typings.symbolObservable.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  val observable: js.Symbol
}

object SymbolConstructor {
  @scala.inline
  def apply(observable: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolConstructor]
  }
}

