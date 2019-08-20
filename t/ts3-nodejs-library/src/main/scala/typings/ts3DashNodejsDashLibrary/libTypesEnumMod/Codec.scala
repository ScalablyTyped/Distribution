package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Codec extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "Codec")
@js.native
object Codec extends js.Object {
  /** celt mono (mono, 16bit, 48kHz) */
  @js.native
  sealed trait CELT_MONO extends Codec
  
  /** speex narrowband (mono, 16bit, 8kHz) */
  @js.native
  sealed trait SPEEX_NARROWBAND extends Codec
  
  /** speex ultra-wideband (mono, 16bit, 32kHz) */
  @js.native
  sealed trait SPEEX_ULTRAWIDEBAND extends Codec
  
  /** speex wideband (mono, 16bit, 16kHz) */
  @js.native
  sealed trait SPEEX_WIDEBAND extends Codec
  
  /* 3 */ val CELT_MONO: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.CELT_MONO with Double = js.native
  /* 0 */ val SPEEX_NARROWBAND: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_NARROWBAND with Double = js.native
  /* 2 */ val SPEEX_ULTRAWIDEBAND: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_ULTRAWIDEBAND with Double = js.native
  /* 1 */ val SPEEX_WIDEBAND: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec.SPEEX_WIDEBAND with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Codec with Double] = js.native
}

