package typings.xadesjs

import typings.xadesjs.xmlDateTimeMod.XadesDateTime
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlSignedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  open class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typings.xadesjs.xmlSignaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typings.xadesjs.xmlSignatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typings.xadesjs.xmlSignerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typings.xadesjs.xmlSigningCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typings.xadesjs.xmlSigningCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
