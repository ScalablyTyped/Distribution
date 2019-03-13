package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Code2Protocol extends js.Object {
  @JSName("code2Protocol")
  var code2Protocol_Original: vscodeDashLanguageclientLib.libCodeConverterMod.URIConverter = js.native
  @JSName("protocol2Code")
  var protocol2Code_Original: vscodeDashLanguageclientLib.libProtocolConverterMod.URIConverter = js.native
  def code2Protocol(value: vscodeLib.vscodeMod.Uri): java.lang.String = js.native
  def protocol2Code(value: java.lang.String): vscodeLib.vscodeMod.Uri = js.native
}

