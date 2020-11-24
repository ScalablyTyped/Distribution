package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmType extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmType")
@js.native
object AVPlayDrmType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmType with String] = js.native
  
  @js.native
  sealed trait EME_PLAYREADY extends AVPlayDrmType
  /* "EME_PLAYREADY" */ @js.native
  object EME_PLAYREADY extends TopLevel[EME_PLAYREADY with String]
  
  @js.native
  sealed trait EME_WIDEVINE_CDM extends AVPlayDrmType
  /* "EME_WIDEVINE_CDM" */ @js.native
  object EME_WIDEVINE_CDM extends TopLevel[EME_WIDEVINE_CDM with String]
  
  @js.native
  sealed trait PLAYREADY extends AVPlayDrmType
  /* "PLAYREADY" */ @js.native
  object PLAYREADY extends TopLevel[PLAYREADY with String]
  
  @js.native
  sealed trait VERIMATRIX extends AVPlayDrmType
  /* "VERIMATRIX" */ @js.native
  object VERIMATRIX extends TopLevel[VERIMATRIX with String]
  
  @js.native
  sealed trait WIDEVINE_CDM extends AVPlayDrmType
  /* "WIDEVINE_CDM" */ @js.native
  object WIDEVINE_CDM extends TopLevel[WIDEVINE_CDM with String]
}
