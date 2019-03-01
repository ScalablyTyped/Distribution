package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParams extends js.Object {
  var items: js.Array[ConfigurationItem]
}

object ConfigurationParams {
  @scala.inline
  def apply(items: js.Array[ConfigurationItem]): ConfigurationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ConfigurationParams]
  }
}

