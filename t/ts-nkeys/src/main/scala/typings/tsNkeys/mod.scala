package typings.tsNkeys

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-nkeys", "NKeysError")
  @js.native
  class NKeysError protected () extends Error {
    /**
      * @param {NKeysErrorCode} code
      * @param {Error} [chainedError]
      * @constructor
      *
      * @api private
      */
    def this(code: NKeysErrorCode) = this()
    def this(code: NKeysErrorCode, chainedError: Error) = this()
    
    var chainedError: js.UndefOr[Error] = js.native
    
    var code: String = js.native
  }
  
  @js.native
  sealed trait NKeysErrorCode extends StObject
  @JSImport("ts-nkeys", "NKeysErrorCode")
  @js.native
  object NKeysErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NKeysErrorCode with String] = js.native
    
    @js.native
    sealed trait ApiError extends NKeysErrorCode
    /* "nkeys: api error" */ val ApiError: typings.tsNkeys.mod.NKeysErrorCode.ApiError with String = js.native
    
    @js.native
    sealed trait CannotSign extends NKeysErrorCode
    /* "nkeys: can not sign, no private key available" */ val CannotSign: typings.tsNkeys.mod.NKeysErrorCode.CannotSign with String = js.native
    
    @js.native
    sealed trait InvalidChecksum extends NKeysErrorCode
    /* "nkeys: invalid checksum" */ val InvalidChecksum: typings.tsNkeys.mod.NKeysErrorCode.InvalidChecksum with String = js.native
    
    @js.native
    sealed trait InvalidEncoding extends NKeysErrorCode
    /* "nkeys: invalid encoded key" */ val InvalidEncoding: typings.tsNkeys.mod.NKeysErrorCode.InvalidEncoding with String = js.native
    
    @js.native
    sealed trait InvalidKey extends NKeysErrorCode
    /* "nkeys: invalid key" */ val InvalidKey: typings.tsNkeys.mod.NKeysErrorCode.InvalidKey with String = js.native
    
    @js.native
    sealed trait InvalidPrefixByte extends NKeysErrorCode
    /* "nkeys: invalid prefix byte" */ val InvalidPrefixByte: typings.tsNkeys.mod.NKeysErrorCode.InvalidPrefixByte with String = js.native
    
    @js.native
    sealed trait InvalidPublicKey extends NKeysErrorCode
    /* "nkeys: invalid public key" */ val InvalidPublicKey: typings.tsNkeys.mod.NKeysErrorCode.InvalidPublicKey with String = js.native
    
    @js.native
    sealed trait InvalidSeed extends NKeysErrorCode
    /* "nkeys: invalid seed" */ val InvalidSeed: typings.tsNkeys.mod.NKeysErrorCode.InvalidSeed with String = js.native
    
    @js.native
    sealed trait InvalidSeedLen extends NKeysErrorCode
    /* "nkeys: invalid seed length" */ val InvalidSeedLen: typings.tsNkeys.mod.NKeysErrorCode.InvalidSeedLen with String = js.native
    
    @js.native
    sealed trait InvalidSignature extends NKeysErrorCode
    /* "nkeys: signature verification failed" */ val InvalidSignature: typings.tsNkeys.mod.NKeysErrorCode.InvalidSignature with String = js.native
    
    @js.native
    sealed trait PublicKeyOnly extends NKeysErrorCode
    /* "nkeys: no seed or private key available" */ val PublicKeyOnly: typings.tsNkeys.mod.NKeysErrorCode.PublicKeyOnly with String = js.native
    
    @js.native
    sealed trait SerializationError extends NKeysErrorCode
    /* "nkeys: serialization error" */ val SerializationError: typings.tsNkeys.mod.NKeysErrorCode.SerializationError with String = js.native
  }
  
  @js.native
  sealed trait Prefix extends StObject
  @JSImport("ts-nkeys", "Prefix")
  @js.native
  object Prefix extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Prefix with Double] = js.native
    
    @js.native
    sealed trait Account extends Prefix
    /* 0 */ val Account: typings.tsNkeys.mod.Prefix.Account with Double = js.native
    
    @js.native
    sealed trait Cluster extends Prefix
    /* 16 */ val Cluster: typings.tsNkeys.mod.Prefix.Cluster with Double = js.native
    
    @js.native
    sealed trait Operator extends Prefix
    /* 112 */ val Operator: typings.tsNkeys.mod.Prefix.Operator with Double = js.native
    
    @js.native
    sealed trait Private extends Prefix
    /* 120 */ val Private: typings.tsNkeys.mod.Prefix.Private with Double = js.native
    
    @js.native
    sealed trait Seed extends Prefix
    /* 144 */ val Seed: typings.tsNkeys.mod.Prefix.Seed with Double = js.native
    
    @js.native
    sealed trait Server extends Prefix
    /* 104 */ val Server: typings.tsNkeys.mod.Prefix.Server with Double = js.native
    
    @js.native
    sealed trait User extends Prefix
    /* 160 */ val User: typings.tsNkeys.mod.Prefix.User with Double = js.native
  }
  
  @JSImport("ts-nkeys", "Prefixes")
  @js.native
  class Prefixes () extends StObject
  /* static members */
  object Prefixes {
    
    @JSImport("ts-nkeys", "Prefixes.isValidPrefix")
    @js.native
    def isValidPrefix(prefix: Prefix): Boolean = js.native
    
    @JSImport("ts-nkeys", "Prefixes.isValidPublicPrefix")
    @js.native
    def isValidPublicPrefix(prefix: Prefix): Boolean = js.native
    
    @JSImport("ts-nkeys", "Prefixes.parsePrefix")
    @js.native
    def parsePrefix(v: Double): Prefix = js.native
    
    @JSImport("ts-nkeys", "Prefixes.startsWithValidPrefix")
    @js.native
    def startsWithValidPrefix(s: String): Boolean = js.native
  }
  
  @JSImport("ts-nkeys", "VERSION")
  @js.native
  val VERSION: /* "1.0.16" */ String = js.native
  
  @JSImport("ts-nkeys", "createAccount")
  @js.native
  def createAccount(): KeyPair = js.native
  
  @JSImport("ts-nkeys", "createCluster")
  @js.native
  def createCluster(): KeyPair = js.native
  
  @JSImport("ts-nkeys", "createOperator")
  @js.native
  def createOperator(): KeyPair = js.native
  
  @JSImport("ts-nkeys", "createPair")
  @js.native
  def createPair(prefix: Prefix): KeyPair = js.native
  
  @JSImport("ts-nkeys", "createServer")
  @js.native
  def createServer(): KeyPair = js.native
  
  @JSImport("ts-nkeys", "createUser")
  @js.native
  def createUser(): KeyPair = js.native
  
  @JSImport("ts-nkeys", "fromPublic")
  @js.native
  def fromPublic(src: Buffer): KeyPair = js.native
  
  @JSImport("ts-nkeys", "fromSeed")
  @js.native
  def fromSeed(src: Buffer): KeyPair = js.native
  
  @js.native
  trait KeyPair extends StObject {
    
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
    implicit class KeyPairMutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPrivateKey(value: () => Buffer): Self = StObject.set(x, "getPrivateKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPublicKey(value: () => Buffer): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSeed(value: () => Buffer): Self = StObject.set(x, "getSeed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSign(value: Buffer => Buffer): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerify(value: (Buffer, Buffer) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
}
