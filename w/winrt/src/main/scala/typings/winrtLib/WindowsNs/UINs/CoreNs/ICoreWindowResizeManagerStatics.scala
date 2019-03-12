package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowResizeManagerStatics extends js.Object {
  def getForCurrentView(): CoreWindowResizeManager
}

object ICoreWindowResizeManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => CoreWindowResizeManager): ICoreWindowResizeManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
  
    __obj.asInstanceOf[ICoreWindowResizeManagerStatics]
  }
}

