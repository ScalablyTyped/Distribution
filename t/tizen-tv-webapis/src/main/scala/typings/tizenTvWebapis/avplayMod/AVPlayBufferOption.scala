package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayBufferOption extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayBufferOption")
@js.native
object AVPlayBufferOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayBufferOption with String] = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_FOR_PLAY extends AVPlayBufferOption
  /* "PLAYER_BUFFER_FOR_PLAY" */ @js.native
  object PLAYER_BUFFER_FOR_PLAY extends TopLevel[PLAYER_BUFFER_FOR_PLAY with String]
  
  @js.native
  sealed trait PLAYER_BUFFER_FOR_RESUME extends AVPlayBufferOption
  /* "PLAYER_BUFFER_FOR_RESUME" */ @js.native
  object PLAYER_BUFFER_FOR_RESUME extends TopLevel[PLAYER_BUFFER_FOR_RESUME with String]
}
