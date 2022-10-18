package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodecEncryptionMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "CodecEncryptionMode")
@js.native
object CodecEncryptionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodecEncryptionMode & Double] = js.native
  
  /** globally disabled */
  @js.native
  sealed trait DISABLED
    extends StObject
       with CodecEncryptionMode
  /* 1 */ val DISABLED: typings.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.DISABLED & Double = js.native
  
  /** globally enabled */
  @js.native
  sealed trait ENABLED
    extends StObject
       with CodecEncryptionMode
  /* 2 */ val ENABLED: typings.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.ENABLED & Double = js.native
  
  /** configure per channel */
  @js.native
  sealed trait INDIVIDUAL
    extends StObject
       with CodecEncryptionMode
  /* 0 */ val INDIVIDUAL: typings.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.INDIVIDUAL & Double = js.native
}
