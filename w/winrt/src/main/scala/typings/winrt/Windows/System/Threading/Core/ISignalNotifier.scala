package typings.winrt.Windows.System.Threading.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignalNotifier extends js.Object {
  def enable(): Unit
  def terminate(): Unit
}

object ISignalNotifier {
  @scala.inline
  def apply(enable: () => Unit, terminate: () => Unit): ISignalNotifier = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[ISignalNotifier]
  }
}

