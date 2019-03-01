package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_Configuration] = js.undefined
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(workspace: vscodeDashLanguageserverDashProtocolLib.Anon_Configuration = null): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
}

