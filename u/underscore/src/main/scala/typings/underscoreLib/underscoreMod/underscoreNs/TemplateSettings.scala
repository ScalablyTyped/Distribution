package typings
package underscoreLib.underscoreMod.underscoreNs

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
  var escape: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * Default value is '/<%([\s\S]+?)%>/g'.
          **/
  var evaluate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * Default value is '/<%=([\s\S]+?)%>/g'.
          **/
  var interpolate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * By default, 'template()' places the values from your data in the local scope via the 'with' statement.
          * However, you can specify a single variable name with this setting.
          **/
  var variable: js.UndefOr[java.lang.String] = js.undefined
}

