package typings.xmldsigjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.std.BufferSource
import typings.std.CryptoKey
import typings.std.Document
import typings.std.EcdsaParams
import typings.std.Element
import typings.std.Record
import typings.std.RsaPssParams
import typings.xmlCore.distTypesTypesMod.AssocArray
import typings.xmlCore.distTypesTypesMod.IXmlSerializable
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.buildTypesXmlMod.Reference
import typings.xmldsigjs.buildTypesXmlMod.Signature
import typings.xmldsigjs.buildTypesXmlMod.Transform
import typings.xmldsigjs.buildTypesXmlMod.Transforms
import typings.xmldsigjs.xmldsigjsStrings.xpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSignedXmlMod {
  
  @JSImport("xmldsigjs/build/types/signed_xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SelectRootNamespaces(node: Element): AssocArray[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRootNamespaces")(node.asInstanceOf[js.Any]).asInstanceOf[AssocArray[String]]
  
  @JSImport("xmldsigjs/build/types/signed_xml", "SignedXml")
  @js.native
  /**
    * Creates an instance of SignedXml.
    *
    * @param {(Document | Element)} [node]
    *
    * @memberOf SignedXml
    */
  open class SignedXml ()
    extends StObject
       with IXmlSerializable {
    def this(node: Document) = this()
    def this(node: Element) = this()
    
    var Algorithm: js.UndefOr[typings.std.Algorithm | RsaPssParams | EcdsaParams] = js.native
    
    /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsSign): js.Promise[Unit] = js.native
    
    /* protected */ def ApplyTransforms(transforms: Transforms, input: Element): Any = js.native
    
    /**
      * Copies namespaces from source element and its parents into destination element
      */
    /* protected */ def CopyNamespaces(src: Element, dst: Element, ignoreDefault: Boolean): Unit = js.native
    
    /* protected */ def DigestReference(source: DigestReferenceSource, reference: Reference, checkHmac: Boolean): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* protected */ def DigestReferences(data: DigestReferenceSource): js.Promise[Unit] = js.native
    
    /**
      * Returns the public key of a signature.
      */
    /* protected */ def GetPublicKeys(): js.Promise[js.Array[CryptoKey]] = js.native
    
    /**
      * Returns dictionary of namespaces used in signature
      */
    /* protected */ def GetSignatureNamespaces(): AssocArray[String] = js.native
    
    /**
      * Injects namespaces from dictionary to the target element
      */
    /* protected */ def InjectNamespaces(namespaces: StringDictionary[String], target: Element, ignoreDefault: Boolean): Unit = js.native
    
    var Key: js.UndefOr[CryptoKey] = js.native
    
    /**
      * Loads a SignedXml state from an XML element.
      * @param  {Element | string} value The XML to load the SignedXml state from.
      * @returns void
      */
    def LoadXml(value: Element): Unit = js.native
    
    var Parent: js.UndefOr[Element | XmlObject] = js.native
    
    /* protected */ def ResolveTransform(transform: OptionsSignTransform): Transform = js.native
    
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: Algorithm, key: CryptoKey, data: DigestReferenceSource): js.Promise[Signature] = js.native
    def Sign(algorithm: Algorithm, key: CryptoKey, data: DigestReferenceSource, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: DigestReferenceSource): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: DigestReferenceSource, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: DigestReferenceSource): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: DigestReferenceSource, options: OptionsSign): js.Promise[Signature] = js.native
    
    def Signature: js.typedarray.Uint8Array | Null = js.native
    
    /* protected */ def TransformSignedInfo(): String = js.native
    /* protected */ def TransformSignedInfo(data: BufferSource): String = js.native
    /* protected */ def TransformSignedInfo(data: Document): String = js.native
    /* protected */ def TransformSignedInfo(data: Element): String = js.native
    
    /* protected */ def ValidateReferences(doc: DigestReferenceSource): js.Promise[Boolean] = js.native
    
    /* protected */ def ValidateSignatureValue(keys: js.Array[CryptoKey]): js.Promise[Boolean] = js.native
    
    def Verify(): js.Promise[Boolean] = js.native
    def Verify(key: CryptoKey): js.Promise[Boolean] = js.native
    def Verify(params: OptionsVerify): js.Promise[Boolean] = js.native
    
    def XmlSignature: Signature = js.native
    
    var contentHandler: js.UndefOr[
        js.Function2[
          /* reference */ Reference, 
          /* target */ this.type, 
          js.Promise[Document | DigestReferenceSource | Null]
        ]
      ] = js.native
    
    /* protected */ var document: js.UndefOr[Document] = js.native
    
    /* protected */ var signature: Signature = js.native
  }
  
  type DigestReferenceSource = Element | BufferSource
  
  trait OptionsSign extends StObject {
    
    /**
      * Id of Signature
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Public key for KeyInfo block
      *
      * @type {boolean}
      * @memberOf OptionsSign
      */
    var keyValue: js.UndefOr[CryptoKey] = js.undefined
    
    /**
      * List of Reference
      * Default is Reference with hash alg SHA-256 and exc-c14n transform
      *
      * @type {OptionsSignReference[]}
      * @memberOf OptionsSign
      */
    var references: js.UndefOr[js.Array[OptionsSignReference]] = js.undefined
    
    /**
      * List of X509 Certificates
      *
      * @type {string[]}
      * @memberOf OptionsSign
      */
    var x509: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OptionsSign {
    
    inline def apply(): OptionsSign = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSign]
    }
    
    extension [Self <: OptionsSign](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyValue(value: CryptoKey): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
      
      inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
      
      inline def setReferences(value: js.Array[OptionsSignReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: OptionsSignReference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setX509(value: js.Array[String]): Self = StObject.set(x, "x509", value.asInstanceOf[js.Any])
      
      inline def setX509Undefined: Self = StObject.set(x, "x509", js.undefined)
      
      inline def setX509Varargs(value: String*): Self = StObject.set(x, "x509", js.Array(value*))
    }
  }
  
  trait OptionsSignReference extends StObject {
    
    /**
      * Hash algorithm
      */
    var hash: AlgorithmIdentifier
    
    /**
      * Id of Reference
      *
      * @type {string}
      * @memberOf OptionsSignReference
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * List of transforms
      */
    var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object OptionsSignReference {
    
    inline def apply(hash: AlgorithmIdentifier): OptionsSignReference = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsSignReference]
    }
    
    extension [Self <: OptionsSignReference](x: Self) {
      
      inline def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTransforms(value: js.Array[OptionsSignTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: OptionsSignTransform*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmldsigjs.xmldsigjsStrings.enveloped
    - typings.xmldsigjs.xmldsigjsStrings.c14n
    - typings.xmldsigjs.xmldsigjsStrings.`exc-c14n`
    - typings.xmldsigjs.xmldsigjsStrings.`c14n-com`
    - typings.xmldsigjs.xmldsigjsStrings.`exc-c14n-com`
    - typings.xmldsigjs.xmldsigjsStrings.base64
    - typings.xmldsigjs.buildTypesSignedXmlMod.OptionsXPathSignTransform
  */
  trait OptionsSignTransform extends StObject
  
  trait OptionsVerify extends StObject {
    
    var content: js.UndefOr[DigestReferenceSource] = js.undefined
    
    var key: js.UndefOr[CryptoKey] = js.undefined
  }
  object OptionsVerify {
    
    inline def apply(): OptionsVerify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsVerify]
    }
    
    extension [Self <: OptionsVerify](x: Self) {
      
      inline def setContent(value: DigestReferenceSource): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setKey(value: CryptoKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait OptionsXPathSignTransform
    extends StObject
       with OptionsSignTransform {
    
    var name: xpath
    
    var namespaces: js.UndefOr[Record[String, String]] = js.undefined
    
    var selector: String
  }
  object OptionsXPathSignTransform {
    
    inline def apply(selector: String): OptionsXPathSignTransform = {
      val __obj = js.Dynamic.literal(name = "xpath", selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsXPathSignTransform]
    }
    
    extension [Self <: OptionsXPathSignTransform](x: Self) {
      
      inline def setName(value: xpath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaces(value: Record[String, String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
