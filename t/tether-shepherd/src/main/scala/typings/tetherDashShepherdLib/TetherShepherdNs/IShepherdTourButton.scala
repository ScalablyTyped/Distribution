package typings
package tetherDashShepherdLib.TetherShepherdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShepherdTourButton extends js.Object {
  var action: js.UndefOr[js.Function] = js.undefined
  var classes: js.UndefOr[java.lang.String] = js.undefined
  var events: js.UndefOr[IShepherdTourButtonEventHash] = js.undefined
  var text: java.lang.String
}

object IShepherdTourButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    action: js.Function = null,
    classes: java.lang.String = null,
    events: IShepherdTourButtonEventHash = null
  ): IShepherdTourButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (action != null) __obj.updateDynamic("action")(action)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[IShepherdTourButton]
  }
}

