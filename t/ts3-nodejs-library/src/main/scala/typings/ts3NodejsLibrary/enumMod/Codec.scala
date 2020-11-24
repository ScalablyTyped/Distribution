package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Codec extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "Codec")
@js.native
object Codec extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Codec with Double] = js.native
  
  /** celt mono (mono, 16bit, 48kHz) */
  @js.native
  sealed trait CELT_MONO extends Codec
  /* 3 */ @js.native
  object CELT_MONO extends TopLevel[CELT_MONO with Double]
  
  @js.native
  sealed trait OPUS_MUSIC extends Codec
  /* 5 */ @js.native
  object OPUS_MUSIC extends TopLevel[OPUS_MUSIC with Double]
  
  @js.native
  sealed trait OPUS_VOICE extends Codec
  /* 4 */ @js.native
  object OPUS_VOICE extends TopLevel[OPUS_VOICE with Double]
  
  /** speex narrowband (mono, 16bit, 8kHz) */
  @js.native
  sealed trait SPEEX_NARROWBAND extends Codec
  /* 0 */ @js.native
  object SPEEX_NARROWBAND extends TopLevel[SPEEX_NARROWBAND with Double]
  
  /** speex ultra-wideband (mono, 16bit, 32kHz) */
  @js.native
  sealed trait SPEEX_ULTRAWIDEBAND extends Codec
  /* 2 */ @js.native
  object SPEEX_ULTRAWIDEBAND extends TopLevel[SPEEX_ULTRAWIDEBAND with Double]
  
  /** speex wideband (mono, 16bit, 16kHz) */
  @js.native
  sealed trait SPEEX_WIDEBAND extends Codec
  /* 1 */ @js.native
  object SPEEX_WIDEBAND extends TopLevel[SPEEX_WIDEBAND with Double]
}
