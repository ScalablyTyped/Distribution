package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationExit extends js.Object {
  var onexiting: js.Any
  def exit(): scala.Unit
}

object ICoreApplicationExit {
  @scala.inline
  def apply(exit: () => scala.Unit, onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), onexiting = onexiting)
  
    __obj.asInstanceOf[ICoreApplicationExit]
  }
}

