package typings.xadesjs.signedXmlMod

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.std.Document
import typings.std.Element
import typings.xadesjs.xmlMod.QualifyingProperties
import typings.xmldsigjs.mod.Signature
import typings.xmldsigjs.mod.X509Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/signed_xml", "SignedXml")
@js.native
class SignedXml ()
  extends typings.xmldsigjs.mod.SignedXml {
  def this(node: Document) = this()
  def this(node: Element) = this()
  
  /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsXAdES): js.Promise[Unit] = js.native
  
  /* protected */ def ApplySignaturePolicyIdentifier(): js.Promise[Unit] = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(options: Boolean): js.Promise[Unit] = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): js.Promise[Unit] = js.native
  
  /* protected */ def ApplySignatureProductionPlace(): Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): Unit = js.native
  
  /* protected */ def ApplySignerRoles(): Unit = js.native
  /* protected */ def ApplySignerRoles(options: OptionsSignerRole): Unit = js.native
  
  /* protected */ def ApplySigningCertificate(): js.Promise[Unit] = js.native
  /* protected */ def ApplySigningCertificate(base64string: String): js.Promise[Unit] = js.native
  
  /* protected */ def ApplySigningCertificateV2(): js.Promise[Unit] = js.native
  /* protected */ def ApplySigningCertificateV2(base64string: String): js.Promise[Unit] = js.native
  
  /* protected */ def CreateQualifyingProperties(): Unit = js.native
  
  def LoadXml(value: String, useContainer: Boolean): Unit = js.native
  def LoadXml(value: Element, useContainer: Boolean): Unit = js.native
  
  def Properties: QualifyingProperties | Null = js.native
  
  def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsXAdES): js.Promise[Signature] = js.native
  
  def SignedProperties: typings.xadesjs.xmlMod.SignedProperties = js.native
  
  def UnsignedProperties: typings.xadesjs.xmlMod.UnsignedProperties = js.native
  
  /* protected */ def VerifySigningCertificate(): js.Promise[X509Certificate | Null] = js.native
  
  var properties: QualifyingProperties | Null = js.native
}
