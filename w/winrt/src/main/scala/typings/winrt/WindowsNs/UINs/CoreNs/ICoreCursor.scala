package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreCursor extends js.Object {
  var id: Double
  var `type`: CoreCursorType
}

object ICoreCursor {
  @scala.inline
  def apply(id: Double, `type`: CoreCursorType): ICoreCursor = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICoreCursor]
  }
}

