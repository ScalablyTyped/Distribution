package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmType extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmType")
@js.native
object AVPlayDrmType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmType & String] = js.native
  
  @js.native
  sealed trait EME_PLAYREADY
    extends StObject
       with AVPlayDrmType
  /* "EME_PLAYREADY" */ val EME_PLAYREADY: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.EME_PLAYREADY & String = js.native
  
  @js.native
  sealed trait EME_WIDEVINE_CDM
    extends StObject
       with AVPlayDrmType
  /* "EME_WIDEVINE_CDM" */ val EME_WIDEVINE_CDM: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.EME_WIDEVINE_CDM & String = js.native
  
  @js.native
  sealed trait PLAYREADY
    extends StObject
       with AVPlayDrmType
  /* "PLAYREADY" */ val PLAYREADY: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.PLAYREADY & String = js.native
  
  @js.native
  sealed trait VERIMATRIX
    extends StObject
       with AVPlayDrmType
  /* "VERIMATRIX" */ val VERIMATRIX: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.VERIMATRIX & String = js.native
  
  @js.native
  sealed trait WIDEVINE_CDM
    extends StObject
       with AVPlayDrmType
  /* "WIDEVINE_CDM" */ val WIDEVINE_CDM: typings.tizenTvWebapis.avplayMod.AVPlayDrmType.WIDEVINE_CDM & String = js.native
}
