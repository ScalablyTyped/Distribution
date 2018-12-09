package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedXml
  extends xmldsigjsLib.xmldsigjsMod.SignedXml {
  val Properties: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.QualifyingProperties | scala.Null = js.native
  val SignedProperties: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.SignedProperties = js.native
  val UnsignedProperties: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.UnsignedProperties = js.native
  var properties: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.QualifyingProperties | scala.Null = js.native
  /* protected */ def ApplySignOptions(
    signature: xmldsigjsLib.xmldsigjsMod.Signature,
    algorithm: stdLib.Algorithm,
    key: stdLib.CryptoKey,
    options: OptionsXAdES
  ): js.Promise[scala.Unit] = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(): scala.Unit = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): scala.Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(): scala.Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): scala.Unit = js.native
  /* protected */ def ApplySignerRoles(): scala.Unit = js.native
  /* protected */ def ApplySignerRoles(options: OptionsSignerRole): scala.Unit = js.native
  /* protected */ def ApplySigningCertificate(): js.Promise[scala.Unit] = js.native
  /* protected */ def ApplySigningCertificate(base64string: java.lang.String): js.Promise[scala.Unit] = js.native
  /* protected */ def CreateQualyingProperties(): scala.Unit = js.native
  def Sign(algorithm: stdLib.Algorithm, key: stdLib.CryptoKey, data: stdLib.Document, options: OptionsXAdES): js.Thenable[xmldsigjsLib.xmldsigjsMod.Signature] = js.native
  /* protected */ def VerifySigningCertificate(): js.Promise[xmldsigjsLib.xmldsigjsMod.X509Certificate | scala.Null] = js.native
}

