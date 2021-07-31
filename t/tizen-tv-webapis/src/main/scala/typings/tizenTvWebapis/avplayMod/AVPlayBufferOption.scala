package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayBufferOption extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayBufferOption")
@js.native
object AVPlayBufferOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayBufferOption & String] = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_FOR_PLAY
    extends StObject
       with AVPlayBufferOption
  /* "PLAYER_BUFFER_FOR_PLAY" */ val PLAYER_BUFFER_FOR_PLAY: typings.tizenTvWebapis.avplayMod.AVPlayBufferOption.PLAYER_BUFFER_FOR_PLAY & String = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_FOR_RESUME
    extends StObject
       with AVPlayBufferOption
  /* "PLAYER_BUFFER_FOR_RESUME" */ val PLAYER_BUFFER_FOR_RESUME: typings.tizenTvWebapis.avplayMod.AVPlayBufferOption.PLAYER_BUFFER_FOR_RESUME & String = js.native
}
