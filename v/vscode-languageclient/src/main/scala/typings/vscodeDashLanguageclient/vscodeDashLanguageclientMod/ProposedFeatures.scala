package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageclient.libClientMod.DynamicFeature
import typings.vscodeDashLanguageclient.libClientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  def createAll(_client: typings.vscodeDashLanguageclient.libClientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[_]] = js.native
}

