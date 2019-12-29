package typings.xadesjs

import typings.std.Uint8Array
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import typings.xmldsigjs.xmldsigjsMod.X509IssuerSerial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signing_certificate", JSImport.Namespace)
@js.native
object buildTypesXmlSigningUnderscoreCertificateMod extends js.Object {
  @js.native
  class Cert () extends XmlObject {
    var CertDigest: DigestAlgAndValueType = js.native
    var IssuerSerial: X509IssuerSerial = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class CertIDList () extends XmlCollection[Cert]
  
  @js.native
  class DigestAlgAndValueType () extends XmlObject {
    var DigestMethod: typings.xmldsigjs.xmldsigjsMod.DigestMethod = js.native
    var DigestValue: Uint8Array = js.native
  }
  
  @js.native
  class IssuerSerial ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IssuerSerial
  
  @js.native
  class SigningCertificate () extends XmlCollection[Cert]
  
}

