package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a method to release allocated resources. */
trait IClosable extends js.Object {
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): scala.Unit
}

object IClosable {
  @scala.inline
  def apply(close: js.Function0[scala.Unit]): IClosable = {
    val __obj = js.Dynamic.literal(close = close)
  
    __obj.asInstanceOf[IClosable]
  }
}

