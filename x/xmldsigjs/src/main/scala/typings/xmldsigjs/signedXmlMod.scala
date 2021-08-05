package typings.xmldsigjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.std.CryptoKey
import typings.std.Document
import typings.std.EcdsaParams
import typings.std.Element
import typings.std.RsaPssParams
import typings.std.Uint8Array
import typings.xmlCore.mod.XmlObject
import typings.xmlCore.typesMod.AssocArray
import typings.xmlCore.typesMod.IXmlSerializable
import typings.xmldsigjs.xmlMod.Reference
import typings.xmldsigjs.xmlMod.Signature
import typings.xmldsigjs.xmlMod.Transform
import typings.xmldsigjs.xmlMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedXmlMod {
  
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
  class SignedXml ()
    extends StObject
       with IXmlSerializable {
    def this(node: Document) = this()
    def this(node: Element) = this()
    
    var Algorithm: js.UndefOr[typings.std.Algorithm | RsaPssParams | EcdsaParams] = js.native
    
    /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey): js.Promise[Unit] = js.native
    /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsSign): js.Promise[Unit] = js.native
    
    /* protected */ def ApplyTransforms(transforms: Transforms, input: Element): js.Any = js.native
    
    /**
      * Copies namespaces from source element and its parents into destination element
      */
    /* protected */ def CopyNamespaces(src: Element, dst: Element, ignoreDefault: Boolean): Unit = js.native
    
    /* protected */ def DigestReference(doc: Element, reference: Reference, checkHmac: Boolean): js.Promise[Uint8Array] = js.native
    
    /* protected */ def DigestReferences(data: Element): js.Promise[Unit] = js.native
    
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
    
    /* protected */ def ResolveTransform(transform: String): Transform = js.native
    
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: EcdsaParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
    def Sign(algorithm: RsaPssParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
    
    def Signature: Uint8Array | Null = js.native
    
    /* protected */ def TransformSignedInfo(): String = js.native
    /* protected */ def TransformSignedInfo(data: Document): String = js.native
    /* protected */ def TransformSignedInfo(data: Element): String = js.native
    
    /* protected */ def ValidateReferences(doc: Element): js.Promise[Boolean] = js.native
    
    /* protected */ def ValidateSignatureValue(keys: js.Array[CryptoKey]): js.Promise[Boolean] = js.native
    
    def Verify(): js.Promise[Boolean] = js.native
    def Verify(key: CryptoKey): js.Promise[Boolean] = js.native
    
    def XmlSignature: Signature = js.native
    
    /* protected */ var document: js.UndefOr[Document] = js.native
    
    /* protected */ var signature: Signature = js.native
  }
  
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
      
      inline def setReferencesVarargs(value: OptionsSignReference*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      inline def setX509(value: js.Array[String]): Self = StObject.set(x, "x509", value.asInstanceOf[js.Any])
      
      inline def setX509Undefined: Self = StObject.set(x, "x509", js.undefined)
      
      inline def setX509Varargs(value: String*): Self = StObject.set(x, "x509", js.Array(value :_*))
    }
  }
  
  trait OptionsSignReference extends StObject {
    
    /**
      * Hash algorithm
      *
      * @type {AlgorithmIdentifier}
      * @memberOf OptionsSignReference
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
      *
      * @type {OptionsSignTransform[]}
      * @memberOf OptionsSignReference
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
      
      inline def setTransformsVarargs(value: OptionsSignTransform*): Self = StObject.set(x, "transforms", js.Array(value :_*))
      
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
  */
  trait OptionsSignTransform extends StObject
  object OptionsSignTransform {
    
    inline def base64: typings.xmldsigjs.xmldsigjsStrings.base64 = "base64".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.base64]
    
    inline def c14n: typings.xmldsigjs.xmldsigjsStrings.c14n = "c14n".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.c14n]
    
    inline def `c14n-com`: typings.xmldsigjs.xmldsigjsStrings.`c14n-com` = "c14n-com".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.`c14n-com`]
    
    inline def enveloped: typings.xmldsigjs.xmldsigjsStrings.enveloped = "enveloped".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.enveloped]
    
    inline def `exc-c14n`: typings.xmldsigjs.xmldsigjsStrings.`exc-c14n` = "exc-c14n".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.`exc-c14n`]
    
    inline def `exc-c14n-com`: typings.xmldsigjs.xmldsigjsStrings.`exc-c14n-com` = "exc-c14n-com".asInstanceOf[typings.xmldsigjs.xmldsigjsStrings.`exc-c14n-com`]
  }
}
