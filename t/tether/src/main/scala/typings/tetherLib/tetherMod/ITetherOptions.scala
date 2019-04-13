package typings
package tetherLib.tetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITetherOptions extends js.Object {
  var attachment: java.lang.String
  var bodyElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var classPrefix: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean | java.lang.String]] = js.undefined
  var constraints: js.UndefOr[js.Array[ITetherConstraint]] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement | java.lang.String | js.Any] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[java.lang.String] = js.undefined
  var optimizations: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String | js.Any] = js.undefined
  var targetAttachment: js.UndefOr[java.lang.String] = js.undefined
  var targetModifier: js.UndefOr[java.lang.String] = js.undefined
  var targetOffset: js.UndefOr[java.lang.String] = js.undefined
}

object ITetherOptions {
  @scala.inline
  def apply(
    attachment: java.lang.String,
    bodyElement: stdLib.HTMLElement = null,
    classPrefix: java.lang.String = null,
    classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean | java.lang.String] = null,
    constraints: js.Array[ITetherConstraint] = null,
    element: stdLib.HTMLElement | java.lang.String | js.Any = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    offset: java.lang.String = null,
    optimizations: js.Any = null,
    target: stdLib.HTMLElement | java.lang.String | js.Any = null,
    targetAttachment: java.lang.String = null,
    targetModifier: java.lang.String = null,
    targetOffset: java.lang.String = null
  ): ITetherOptions = {
    val __obj = js.Dynamic.literal(attachment = attachment)
    if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement)
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment)
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier)
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset)
    __obj.asInstanceOf[ITetherOptions]
  }
}

