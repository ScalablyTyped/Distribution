package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNavOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var targets: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object UIkitNavOptions {
  @scala.inline
  def apply(
    animation: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    targets: String = null,
    toggle: String = null,
    transition: String = null
  ): UIkitNavOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavOptions]
  }
}

