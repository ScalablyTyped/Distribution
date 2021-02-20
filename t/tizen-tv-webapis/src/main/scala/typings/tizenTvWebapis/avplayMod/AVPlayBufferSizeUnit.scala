package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayBufferSizeUnit extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayBufferSizeUnit")
@js.native
object AVPlayBufferSizeUnit extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayBufferSizeUnit with String] = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_SIZE_IN_BYTE extends AVPlayBufferSizeUnit
  /* "PLAYER_BUFFER_SIZE_IN_BYTE" */ val PLAYER_BUFFER_SIZE_IN_BYTE: typings.tizenTvWebapis.avplayMod.AVPlayBufferSizeUnit.PLAYER_BUFFER_SIZE_IN_BYTE with String = js.native
  
  @js.native
  sealed trait PLAYER_BUFFER_SIZE_IN_SECOND extends AVPlayBufferSizeUnit
  /* "PLAYER_BUFFER_SIZE_IN_SECOND" */ val PLAYER_BUFFER_SIZE_IN_SECOND: typings.tizenTvWebapis.avplayMod.AVPlayBufferSizeUnit.PLAYER_BUFFER_SIZE_IN_SECOND with String = js.native
}
