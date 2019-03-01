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
  def apply(close: js.Function0[scala.Unit]): IClosable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[IClosable]
  }
}

