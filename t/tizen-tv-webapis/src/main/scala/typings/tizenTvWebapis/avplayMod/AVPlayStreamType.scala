package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayStreamType extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayStreamType")
@js.native
object AVPlayStreamType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayStreamType with String] = js.native
  
  @js.native
  sealed trait AUDIO extends AVPlayStreamType
  /* "AUDIO" */ val AUDIO: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.AUDIO with String = js.native
  
  @js.native
  sealed trait TEXT extends AVPlayStreamType
  /* "TEXT" */ val TEXT: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.TEXT with String = js.native
  
  @js.native
  sealed trait VIDEO extends AVPlayStreamType
  /* "VIDEO" */ val VIDEO: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.VIDEO with String = js.native
}
