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
  def apply(exit: js.Function0[scala.Unit], onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exit")(exit)
    __obj.updateDynamic("onexiting")(onexiting)
    __obj.asInstanceOf[ICoreApplicationExit]
  }
}

