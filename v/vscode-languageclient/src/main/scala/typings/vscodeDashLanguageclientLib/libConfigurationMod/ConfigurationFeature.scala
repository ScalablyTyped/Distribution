package typings
package vscodeDashLanguageclientLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/configuration", "ConfigurationFeature")
@js.native
class ConfigurationFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.StaticFeature {
  def this(_client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
  var _client: js.Any = js.native
  var getConfiguration: js.Any = js.native
  def initialize(): scala.Unit = js.native
}

