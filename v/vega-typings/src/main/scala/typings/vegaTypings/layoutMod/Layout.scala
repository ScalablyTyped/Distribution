package typings.vegaTypings.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.signalMod.SignalRef
  - typings.vegaTypings.layoutMod.LayoutParams
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  def SignalRef(signal: String): Layout = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def LayoutParams(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
}

