package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodecEncryptionMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "CodecEncryptionMode")
@js.native
object CodecEncryptionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodecEncryptionMode with Double] = js.native
  
  /** globally disabled */
  @js.native
  sealed trait DISABLED extends CodecEncryptionMode
  /* 1 */ val DISABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.DISABLED with Double = js.native
  
  /** globally enabled */
  @js.native
  sealed trait ENABLED extends CodecEncryptionMode
  /* 2 */ val ENABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.ENABLED with Double = js.native
  
  /** configure per channel */
  @js.native
  sealed trait INDIVIDUAL extends CodecEncryptionMode
  /* 0 */ val INDIVIDUAL: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.INDIVIDUAL with Double = js.native
}
