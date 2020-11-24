package typings.xadesjs

import typings.std.Uint8Array
import typings.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/signing_certificate_v2", JSImport.Namespace)
@js.native
object signingCertificateV2Mod extends js.Object {
  
  @js.native
  class CertIDListV2 () extends XmlCollection[CertV2]
  
  @js.native
  class CertV2 () extends XmlObject {
    
    var CertDigest: DigestAlgAndValueType = js.native
    
    var IssuerSerial: Uint8Array = js.native
    
    var Uri: String = js.native
  }
  
  @js.native
  class SigningCertificateV2 () extends XmlCollection[CertV2]
}
