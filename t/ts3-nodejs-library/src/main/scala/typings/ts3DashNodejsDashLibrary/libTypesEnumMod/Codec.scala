package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Codec with Double] = js.native
  /* 3 */ @js.native
  object CELT_MONO extends TopLevel[CELT_MONO with Double]
  
  /* 0 */ @js.native
  object SPEEX_NARROWBAND extends TopLevel[SPEEX_NARROWBAND with Double]
  
  /* 2 */ @js.native
  object SPEEX_ULTRAWIDEBAND extends TopLevel[SPEEX_ULTRAWIDEBAND with Double]
  
  /* 1 */ @js.native
  object SPEEX_WIDEBAND extends TopLevel[SPEEX_WIDEBAND with Double]
  
}

