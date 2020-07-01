package typings.testingLibraryDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultInit extends js.Object {
  var EventType: js.UndefOr[String] = js.undefined
  var defaultInit: js.UndefOr[js.Object] = js.undefined
}

object DefaultInit {
  @scala.inline
  def apply(EventType: String = null, defaultInit: js.Object = null): DefaultInit = {
    val __obj = js.Dynamic.literal()
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (defaultInit != null) __obj.updateDynamic("defaultInit")(defaultInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInit]
  }
}

