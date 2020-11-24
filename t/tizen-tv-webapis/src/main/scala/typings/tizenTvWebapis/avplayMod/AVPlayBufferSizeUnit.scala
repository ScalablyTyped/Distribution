package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayBufferSizeUnit extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayBufferSizeUnit")
@js.native
object AVPlayBufferSizeUnit extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayBufferSizeUnit with String] = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_SIZE_IN_BYTE extends AVPlayBufferSizeUnit
  /* "PLAYER_BUFFER_SIZE_IN_BYTE" */ @js.native
  object PLAYER_BUFFER_SIZE_IN_BYTE extends TopLevel[PLAYER_BUFFER_SIZE_IN_BYTE with String]
  
  @js.native
  sealed trait PLAYER_BUFFER_SIZE_IN_SECOND extends AVPlayBufferSizeUnit
  /* "PLAYER_BUFFER_SIZE_IN_SECOND" */ @js.native
  object PLAYER_BUFFER_SIZE_IN_SECOND extends TopLevel[PLAYER_BUFFER_SIZE_IN_SECOND with String]
}
