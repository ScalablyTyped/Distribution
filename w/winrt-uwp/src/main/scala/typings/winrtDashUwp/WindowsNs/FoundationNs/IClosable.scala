package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a method to release allocated resources. */
trait IClosable extends js.Object {
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
}

object IClosable {
  @scala.inline
  def apply(close: () => Unit): IClosable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[IClosable]
  }
}

