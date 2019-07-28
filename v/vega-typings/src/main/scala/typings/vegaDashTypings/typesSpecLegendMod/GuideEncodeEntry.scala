package typings.vegaDashTypings.typesSpecLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideEncodeEntry[T] extends js.Object {
  var enter: js.UndefOr[T] = js.undefined
  var exit: js.UndefOr[T] = js.undefined
  var hover: js.UndefOr[T] = js.undefined
  /**
    * A boolean flag indicating if the guide element should respond to input events such as mouse hover.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * A mark style property to apply to the guide group mark.
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  var update: js.UndefOr[T] = js.undefined
}

object GuideEncodeEntry {
  @scala.inline
  def apply[T](
    enter: T = null,
    exit: T = null,
    hover: T = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    style: String | js.Array[String] = null,
    update: T = null
  ): GuideEncodeEntry[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (name != null) __obj.updateDynamic("name")(name)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideEncodeEntry[T]]
  }
}

