package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDisplayMode extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDisplayMode")
@js.native
object AVPlayDisplayMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDisplayMode & String] = js.native
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO
    extends StObject
       with AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO" */ val PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO: typings.tizenTvWebapis.avplayMod.AVPlayDisplayMode.PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO & String = js.native
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_FULL_SCREEN
    extends StObject
       with AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_FULL_SCREEN" */ val PLAYER_DISPLAY_MODE_FULL_SCREEN: typings.tizenTvWebapis.avplayMod.AVPlayDisplayMode.PLAYER_DISPLAY_MODE_FULL_SCREEN & String = js.native
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_LETTER_BOX
    extends StObject
       with AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_LETTER_BOX" */ val PLAYER_DISPLAY_MODE_LETTER_BOX: typings.tizenTvWebapis.avplayMod.AVPlayDisplayMode.PLAYER_DISPLAY_MODE_LETTER_BOX & String = js.native
}
