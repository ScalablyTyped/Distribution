package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationItem extends js.Object {
  /**
    * The scope to get the configuration section for.
    */
  var scopeUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The configuration section asked for.
    */
  var section: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigurationItem {
  @scala.inline
  def apply(scopeUri: java.lang.String = null, section: java.lang.String = null): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    if (scopeUri != null) __obj.updateDynamic("scopeUri")(scopeUri)
    if (section != null) __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[ConfigurationItem]
  }
}

