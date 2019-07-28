package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.Uri
import typings.vscodeDashLanguageclient.libCodeConverterMod.URIConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Code2Protocol extends js.Object {
  @JSName("code2Protocol")
  var code2Protocol_Original: URIConverter = js.native
  @JSName("protocol2Code")
  var protocol2Code_Original: typings.vscodeDashLanguageclient.libProtocolConverterMod.URIConverter = js.native
  def code2Protocol(value: Uri): String = js.native
  def protocol2Code(value: String): Uri = js.native
}

