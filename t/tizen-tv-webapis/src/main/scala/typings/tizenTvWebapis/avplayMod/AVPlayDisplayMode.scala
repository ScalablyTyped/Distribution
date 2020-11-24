package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDisplayMode extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayDisplayMode")
@js.native
object AVPlayDisplayMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDisplayMode with String] = js.native
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO extends AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO" */ @js.native
  object PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO extends TopLevel[PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO with String]
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_FULL_SCREEN extends AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_FULL_SCREEN" */ @js.native
  object PLAYER_DISPLAY_MODE_FULL_SCREEN extends TopLevel[PLAYER_DISPLAY_MODE_FULL_SCREEN with String]
  
  @js.native
  sealed trait PLAYER_DISPLAY_MODE_LETTER_BOX extends AVPlayDisplayMode
  /* "PLAYER_DISPLAY_MODE_LETTER_BOX" */ @js.native
  object PLAYER_DISPLAY_MODE_LETTER_BOX extends TopLevel[PLAYER_DISPLAY_MODE_LETTER_BOX with String]
}
