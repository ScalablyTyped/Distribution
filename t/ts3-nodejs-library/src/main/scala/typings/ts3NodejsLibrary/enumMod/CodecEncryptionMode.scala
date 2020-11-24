package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodecEncryptionMode extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "CodecEncryptionMode")
@js.native
object CodecEncryptionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodecEncryptionMode with Double] = js.native
  
  /** globally disabled */
  @js.native
  sealed trait DISABLED extends CodecEncryptionMode
  /* 1 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  /** globally enabled */
  @js.native
  sealed trait ENABLED extends CodecEncryptionMode
  /* 2 */ @js.native
  object ENABLED extends TopLevel[ENABLED with Double]
  
  /** configure per channel */
  @js.native
  sealed trait INDIVIDUAL extends CodecEncryptionMode
  /* 0 */ @js.native
  object INDIVIDUAL extends TopLevel[INDIVIDUAL with Double]
}
