package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

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
  
  /* 1 */ val DISABLED: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.DISABLED with Double = js.native
  /* 2 */ val ENABLED: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.ENABLED with Double = js.native
  /* 0 */ val INDIVIDUAL: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode.INDIVIDUAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CodecEncryptionMode with Double] = js.native
}

