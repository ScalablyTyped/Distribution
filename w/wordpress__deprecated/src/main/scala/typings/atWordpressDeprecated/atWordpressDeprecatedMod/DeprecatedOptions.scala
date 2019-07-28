package typings.atWordpressDeprecated.atWordpressDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedOptions extends js.Object {
  /**
    * Feature to use instead.
    */
  var alternative: js.UndefOr[String] = js.undefined
  /**
    * Additional message to help transition away from the deprecated feature.
    */
  var hint: js.UndefOr[String] = js.undefined
  /**
    * Link to documentation.
    */
  var link: js.UndefOr[String] = js.undefined
  /**
    * Plugin name if it's a plugin feature.
    */
  var plugin: js.UndefOr[String] = js.undefined
  /**
    * Version in which the feature will be removed.
    */
  var version: js.UndefOr[String] = js.undefined
}

object DeprecatedOptions {
  @scala.inline
  def apply(
    alternative: String = null,
    hint: String = null,
    link: String = null,
    plugin: String = null,
    version: String = null
  ): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    if (alternative != null) __obj.updateDynamic("alternative")(alternative)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (link != null) __obj.updateDynamic("link")(link)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

