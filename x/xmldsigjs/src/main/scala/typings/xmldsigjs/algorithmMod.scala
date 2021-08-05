package typings.xmldsigjs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.CryptoKey
import typings.std.Node
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
  - typings.xmldsigjs.algorithmMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs/build/types/algorithm", "HashAlgorithm")
  @js.native
  abstract class HashAlgorithm () extends XmlAlgorithm {
    
    def Digest(xml: String): js.Promise[Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[Uint8Array] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
  - typings.xmldsigjs.algorithmMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs/build/types/algorithm", "SignatureAlgorithm")
  @js.native
  abstract class SignatureAlgorithm () extends XmlAlgorithm {
    
    /**
      * Sign the given string using the given key
      */
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[ArrayBuffer] = js.native
    
    /**
      * Verify the given signature of the given string using key
      */
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  @JSImport("xmldsigjs/build/types/algorithm", "XmlAlgorithm")
  @js.native
  abstract class XmlAlgorithm ()
    extends StObject
       with IAlgorithm {
    
    /* CompleteClass */
    var algorithm: Algorithm = js.native
    
    /* CompleteClass */
    override def getAlgorithmName(): String = js.native
    
    /* CompleteClass */
    var namespaceURI: String = js.native
  }
  
  type BASE64 = String
  
  trait IAlgorithm extends StObject {
    
    var algorithm: Algorithm
    
    def getAlgorithmName(): String
    
    var namespaceURI: String
  }
  object IAlgorithm {
    
    inline def apply(algorithm: Algorithm, getAlgorithmName: () => String, namespaceURI: String): IAlgorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAlgorithm]
    }
    
    extension [Self <: IAlgorithm](x: Self) {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setGetAlgorithmName(value: () => String): Self = StObject.set(x, "getAlgorithmName", js.Any.fromFunction0(value))
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IHashAlgorithm
    extends StObject
       with IAlgorithm {
    
    def Digest(xml: String): js.Promise[Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[Uint8Array] = js.native
  }
  
  type IHashAlgorithmConstructable = Instantiable0[IHashAlgorithm]
  
  @js.native
  trait ISignatureAlgorithm
    extends StObject
       with IAlgorithm {
    
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[ArrayBuffer] = js.native
    
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  type ISignatureAlgorithmConstructable = Instantiable0[ISignatureAlgorithm]
}
