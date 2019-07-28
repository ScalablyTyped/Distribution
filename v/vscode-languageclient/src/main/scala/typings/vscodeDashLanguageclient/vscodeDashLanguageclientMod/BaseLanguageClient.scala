package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageclient.libClientMod.LanguageClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "BaseLanguageClient")
@js.native
abstract class BaseLanguageClient protected ()
  extends typings.vscodeDashLanguageclient.libClientMod.BaseLanguageClient {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
}

