package typings.tizenCommonWeb.tvaudiocontrolMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioOutputMode extends js.Object
@JSImport("tizen-common-web/tvaudiocontrol", "AudioOutputMode")
@js.native
object AudioOutputMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AudioOutputMode with String] = js.native
  
  @js.native
  sealed trait AAC extends AudioOutputMode
  /* "AAC" */ @js.native
  object AAC extends TopLevel[AAC with String]
  
  @js.native
  sealed trait DOLBY extends AudioOutputMode
  /* "DOLBY" */ @js.native
  object DOLBY extends TopLevel[DOLBY with String]
  
  @js.native
  sealed trait DOLBY_DIGITAL_PLUS extends AudioOutputMode
  /* "DOLBY_DIGITAL_PLUS" */ @js.native
  object DOLBY_DIGITAL_PLUS extends TopLevel[DOLBY_DIGITAL_PLUS with String]
  
  @js.native
  sealed trait DTS extends AudioOutputMode
  /* "DTS" */ @js.native
  object DTS extends TopLevel[DTS with String]
  
  @js.native
  sealed trait PCM extends AudioOutputMode
  /* "PCM" */ @js.native
  object PCM extends TopLevel[PCM with String]
}
