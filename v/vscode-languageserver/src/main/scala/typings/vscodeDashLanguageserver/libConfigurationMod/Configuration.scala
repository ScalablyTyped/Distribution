package typings.vscodeDashLanguageserver.libConfigurationMod

import typings.vscodeDashLanguageserver.Thenable
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  def getConfiguration(): Thenable[_] = js.native
  def getConfiguration(items: js.Array[ConfigurationItem]): Thenable[js.Array[_]] = js.native
  def getConfiguration(item: ConfigurationItem): Thenable[_] = js.native
  def getConfiguration(section: String): Thenable[_] = js.native
}

