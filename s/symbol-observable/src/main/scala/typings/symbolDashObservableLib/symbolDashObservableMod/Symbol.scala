package typings
package symbolDashObservableLib.symbolDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.observable)
  val observable: js.Symbol
}

object Symbol {
  @scala.inline
  def apply(observable: js.Symbol): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observable")(observable)
    __obj.asInstanceOf[Symbol]
  }
}

