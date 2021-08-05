package typings.tsNkeys

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-nkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-nkeys", "NKeysError")
  @js.native
  class NKeysError protected ()
    extends StObject
       with Error {
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
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait NKeysErrorCode extends StObject
  @JSImport("ts-nkeys", "NKeysErrorCode")
  @js.native
  object NKeysErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NKeysErrorCode & String] = js.native
    
    @js.native
    sealed trait ApiError
      extends StObject
         with NKeysErrorCode
    /* "nkeys: api error" */ val ApiError: typings.tsNkeys.mod.NKeysErrorCode.ApiError & String = js.native
    
    @js.native
    sealed trait CannotSign
      extends StObject
         with NKeysErrorCode
    /* "nkeys: can not sign, no private key available" */ val CannotSign: typings.tsNkeys.mod.NKeysErrorCode.CannotSign & String = js.native
    
    @js.native
    sealed trait InvalidChecksum
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid checksum" */ val InvalidChecksum: typings.tsNkeys.mod.NKeysErrorCode.InvalidChecksum & String = js.native
    
    @js.native
    sealed trait InvalidEncoding
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid encoded key" */ val InvalidEncoding: typings.tsNkeys.mod.NKeysErrorCode.InvalidEncoding & String = js.native
    
    @js.native
    sealed trait InvalidKey
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid key" */ val InvalidKey: typings.tsNkeys.mod.NKeysErrorCode.InvalidKey & String = js.native
    
    @js.native
    sealed trait InvalidPrefixByte
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid prefix byte" */ val InvalidPrefixByte: typings.tsNkeys.mod.NKeysErrorCode.InvalidPrefixByte & String = js.native
    
    @js.native
    sealed trait InvalidPublicKey
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid public key" */ val InvalidPublicKey: typings.tsNkeys.mod.NKeysErrorCode.InvalidPublicKey & String = js.native
    
    @js.native
    sealed trait InvalidSeed
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid seed" */ val InvalidSeed: typings.tsNkeys.mod.NKeysErrorCode.InvalidSeed & String = js.native
    
    @js.native
    sealed trait InvalidSeedLen
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid seed length" */ val InvalidSeedLen: typings.tsNkeys.mod.NKeysErrorCode.InvalidSeedLen & String = js.native
    
    @js.native
    sealed trait InvalidSignature
      extends StObject
         with NKeysErrorCode
    /* "nkeys: signature verification failed" */ val InvalidSignature: typings.tsNkeys.mod.NKeysErrorCode.InvalidSignature & String = js.native
    
    @js.native
    sealed trait PublicKeyOnly
      extends StObject
         with NKeysErrorCode
    /* "nkeys: no seed or private key available" */ val PublicKeyOnly: typings.tsNkeys.mod.NKeysErrorCode.PublicKeyOnly & String = js.native
    
    @js.native
    sealed trait SerializationError
      extends StObject
         with NKeysErrorCode
    /* "nkeys: serialization error" */ val SerializationError: typings.tsNkeys.mod.NKeysErrorCode.SerializationError & String = js.native
  }
  
  @js.native
  sealed trait Prefix extends StObject
  @JSImport("ts-nkeys", "Prefix")
  @js.native
  object Prefix extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Prefix & Double] = js.native
    
    @js.native
    sealed trait Account
      extends StObject
         with Prefix
    /* 0 */ val Account: typings.tsNkeys.mod.Prefix.Account & Double = js.native
    
    @js.native
    sealed trait Cluster
      extends StObject
         with Prefix
    /* 16 */ val Cluster: typings.tsNkeys.mod.Prefix.Cluster & Double = js.native
    
    @js.native
    sealed trait Operator
      extends StObject
         with Prefix
    /* 112 */ val Operator: typings.tsNkeys.mod.Prefix.Operator & Double = js.native
    
    @js.native
    sealed trait Private
      extends StObject
         with Prefix
    /* 120 */ val Private: typings.tsNkeys.mod.Prefix.Private & Double = js.native
    
    @js.native
    sealed trait Seed
      extends StObject
         with Prefix
    /* 144 */ val Seed: typings.tsNkeys.mod.Prefix.Seed & Double = js.native
    
    @js.native
    sealed trait Server
      extends StObject
         with Prefix
    /* 104 */ val Server: typings.tsNkeys.mod.Prefix.Server & Double = js.native
    
    @js.native
    sealed trait User
      extends StObject
         with Prefix
    /* 160 */ val User: typings.tsNkeys.mod.Prefix.User & Double = js.native
  }
  
  @JSImport("ts-nkeys", "Prefixes")
  @js.native
  class Prefixes () extends StObject
  /* static members */
  object Prefixes {
    
    @JSImport("ts-nkeys", "Prefixes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidPrefix(prefix: Prefix): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidPublicPrefix(prefix: Prefix): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublicPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def parsePrefix(v: Double): Prefix = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePrefix")(v.asInstanceOf[js.Any]).asInstanceOf[Prefix]
    
    inline def startsWithValidPrefix(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithValidPrefix")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("ts-nkeys", "VERSION")
  @js.native
  val VERSION: /* "1.0.16" */ String = js.native
  
  inline def createAccount(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")().asInstanceOf[KeyPair]
  
  inline def createCluster(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createCluster")().asInstanceOf[KeyPair]
  
  inline def createOperator(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperator")().asInstanceOf[KeyPair]
  
  inline def createPair(prefix: Prefix): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(prefix.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def createServer(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[KeyPair]
  
  inline def createUser(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")().asInstanceOf[KeyPair]
  
  inline def fromPublic(src: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def fromSeed(src: Buffer): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  trait KeyPair extends StObject {
    
    /**
      * Returns the private key associated with the KeyPair
      * @returns Buffer
      * @throws NKeysError
      */
    def getPrivateKey(): Buffer
    
    /**
      * Returns the public key associated with the KeyPair
      * @returns {Promise<string>}
      * @throws NKeysError
      */
    def getPublicKey(): Buffer
    
    /**
      * Returns the PrivateKey's seed.
      * @returns Buffer
      * @throws NKeysError
      */
    def getSeed(): Buffer
    
    /**
      * Returns the digital signature of signing the input with the
      * the KeyPair's private key.
      * @param {Buffer} input
      * @returns Buffer
      * @throws NKeysError
      */
    def sign(input: Buffer): Buffer
    
    /**
      * Returns true if the signature can be verified with the KeyPair
      * @param {Buffer} input
      * @param {Buffer} sig
      * @returns {boolean}
      * @throws NKeysError
      */
    def verify(input: Buffer, sig: Buffer): Boolean
  }
  object KeyPair {
    
    inline def apply(
      getPrivateKey: () => Buffer,
      getPublicKey: () => Buffer,
      getSeed: () => Buffer,
      sign: Buffer => Buffer,
      verify: (Buffer, Buffer) => Boolean
    ): KeyPair = {
      val __obj = js.Dynamic.literal(getPrivateKey = js.Any.fromFunction0(getPrivateKey), getPublicKey = js.Any.fromFunction0(getPublicKey), getSeed = js.Any.fromFunction0(getSeed), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setGetPrivateKey(value: () => Buffer): Self = StObject.set(x, "getPrivateKey", js.Any.fromFunction0(value))
      
      inline def setGetPublicKey(value: () => Buffer): Self = StObject.set(x, "getPublicKey", js.Any.fromFunction0(value))
      
      inline def setGetSeed(value: () => Buffer): Self = StObject.set(x, "getSeed", js.Any.fromFunction0(value))
      
      inline def setSign(value: Buffer => Buffer): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setVerify(value: (Buffer, Buffer) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
}
