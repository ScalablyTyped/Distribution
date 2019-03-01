package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreCursor extends js.Object {
  var id: scala.Double
  var `type`: CoreCursorType
}

object ICoreCursor {
  @scala.inline
  def apply(id: scala.Double, `type`: CoreCursorType): ICoreCursor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ICoreCursor]
  }
}

