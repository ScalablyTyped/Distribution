package typings.xmldsigjs.xmldsigjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Algorithm
import typings.std.CryptoKey
import typings.std.Document
import typings.std.EcdsaParams
import typings.std.Element
import typings.std.RsaPssParams
import typings.std.Uint8Array
import typings.xmlDashCore.xmlDashCoreMod.AssocArray
import typings.xmlDashCore.xmlDashCoreMod.IXmlSerializable
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
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
class SignedXml () extends IXmlSerializable {
  def this(node: Document) = this()
  def this(node: Element) = this()
  var Algorithm: js.UndefOr[typings.std.Algorithm | RsaPssParams | EcdsaParams] = js.native
  var Key: js.UndefOr[CryptoKey] = js.native
  var Parent: js.UndefOr[Element | XmlObject] = js.native
  val Signature: Uint8Array | Null = js.native
  val XmlSignature: typings.xmldsigjs.xmldsigjsMod.Signature = js.native
  var document: js.UndefOr[Document] = js.native
  var signature: typings.xmldsigjs.xmldsigjsMod.Signature = js.native
  /* protected */ def ApplySignOptions(signature: typings.xmldsigjs.xmldsigjsMod.Signature, algorithm: Algorithm, key: CryptoKey): js.Thenable[Unit] = js.native
  /* protected */ def ApplySignOptions(
    signature: typings.xmldsigjs.xmldsigjsMod.Signature,
    algorithm: Algorithm,
    key: CryptoKey,
    options: OptionsSign
  ): js.Thenable[Unit] = js.native
  /* protected */ def ApplyTransforms(transforms: Transforms, input: Element): js.Any = js.native
  /**
    * Copies namespaces from source element and its parents into destination element
    */
  /* protected */ def CopyNamespaces(src: Element, dst: Element, ignoreDefault: Boolean): Unit = js.native
  /* protected */ def DigestReference(doc: Element, reference: Reference, checkHmac: Boolean): js.Promise[Uint8Array] = js.native
  /* protected */ def DigestReferences(data: Element): js.Promise[js.Array[Unit]] = js.native
  /**
    * Returns the public key of a signature.
    */
  /* protected */ def GetPublicKeys(): js.Thenable[js.Array[CryptoKey]] = js.native
  /**
    * Returns dictionary of namespaces used in signature
    */
  /* protected */ def GetSignatureNamespaces(): AssocArray[String] = js.native
  /**
    * Injects namespaces from dictionary to the target element
    */
  /* protected */ def InjectNamespaces(namespaces: StringDictionary[String], target: Element, ignoreDefault: Boolean): Unit = js.native
  /**
    * Loads a SignedXml state from an XML element.
    * @param  {Element | string} value The XML to load the SignedXml state from.
    * @returns void
    */
  def LoadXml(value: Element): Unit = js.native
  /* protected */ def ResolveTransform(transform: String): Transform = js.native
  def Sign(algorithm: Algorithm, key: CryptoKey, data: Document): js.Thenable[typings.xmldsigjs.xmldsigjsMod.Signature] = js.native
  def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsSign): js.Thenable[typings.xmldsigjs.xmldsigjsMod.Signature] = js.native
  /* protected */ def TransformSignedInfo(): String = js.native
  /* protected */ def ValidateReferences(doc: Element): js.Thenable[Boolean] = js.native
  /* protected */ def ValidateSignatureValue(keys: js.Array[CryptoKey]): js.Thenable[Boolean] = js.native
  def Verify(): js.Thenable[Boolean] = js.native
  def Verify(key: CryptoKey): js.Thenable[Boolean] = js.native
}

