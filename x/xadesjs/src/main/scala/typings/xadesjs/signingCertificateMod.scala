package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import typings.xmldsigjs.mod.X509IssuerSerial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signingCertificateMod {
  
  @JSImport("xadesjs/build/types/src/xml/signing_certificate", "Cert")
  @js.native
  open class Cert () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CertDigest: DigestAlgAndValueType = js.native
    
    var IssuerSerial: X509IssuerSerial = js.native
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signing_certificate", "CertIDList")
  @js.native
  open class CertIDList () extends XadesCollection[Cert] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signing_certificate", "DigestAlgAndValueType")
  @js.native
  open class DigestAlgAndValueType () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var DigestMethod: typings.xmldsigjs.mod.DigestMethod = js.native
    
    var DigestValue: js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/signing_certificate", "IssuerSerial")
  @js.native
  open class IssuerSerial () extends X509IssuerSerial {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signing_certificate", "SigningCertificate")
  @js.native
  open class SigningCertificate () extends CertIDList {
    def this(properties: js.Object) = this()
  }
}
