package typings.webcryptoCore.mod

import typings.std.AesKeyGenParams
import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.std.BufferSource
import typings.std.EcKeyGenParams
import typings.std.HmacKeyGenParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import typings.std.Pbkdf2Params
import typings.std.RsaHashedKeyGenParams
import typings.webcryptoCore.webcryptoCoreStrings.jwk
import typings.webcryptoCore.webcryptoCoreStrings.pkcs8
import typings.webcryptoCore.webcryptoCoreStrings.raw
import typings.webcryptoCore.webcryptoCoreStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.SubtleCrypto * / any */ @js.native
trait SubtleCrypto1 extends StObject {
  
  /* protected */ def checkCryptoKey(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ): /* asserts key is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(webcrypto-core), TsIdentModule(None,List(webcrypto-core)), TsIdentSimple(CryptoKey$1))),IArray())*/ Boolean = js.native
  
  /* protected */ def checkRequiredArguments(args: js.Array[Any], size: Double, methodName: String): Unit = js.native
  
  def decrypt(
    algorithm: AlgorithmIdentifier,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    data: BufferSource,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveBits(
    algorithm: AlgorithmIdentifier,
    baseKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    length: Double,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    derivedKeyType: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  
  def digest(algorithm: AlgorithmIdentifier, data: BufferSource, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(
    algorithm: AlgorithmIdentifier,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    data: BufferSource,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def exportKey(
    format: raw | spki | pkcs8,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def exportKey(
    format: KeyFormat,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    args: Any*
  ): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(
    format: jwk,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    args: Any*
  ): js.Promise[JsonWebKey] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: Boolean, keyUsages: js.Iterable[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKeyPair */ Any
  ] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKeyPair */ Any
  ] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKeyPair */ Any
  ] = js.native
  
  /* protected */ def getProvider(name: String): ProviderCrypto = js.native
  
  def importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  def importKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  
  /* protected */ def prepareAlgorithm(algorithm: AlgorithmIdentifier): Algorithm | HashedAlgorithm = js.native
  
  var providers: ProviderStorage = js.native
  
  def sign(
    algorithm: AlgorithmIdentifier,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    data: BufferSource,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any
  ] = js.native
  
  def verify(
    algorithm: AlgorithmIdentifier,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    signature: BufferSource,
    data: BufferSource,
    args: Any*
  ): js.Promise[Boolean] = js.native
  
  def wrapKey(
    format: KeyFormat,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    wrappingKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.CryptoKey */ Any,
    wrapAlgorithm: AlgorithmIdentifier,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
