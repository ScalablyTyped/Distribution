package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.clientMod.DynamicFeature
import typings.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  def createAll(_client: typings.vscodeLanguageclient.clientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[_]] = js.native
}

