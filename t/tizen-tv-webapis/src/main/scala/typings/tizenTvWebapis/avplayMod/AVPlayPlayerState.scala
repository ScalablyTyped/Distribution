package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayPlayerState extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayPlayerState")
@js.native
object AVPlayPlayerState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayPlayerState & String] = js.native
  
  @js.native
  sealed trait IDLE
    extends StObject
       with AVPlayPlayerState
  /* "IDLE" */ val IDLE: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.IDLE & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with AVPlayPlayerState
  /* "NONE" */ val NONE: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.NONE & String = js.native
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with AVPlayPlayerState
  /* "PAUSED" */ val PAUSED: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.PAUSED & String = js.native
  
  @js.native
  sealed trait PLAYING
    extends StObject
       with AVPlayPlayerState
  /* "PLAYING" */ val PLAYING: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.PLAYING & String = js.native
  
  @js.native
  sealed trait READY
    extends StObject
       with AVPlayPlayerState
  /* "READY" */ val READY: typings.tizenTvWebapis.avplayMod.AVPlayPlayerState.READY & String = js.native
}
