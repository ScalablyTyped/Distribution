package typings.tsNkeys

import typings.node.Buffer
import typings.tsNkeys.mod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kpMod {
  
  @JSImport("ts-nkeys/lib/kp", "KP")
  @js.native
  class KP protected ()
    extends StObject
       with KeyPair {
    def this(seed: Buffer) = this()
    
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
    
    def getRawSeed(): Buffer = js.native
    
    /**
      * Returns the PrivateKey's seed.
      * @returns Buffer
      * @throws NKeysError
      */
    /* CompleteClass */
    override def getSeed(): Buffer = js.native
    
    var seed: Buffer = js.native
    
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
