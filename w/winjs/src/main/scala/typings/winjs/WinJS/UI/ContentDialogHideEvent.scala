package typings.winjs.WinJS.UI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event object associated with hiding a dialog.
  **/
@js.native
trait ContentDialogHideEvent extends Event {
  var detail: ContentDialogHideInfo = js.native
}

