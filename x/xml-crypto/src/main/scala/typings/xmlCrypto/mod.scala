package typings.xmlCrypto

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.std.Node
import typings.xmlCrypto.anon.Attrs
import typings.xmlCrypto.anon.CanonicalizationAlgorithm
import typings.xpath.mod.SelectedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xml-crypto", "FileKeyInfo")
  @js.native
  open class FileKeyInfo () extends StObject {
    def this(file: String) = this()
    
    var file: String = js.native
    
    def getKey(): Buffer = js.native
    def getKey(keyInfo: Node): Buffer = js.native
    
    def getKeyInfo(): String = js.native
    def getKeyInfo(key: String): String = js.native
    def getKeyInfo(key: String, prefix: String): String = js.native
    def getKeyInfo(key: Unit, prefix: String): String = js.native
  }
  
  @JSImport("xml-crypto", "HashAlgorithm")
  @js.native
  open class HashAlgorithm () extends StObject {
    
    def getAlgorithmName(): String = js.native
    
    def getHash(xml: String): String = js.native
  }
  
  @JSImport("xml-crypto", "SignatureAlgorithm")
  @js.native
  open class SignatureAlgorithm () extends StObject {
    
    def getAlgorithmName(): String = js.native
    
    def getSignature(signedInfo: Node, signingKey: Buffer): String = js.native
  }
  
  @JSImport("xml-crypto", "SignedXml")
  @js.native
  open class SignedXml () extends StObject {
    def this(idMode: String) = this()
    def this(idMode: String, options: CanonicalizationAlgorithm) = this()
    def this(idMode: Null, options: CanonicalizationAlgorithm) = this()
    def this(idMode: Unit, options: CanonicalizationAlgorithm) = this()
    
    def addReference(
      xpath: String,
      transforms: js.UndefOr[js.Array[String]],
      digestAlgorithm: js.UndefOr[String],
      uri: js.UndefOr[String],
      digestValue: js.UndefOr[String],
      inclusiveNamespacesPrefixList: js.UndefOr[String],
      isEmptyUri: js.UndefOr[Boolean]
    ): Unit = js.native
    
    var canonicalizationAlgorithm: String = js.native
    
    def checkSignature(xml: String): Boolean = js.native
    
    def computeSignature(xml: String): Unit = js.native
    def computeSignature(xml: String, opts: Attrs): Unit = js.native
    
    def getOriginalXmlWithIds(): String = js.native
    
    def getSignatureXml(): String = js.native
    
    def getSignedXml(): String = js.native
    
    var keyInfoProvider: FileKeyInfo = js.native
    
    def loadSignature(signatureNode: String): Unit = js.native
    def loadSignature(signatureNode: Node): Unit = js.native
    
    var references: js.Array[Reference] = js.native
    
    var signatureAlgorithm: String = js.native
    
    var signingKey: Buffer | String = js.native
    
    var validationErrors: js.Array[String] = js.native
  }
  /* static members */
  object SignedXml {
    
    @JSImport("xml-crypto", "SignedXml")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-crypto", "SignedXml.CanonicalizationAlgorithms")
    @js.native
    def CanonicalizationAlgorithms: StringDictionary[Instantiable0[TransformationAlgorithm]] = js.native
    inline def CanonicalizationAlgorithms_=(x: StringDictionary[Instantiable0[TransformationAlgorithm]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanonicalizationAlgorithms")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-crypto", "SignedXml.HashAlgorithms")
    @js.native
    def HashAlgorithms: StringDictionary[Instantiable0[HashAlgorithm]] = js.native
    inline def HashAlgorithms_=(x: StringDictionary[Instantiable0[HashAlgorithm]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashAlgorithms")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-crypto", "SignedXml.SignatureAlgorithms")
    @js.native
    def SignatureAlgorithms: StringDictionary[Instantiable0[SignatureAlgorithm]] = js.native
    inline def SignatureAlgorithms_=(x: StringDictionary[Instantiable0[SignatureAlgorithm]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SignatureAlgorithms")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xml-crypto", "TransformationAlgorithm")
  @js.native
  open class TransformationAlgorithm () extends StObject {
    
    def getAlgorithmName(): String = js.native
    
    def process(node: Node): String = js.native
  }
  
  inline def xpath(node: Node, xpath: String): js.Array[SelectedValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("xpath")(node.asInstanceOf[js.Any], xpath.asInstanceOf[js.Any])).asInstanceOf[js.Array[SelectedValue]]
  
  trait Reference extends StObject {
    
    var digestAlgorithm: js.UndefOr[String] = js.undefined
    
    var digestValue: js.UndefOr[String] = js.undefined
    
    var inclusiveNamespacesPrefixList: js.UndefOr[String] = js.undefined
    
    var isEmptyUri: js.UndefOr[Boolean] = js.undefined
    
    var transforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var xpath: String
  }
  object Reference {
    
    inline def apply(xpath: String): Reference = {
      val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      inline def setDigestValue(value: String): Self = StObject.set(x, "digestValue", value.asInstanceOf[js.Any])
      
      inline def setDigestValueUndefined: Self = StObject.set(x, "digestValue", js.undefined)
      
      inline def setInclusiveNamespacesPrefixList(value: String): Self = StObject.set(x, "inclusiveNamespacesPrefixList", value.asInstanceOf[js.Any])
      
      inline def setInclusiveNamespacesPrefixListUndefined: Self = StObject.set(x, "inclusiveNamespacesPrefixList", js.undefined)
      
      inline def setIsEmptyUri(value: Boolean): Self = StObject.set(x, "isEmptyUri", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUriUndefined: Self = StObject.set(x, "isEmptyUri", js.undefined)
      
      inline def setTransforms(value: js.Array[String]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: String*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    }
  }
}
