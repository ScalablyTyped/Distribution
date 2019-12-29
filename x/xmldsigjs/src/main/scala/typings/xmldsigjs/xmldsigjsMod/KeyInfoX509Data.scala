package typings.xmldsigjs.xmldsigjsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
class KeyInfoX509Data ()
  extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosMod.KeyInfoX509Data {
  def this(cert: typings.xmldsigjs.buildTypesPkiMod.X509Certificate) = this()
  def this(rgbCert: Uint8Array) = this()
  def this(
    cert: typings.xmldsigjs.buildTypesPkiMod.X509Certificate,
    includeOptions: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption
  ) = this()
}

