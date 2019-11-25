package typings.underscore.underscoreMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * underscore.js template settings, set templateSettings or pass as an argument
  * to 'template()' to override defaults.
  **/
trait TemplateSettings extends js.Object {
  /**
    * Default value is '/<%-([\s\S]+?)%>/g'.
    **/
  var escape: js.UndefOr[RegExp] = js.undefined
  /**
    * Default value is '/<%([\s\S]+?)%>/g'.
    **/
  var evaluate: js.UndefOr[RegExp] = js.undefined
  /**
    * Default value is '/<%=([\s\S]+?)%>/g'.
    **/
  var interpolate: js.UndefOr[RegExp] = js.undefined
  /**
    * By default, 'template()' places the values from your data in the local scope via the 'with' statement.
    * However, you can specify a single variable name with this setting.
    **/
  var variable: js.UndefOr[String] = js.undefined
}

object TemplateSettings {
  @scala.inline
  def apply(
    escape: RegExp = null,
    evaluate: RegExp = null,
    interpolate: RegExp = null,
    variable: String = null
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSettings]
  }
}

