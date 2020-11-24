package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayPlayerState extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayPlayerState")
@js.native
object AVPlayPlayerState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayPlayerState with String] = js.native
  
  @js.native
  sealed trait IDLE extends AVPlayPlayerState
  /* "IDLE" */ @js.native
  object IDLE extends TopLevel[IDLE with String]
  
  @js.native
  sealed trait NONE extends AVPlayPlayerState
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  @js.native
  sealed trait PAUSED extends AVPlayPlayerState
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  @js.native
  sealed trait PLAYING extends AVPlayPlayerState
  /* "PLAYING" */ @js.native
  object PLAYING extends TopLevel[PLAYING with String]
  
  @js.native
  sealed trait READY extends AVPlayPlayerState
  /* "READY" */ @js.native
  object READY extends TopLevel[READY with String]
}
