package typings.tsNkeys

import typings.node.Buffer
import typings.tsNkeys.mod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicMod {
  
  @JSImport("ts-nkeys/lib/public", "PublicKey")
  @js.native
  class PublicKey protected ()
    extends StObject
       with KeyPair {
    def this(publicKey: Buffer) = this()
    
    /**
      * Returns the private key associated with the KeyPair
      * @returns Buffer
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getPrivateKey(): Buffer = js.native
    
    /**
      * Returns the public key associated with the KeyPair
      * @returns {Promise<string>}
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getPublicKey(): Buffer = js.native
    
    /**
      * Returns the PrivateKey's seed.
      * @returns Buffer
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getSeed(): Buffer = js.native
    
    var publicKey: Buffer = js.native
    
    /**
      * Returns the digital signature of signing the input with the
      * the KeyPair's private key.
      * @param {Buffer} input
      * @returns Buffer
      * @throws NKeysError
      */
    /* CompleteClass */
    override def sign(input: Buffer): Buffer = js.native
    
    /**
      * Returns true if the signature can be verified with the KeyPair
      * @param {Buffer} input
      * @param {Buffer} sig
      * @returns {boolean}
      * @throws NKeysError
      */
    /* CompleteClass */
    override def verify(input: Buffer, sig: Buffer): Boolean = js.native
  }
}
