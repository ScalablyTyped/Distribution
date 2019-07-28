package typings.winrt.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClosable extends js.Object {
  def close(): Unit
}

object IClosable {
  @scala.inline
  def apply(close: () => Unit): IClosable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[IClosable]
  }
}

