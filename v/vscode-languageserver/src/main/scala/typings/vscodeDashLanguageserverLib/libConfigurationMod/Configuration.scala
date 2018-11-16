package typings
package vscodeDashLanguageserverLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  def getConfiguration(): vscodeDashLanguageserverLib.Thenable[_] = js.native
  def getConfiguration(
    items: js.Array[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod.ConfigurationItem
    ]
  ): vscodeDashLanguageserverLib.Thenable[js.Array[_]] = js.native
  def getConfiguration(item: vscodeDashLanguageserverDashProtocolLib.libProtocolDotConfigurationMod.ConfigurationItem): vscodeDashLanguageserverLib.Thenable[_] = js.native
  def getConfiguration(section: java.lang.String): vscodeDashLanguageserverLib.Thenable[_] = js.native
}

