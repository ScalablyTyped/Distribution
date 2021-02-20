package typings.xadesjs

import typings.xadesjs.dateTimeMod.XadesDateTime
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typings.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typings.xadesjs.signatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typings.xadesjs.signerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typings.xadesjs.signingCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typings.xadesjs.signingCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
