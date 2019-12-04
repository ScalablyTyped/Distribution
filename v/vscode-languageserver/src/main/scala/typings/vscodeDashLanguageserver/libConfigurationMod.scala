package typings.vscodeDashLanguageserver

import typings.vscodeDashLanguageserver.libConfigurationMod.Configuration
import typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod.Feature
import typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod._RemoteWorkspace
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod.ConfigurationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/configuration", JSImport.Namespace)
@js.native
object libConfigurationMod extends js.Object {
  @js.native
  trait Configuration extends js.Object {
    def getConfiguration(): Thenable[_] = js.native
    def getConfiguration(items: js.Array[ConfigurationItem]): Thenable[js.Array[_]] = js.native
    def getConfiguration(item: ConfigurationItem): Thenable[_] = js.native
    def getConfiguration(section: String): Thenable[_] = js.native
  }
  
  val ConfigurationFeature: Feature[_RemoteWorkspace, Configuration] = js.native
}

