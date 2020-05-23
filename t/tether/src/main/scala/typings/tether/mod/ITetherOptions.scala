package typings.tether.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITetherOptions extends js.Object {
  var attachment: String
  var bodyElement: js.UndefOr[HTMLElement] = js.undefined
  var classPrefix: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[StringDictionary[Boolean | String]] = js.undefined
  var constraints: js.UndefOr[js.Array[ITetherConstraint]] = js.undefined
  var element: js.UndefOr[HTMLElement | String | js.Any] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[String] = js.undefined
  var optimizations: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[HTMLElement | String | js.Any] = js.undefined
  var targetAttachment: js.UndefOr[String] = js.undefined
  var targetModifier: js.UndefOr[String] = js.undefined
  var targetOffset: js.UndefOr[String] = js.undefined
}

object ITetherOptions {
  @scala.inline
  def apply(
    attachment: String,
    bodyElement: HTMLElement = null,
    classPrefix: String = null,
    classes: StringDictionary[Boolean | String] = null,
    constraints: js.Array[ITetherConstraint] = null,
    element: HTMLElement | String | js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    offset: String = null,
    optimizations: js.Any = null,
    target: HTMLElement | String | js.Any = null,
    targetAttachment: String = null,
    targetModifier: String = null,
    targetOffset: String = null
  ): ITetherOptions = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement.asInstanceOf[js.Any])
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment.asInstanceOf[js.Any])
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITetherOptions]
  }
}

