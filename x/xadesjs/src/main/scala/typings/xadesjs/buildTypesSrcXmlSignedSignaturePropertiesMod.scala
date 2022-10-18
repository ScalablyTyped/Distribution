package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlDateTimeMod.XadesDateTime
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlSignedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/src/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  open class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typings.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typings.xadesjs.buildTypesSrcXmlSignatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typings.xadesjs.buildTypesSrcXmlSignerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typings.xadesjs.buildTypesSrcXmlSigningCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typings.xadesjs.buildTypesSrcXmlSigningCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
