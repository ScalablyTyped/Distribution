package typings
package symbolDashObservableLib.symbolDashObservableMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  val observable: js.Symbol
}

object SymbolConstructor {
  @scala.inline
  def apply(observable: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observable")(observable)
    __obj.asInstanceOf[SymbolConstructor]
  }
}

