package typings.testingLibraryUserEvent.mod

import typings.std.Event
import typings.std.MouseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadInitArgument extends js.Object {
  var changeInit: js.UndefOr[Event] = js.undefined
  var clickInit: js.UndefOr[MouseEventInit] = js.undefined
}

object UploadInitArgument {
  @scala.inline
  def apply(changeInit: Event = null, clickInit: MouseEventInit = null): UploadInitArgument = {
    val __obj = js.Dynamic.literal()
    if (changeInit != null) __obj.updateDynamic("changeInit")(changeInit.asInstanceOf[js.Any])
    if (clickInit != null) __obj.updateDynamic("clickInit")(clickInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadInitArgument]
  }
}

