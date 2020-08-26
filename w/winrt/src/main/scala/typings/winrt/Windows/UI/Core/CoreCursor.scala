package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreCursor extends ICoreCursor

object CoreCursor {
  @scala.inline
  def apply(id: Double, `type`: CoreCursorType): CoreCursor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreCursor]
  }
}

