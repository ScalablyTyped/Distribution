package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmOperation extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmOperation")
@js.native
object AVPlayDrmOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmOperation & String] = js.native
  
  @js.native
  sealed trait Finalize
    extends StObject
       with AVPlayDrmOperation
  /* "Finalize" */ val Finalize: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Finalize & String = js.native
  
  @js.native
  sealed trait GetUID
    extends StObject
       with AVPlayDrmOperation
  /* "GetUID" */ val GetUID: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.GetUID & String = js.native
  
  @js.native
  sealed trait Initialize
    extends StObject
       with AVPlayDrmOperation
  /* "Initialize" */ val Initialize: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Initialize & String = js.native
  
  @js.native
  sealed trait InstallLicense
    extends StObject
       with AVPlayDrmOperation
  /* "InstallLicense" */ val InstallLicense: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.InstallLicense & String = js.native
  
  @js.native
  sealed trait ProcessInitiator
    extends StObject
       with AVPlayDrmOperation
  /* "ProcessInitiator" */ val ProcessInitiator: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.ProcessInitiator & String = js.native
  
  @js.native
  sealed trait SetProperties
    extends StObject
       with AVPlayDrmOperation
  /* "SetProperties" */ val SetProperties: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.SetProperties & String = js.native
  
  @js.native
  sealed trait widevine_app_session
    extends StObject
       with AVPlayDrmOperation
  /* "widevine_app_session" */ val widevine_app_session: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_app_session & String = js.native
  
  @js.native
  sealed trait widevine_data_type
    extends StObject
       with AVPlayDrmOperation
  /* "widevine_data_type" */ val widevine_data_type: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_data_type & String = js.native
  
  @js.native
  sealed trait widevine_license_data
    extends StObject
       with AVPlayDrmOperation
  /* "widevine_license_data" */ val widevine_license_data: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_license_data & String = js.native
}
