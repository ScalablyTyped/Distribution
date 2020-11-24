package typings.xadesjs

import typings.std.Uint8Array
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.mod.X509IssuerSerial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/signing_certificate", JSImport.Namespace)
@js.native
object signingCertificateMod extends js.Object {
  
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
    
    var DigestMethod: typings.xmldsigjs.mod.DigestMethod = js.native
    
    var DigestValue: Uint8Array = js.native
  }
  
  @js.native
  class IssuerSerial ()
    extends typings.xmldsigjs.x509DataMod.X509IssuerSerial
  
  @js.native
  class SigningCertificate () extends XmlCollection[Cert]
}
