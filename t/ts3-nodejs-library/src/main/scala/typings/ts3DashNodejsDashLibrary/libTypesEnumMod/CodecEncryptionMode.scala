package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CodecEncryptionMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "CodecEncryptionMode")
@js.native
object CodecEncryptionMode extends js.Object {
  /** globally disabled */
  @js.native
  sealed trait DISABLED extends CodecEncryptionMode
  
  /** globally enabled */
  @js.native
  sealed trait ENABLED extends CodecEncryptionMode
  
  /** configure per channel */
  @js.native
  sealed trait INDIVIDUAL extends CodecEncryptionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodecEncryptionMode with Double] = js.native
  /* 1 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  /* 2 */ @js.native
  object ENABLED extends TopLevel[ENABLED with Double]
  
  /* 0 */ @js.native
  object INDIVIDUAL extends TopLevel[INDIVIDUAL with Double]
  
}

