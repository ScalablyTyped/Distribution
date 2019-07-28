package typings.xadesjs.xadesjsMod

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.std.Document
import typings.std.Element
import typings.xadesjs.xadesjsMod.xmlNs.QualifyingProperties
import typings.xmldsigjs.xmldsigjsMod.X509Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "SignedXml")
@js.native
class SignedXml ()
  extends typings.xmldsigjs.xmldsigjsMod.SignedXml {
  def this(node: Document) = this()
  def this(node: Element) = this()
  val Properties: QualifyingProperties | Null = js.native
  val SignedProperties: typings.xadesjs.xadesjsMod.xmlNs.SignedProperties = js.native
  val UnsignedProperties: typings.xadesjs.xadesjsMod.xmlNs.UnsignedProperties = js.native
  var properties: QualifyingProperties | Null = js.native
  /* protected */ def ApplySignOptions(
    signature: typings.xmldsigjs.xmldsigjsMod.Signature,
    algorithm: Algorithm,
    key: CryptoKey,
    options: OptionsXAdES
  ): js.Promise[Unit] = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(): Unit = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(): Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): Unit = js.native
  /* protected */ def ApplySignerRoles(): Unit = js.native
  /* protected */ def ApplySignerRoles(options: OptionsSignerRole): Unit = js.native
  /* protected */ def ApplySigningCertificate(): js.Promise[Unit] = js.native
  /* protected */ def ApplySigningCertificate(base64string: String): js.Promise[Unit] = js.native
  /* protected */ def CreateQualyingProperties(): Unit = js.native
  def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsXAdES): js.Thenable[typings.xmldsigjs.xmldsigjsMod.Signature] = js.native
  /* protected */ def VerifySigningCertificate(): js.Promise[X509Certificate | Null] = js.native
}

