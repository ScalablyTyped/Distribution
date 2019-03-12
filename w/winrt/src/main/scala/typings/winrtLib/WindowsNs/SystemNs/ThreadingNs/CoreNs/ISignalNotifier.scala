package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignalNotifier extends js.Object {
  def enable(): scala.Unit
  def terminate(): scala.Unit
}

object ISignalNotifier {
  @scala.inline
  def apply(enable: () => scala.Unit, terminate: () => scala.Unit): ISignalNotifier = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[ISignalNotifier]
  }
}

