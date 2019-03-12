package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowResizeManager extends js.Object {
  def notifyLayoutCompleted(): scala.Unit
}

object ICoreWindowResizeManager {
  @scala.inline
  def apply(notifyLayoutCompleted: () => scala.Unit): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
  
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
}

