package typings.vscodeLanguageclient

import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.codeConverterMod.URIConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCode2Protocol extends js.Object {
  @JSName("code2Protocol")
  var code2Protocol_Original: URIConverter = js.native
  @JSName("protocol2Code")
  var protocol2Code_Original: typings.vscodeLanguageclient.protocolConverterMod.URIConverter = js.native
  def code2Protocol(value: Uri): String = js.native
  def protocol2Code(value: String): Uri = js.native
}

