package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationParams extends js.Object {
  var items: js.Array[ConfigurationItem]
}

object ConfigurationParams {
  @scala.inline
  def apply(items: js.Array[ConfigurationItem]): ConfigurationParams = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigurationParams]
  }
}

