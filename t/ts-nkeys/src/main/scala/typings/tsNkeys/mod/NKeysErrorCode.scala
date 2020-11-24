package typings.tsNkeys.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NKeysErrorCode extends js.Object
@JSImport("ts-nkeys", "NKeysErrorCode")
@js.native
object NKeysErrorCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NKeysErrorCode with String] = js.native
  
  @js.native
  sealed trait ApiError extends NKeysErrorCode
  /* "nkeys: api error" */ @js.native
  object ApiError extends TopLevel[ApiError with String]
  
  @js.native
  sealed trait CannotSign extends NKeysErrorCode
  /* "nkeys: can not sign, no private key available" */ @js.native
  object CannotSign extends TopLevel[CannotSign with String]
  
  @js.native
  sealed trait InvalidChecksum extends NKeysErrorCode
  /* "nkeys: invalid checksum" */ @js.native
  object InvalidChecksum extends TopLevel[InvalidChecksum with String]
  
  @js.native
  sealed trait InvalidEncoding extends NKeysErrorCode
  /* "nkeys: invalid encoded key" */ @js.native
  object InvalidEncoding extends TopLevel[InvalidEncoding with String]
  
  @js.native
  sealed trait InvalidKey extends NKeysErrorCode
  /* "nkeys: invalid key" */ @js.native
  object InvalidKey extends TopLevel[InvalidKey with String]
  
  @js.native
  sealed trait InvalidPrefixByte extends NKeysErrorCode
  /* "nkeys: invalid prefix byte" */ @js.native
  object InvalidPrefixByte extends TopLevel[InvalidPrefixByte with String]
  
  @js.native
  sealed trait InvalidPublicKey extends NKeysErrorCode
  /* "nkeys: invalid public key" */ @js.native
  object InvalidPublicKey extends TopLevel[InvalidPublicKey with String]
  
  @js.native
  sealed trait InvalidSeed extends NKeysErrorCode
  /* "nkeys: invalid seed" */ @js.native
  object InvalidSeed extends TopLevel[InvalidSeed with String]
  
  @js.native
  sealed trait InvalidSeedLen extends NKeysErrorCode
  /* "nkeys: invalid seed length" */ @js.native
  object InvalidSeedLen extends TopLevel[InvalidSeedLen with String]
  
  @js.native
  sealed trait InvalidSignature extends NKeysErrorCode
  /* "nkeys: signature verification failed" */ @js.native
  object InvalidSignature extends TopLevel[InvalidSignature with String]
  
  @js.native
  sealed trait PublicKeyOnly extends NKeysErrorCode
  /* "nkeys: no seed or private key available" */ @js.native
  object PublicKeyOnly extends TopLevel[PublicKeyOnly with String]
  
  @js.native
  sealed trait SerializationError extends NKeysErrorCode
  /* "nkeys: serialization error" */ @js.native
  object SerializationError extends TopLevel[SerializationError with String]
}
