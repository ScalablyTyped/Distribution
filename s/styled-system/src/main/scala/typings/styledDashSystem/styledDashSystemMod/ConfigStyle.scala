package typings.styledDashSystem.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStyle extends js.Object {
  /** A fallback scale object for when there isn't one defined in the `theme` object. */
  var defaultScale: js.UndefOr[Scale] = js.undefined
  /**
    * An array of multiple properties (e.g. `['marginLeft', 'marginRight']`) to which this style's value will be
    * assigned (overrides `property` when present).
    */
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  /** The CSS property to use in the returned style object (overridden by `properties` if present). */
  var property: js.UndefOr[String] = js.undefined
  /** A string referencing a key in the `theme` object. */
  var scale: js.UndefOr[String] = js.undefined
  /** A function to transform the raw value based on the scale. */
  var transform: js.UndefOr[js.Function2[/* value */ js.Any, /* scale */ js.UndefOr[Scale], _]] = js.undefined
}

object ConfigStyle {
  @scala.inline
  def apply(
    defaultScale: Scale = null,
    properties: js.Array[String] = null,
    property: String = null,
    scale: String = null,
    transform: (/* value */ js.Any, /* scale */ js.UndefOr[Scale]) => _ = null
  ): ConfigStyle = {
    val __obj = js.Dynamic.literal()
    if (defaultScale != null) __obj.updateDynamic("defaultScale")(defaultScale.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (property != null) __obj.updateDynamic("property")(property)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[ConfigStyle]
  }
}

