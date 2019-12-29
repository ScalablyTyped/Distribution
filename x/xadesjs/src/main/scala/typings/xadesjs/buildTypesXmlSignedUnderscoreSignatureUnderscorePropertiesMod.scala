package typings.xadesjs

import typings.xadesjs.buildTypesXmlDateUnderscoreTimeMod.XadesDateTime
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signed_signature_properties", JSImport.Namespace)
@js.native
object buildTypesXmlSignedUnderscoreSignatureUnderscorePropertiesMod extends js.Object {
  @js.native
  class SignedSignatureProperties () extends XmlObject {
    var Id: String = js.native
    var SignaturePolicyIdentifier: typings.xadesjs.buildTypesXmlSignatureUnderscorePolicyUnderscoreIdentifierMod.SignaturePolicyIdentifier = js.native
    var SignatureProductionPlace: typings.xadesjs.buildTypesXmlSignatureUnderscoreProductUnderscorePlaceMod.SignatureProductionPlace = js.native
    var SignerRole: typings.xadesjs.buildTypesXmlSignerUnderscoreRoleMod.SignerRole = js.native
    var SigningCertificate: typings.xadesjs.buildTypesXmlSigningUnderscoreCertificateMod.SigningCertificate = js.native
    var SigningTime: XadesDateTime = js.native
  }
  
}

