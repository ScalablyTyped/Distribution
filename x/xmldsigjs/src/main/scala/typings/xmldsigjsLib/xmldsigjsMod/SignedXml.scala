package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SignedXml")
@js.native
/**
  * Creates an instance of SignedXml.
  *
  * @param {(Document | Element)} [node]
  *
  * @memberOf SignedXml
  */
class SignedXml ()
  extends xmlDashCoreLib.xmlDashCoreMod.IXmlSerializable {
  def this(node: stdLib.Document) = this()
  def this(node: stdLib.Element) = this()
  var Algorithm: js.UndefOr[stdLib.Algorithm | stdLib.RsaPssParams | stdLib.EcdsaParams] = js.native
  var Key: js.UndefOr[stdLib.CryptoKey] = js.native
  var Parent: js.UndefOr[stdLib.Element | xmlDashCoreLib.xmlDashCoreMod.XmlObject] = js.native
  val Signature: stdLib.Uint8Array | scala.Null = js.native
  val XmlSignature: Signature = js.native
  var document: js.UndefOr[stdLib.Document] = js.native
  var signature: Signature = js.native
  /* protected */ def ApplySignOptions(signature: Signature, algorithm: stdLib.Algorithm, key: stdLib.CryptoKey): js.Thenable[scala.Unit] = js.native
  /* protected */ def ApplySignOptions(signature: Signature, algorithm: stdLib.Algorithm, key: stdLib.CryptoKey, options: OptionsSign): js.Thenable[scala.Unit] = js.native
  /* protected */ def ApplyTransforms(transforms: Transforms, input: stdLib.Element): js.Any = js.native
  /**
    * Copies namespaces from source element and its parents into destination element
    */
  /* protected */ def CopyNamespaces(src: stdLib.Element, dst: stdLib.Element, ignoreDefault: scala.Boolean): scala.Unit = js.native
  /* protected */ def DigestReference(doc: stdLib.Element, reference: Reference, checkHmac: scala.Boolean): js.Promise[stdLib.Uint8Array] = js.native
  /* protected */ def DigestReferences(data: stdLib.Element): js.Promise[js.Array[scala.Unit]] = js.native
  /**
    * Returns the public key of a signature.
    */
  /* protected */ def GetPublicKeys(): js.Thenable[js.Array[stdLib.CryptoKey]] = js.native
  /**
    * Returns dictionary of namespaces used in signature
    */
  /* protected */ def GetSignatureNamespaces(): xmlDashCoreLib.xmlDashCoreMod.AssocArray[java.lang.String] = js.native
  /**
    * Injects namespaces from dictionary to the target element
    */
  /* protected */ def InjectNamespaces(
    namespaces: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    target: stdLib.Element,
    ignoreDefault: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Loads a SignedXml state from an XML element.
    * @param  {Element | string} value The XML to load the SignedXml state from.
    * @returns void
    */
  def LoadXml(value: stdLib.Element): scala.Unit = js.native
  /* protected */ def ResolveTransform(transform: java.lang.String): Transform = js.native
  def Sign(algorithm: stdLib.Algorithm, key: stdLib.CryptoKey, data: stdLib.Document): js.Thenable[Signature] = js.native
  def Sign(algorithm: stdLib.Algorithm, key: stdLib.CryptoKey, data: stdLib.Document, options: OptionsSign): js.Thenable[Signature] = js.native
  /* protected */ def TransformSignedInfo(): java.lang.String = js.native
  /* protected */ def ValidateReferences(doc: stdLib.Element): js.Thenable[scala.Boolean] = js.native
  /* protected */ def ValidateSignatureValue(keys: js.Array[stdLib.CryptoKey]): js.Thenable[scala.Boolean] = js.native
  def Verify(): js.Thenable[scala.Boolean] = js.native
  def Verify(key: stdLib.CryptoKey): js.Thenable[scala.Boolean] = js.native
}

