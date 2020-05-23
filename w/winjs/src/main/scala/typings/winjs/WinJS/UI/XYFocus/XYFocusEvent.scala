package typings.winjs.WinJS.UI.XYFocus

import typings.std.CustomEvent
import typings.winjs.anon.KeyCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XYFocusEvent
  extends CustomEvent[js.Any] {
  @JSName("detail")
  var detail_XYFocusEvent: KeyCode = js.native
}

