package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayPlayerState extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayPlayerState")
@js.native
object AVPlayPlayerState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayPlayerState with String] = js.native
  
  @js.native
  sealed trait IDLE extends AVPlayPlayerState
  /* "IDLE" */ val IDLE: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.IDLE with String = js.native
  
  @js.native
  sealed trait NONE extends AVPlayPlayerState
  /* "NONE" */ val NONE: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.NONE with String = js.native
  
  @js.native
  sealed trait PAUSED extends AVPlayPlayerState
  /* "PAUSED" */ val PAUSED: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.PAUSED with String = js.native
  
  @js.native
  sealed trait PLAYING extends AVPlayPlayerState
  /* "PLAYING" */ val PLAYING: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.PLAYING with String = js.native
  
  @js.native
  sealed trait READY extends AVPlayPlayerState
  /* "READY" */ val READY: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.READY with String = js.native
}
