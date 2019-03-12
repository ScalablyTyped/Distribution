package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClosable extends js.Object {
  def close(): scala.Unit
}

object IClosable {
  @scala.inline
  def apply(close: () => scala.Unit): IClosable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[IClosable]
  }
}

