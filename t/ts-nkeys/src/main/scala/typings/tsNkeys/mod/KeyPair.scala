package typings.tsNkeys.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPair extends js.Object {
  
  /**
    * Returns the private key associated with the KeyPair
    * @returns Buffer
    * @throws NKeysError
    */
  def getPrivateKey(): Buffer = js.native
  
  /**
    * Returns the public key associated with the KeyPair
    * @returns {Promise<string>}
    * @throws NKeysError
    */
  def getPublicKey(): Buffer = js.native
  
  /**
    * Returns the PrivateKey's seed.
    * @returns Buffer
    * @throws NKeysError
    */
  def getSeed(): Buffer = js.native
  
  /**
    * Returns the digital signature of signing the input with the
    * the KeyPair's private key.
    * @param {Buffer} input
    * @returns Buffer
    * @throws NKeysError
    */
  def sign(input: Buffer): Buffer = js.native
  
  /**
    * Returns true if the signature can be verified with the KeyPair
    * @param {Buffer} input
    * @param {Buffer} sig
    * @returns {boolean}
    * @throws NKeysError
    */
  def verify(input: Buffer, sig: Buffer): Boolean = js.native
}
object KeyPair {
  
  @scala.inline
  def apply(
    getPrivateKey: () => Buffer,
    getPublicKey: () => Buffer,
    getSeed: () => Buffer,
    sign: Buffer => Buffer,
    verify: (Buffer, Buffer) => Boolean
  ): KeyPair = {
    val __obj = js.Dynamic.literal(getPrivateKey = js.Any.fromFunction0(getPrivateKey), getPublicKey = js.Any.fromFunction0(getPublicKey), getSeed = js.Any.fromFunction0(getSeed), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[KeyPair]
  }
  
  @scala.inline
  implicit class KeyPairOps[Self <: KeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPrivateKey(value: () => Buffer): Self = this.set("getPrivateKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPublicKey(value: () => Buffer): Self = this.set("getPublicKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeed(value: () => Buffer): Self = this.set("getSeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSign(value: Buffer => Buffer): Self = this.set("sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerify(value: (Buffer, Buffer) => Boolean): Self = this.set("verify", js.Any.fromFunction2(value))
  }
}
