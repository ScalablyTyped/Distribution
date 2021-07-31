package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayStreamType extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayStreamType")
@js.native
object AVPlayStreamType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayStreamType & String] = js.native
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with AVPlayStreamType
  /* "AUDIO" */ val AUDIO: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.AUDIO & String = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with AVPlayStreamType
  /* "TEXT" */ val TEXT: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.TEXT & String = js.native
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with AVPlayStreamType
  /* "VIDEO" */ val VIDEO: typings.tizenTvWebapis.avplayMod.AVPlayStreamType.VIDEO & String = js.native
}
