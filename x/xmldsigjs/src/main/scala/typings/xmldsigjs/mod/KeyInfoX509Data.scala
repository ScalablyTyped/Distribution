package typings.xmldsigjs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
class KeyInfoX509Data ()
  extends typings.xmldsigjs.keyInfosMod.KeyInfoX509Data {
  def this(cert: typings.xmldsigjs.pkiMod.X509Certificate) = this()
  def this(rgbCert: Uint8Array) = this()
  def this(
    cert: typings.xmldsigjs.pkiMod.X509Certificate,
    includeOptions: typings.xmldsigjs.x509DataMod.X509IncludeOption
  ) = this()
}

