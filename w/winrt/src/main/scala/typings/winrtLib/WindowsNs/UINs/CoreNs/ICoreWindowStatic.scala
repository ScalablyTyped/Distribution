package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowStatic extends js.Object {
  def getForCurrentThread(): CoreWindow
}

object ICoreWindowStatic {
  @scala.inline
  def apply(getForCurrentThread: () => CoreWindow): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal(getForCurrentThread = js.Any.fromFunction0(getForCurrentThread))
  
    __obj.asInstanceOf[ICoreWindowStatic]
  }
}

