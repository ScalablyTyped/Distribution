package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmType extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmType")
@js.native
object AVPlayDrmType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmType with String] = js.native
  
  @js.native
  sealed trait EME_PLAYREADY extends AVPlayDrmType
  /* "EME_PLAYREADY" */ val EME_PLAYREADY: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.EME_PLAYREADY with String = js.native
  
  @js.native
  sealed trait EME_WIDEVINE_CDM extends AVPlayDrmType
  /* "EME_WIDEVINE_CDM" */ val EME_WIDEVINE_CDM: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.EME_WIDEVINE_CDM with String = js.native
  
  @js.native
  sealed trait PLAYREADY extends AVPlayDrmType
  /* "PLAYREADY" */ val PLAYREADY: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.PLAYREADY with String = js.native
  
  @js.native
  sealed trait VERIMATRIX extends AVPlayDrmType
  /* "VERIMATRIX" */ val VERIMATRIX: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.VERIMATRIX with String = js.native
  
  @js.native
  sealed trait WIDEVINE_CDM extends AVPlayDrmType
  /* "WIDEVINE_CDM" */ val WIDEVINE_CDM: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.WIDEVINE_CDM with String = js.native
}
