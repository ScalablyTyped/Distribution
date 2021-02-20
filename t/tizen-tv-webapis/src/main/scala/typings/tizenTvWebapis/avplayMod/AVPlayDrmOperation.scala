package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmOperation extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmOperation")
@js.native
object AVPlayDrmOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmOperation with String] = js.native
  
  @js.native
  sealed trait Finalize extends AVPlayDrmOperation
  /* "Finalize" */ val Finalize: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Finalize with String = js.native
  
  @js.native
  sealed trait GetUID extends AVPlayDrmOperation
  /* "GetUID" */ val GetUID: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.GetUID with String = js.native
  
  @js.native
  sealed trait Initialize extends AVPlayDrmOperation
  /* "Initialize" */ val Initialize: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.Initialize with String = js.native
  
  @js.native
  sealed trait InstallLicense extends AVPlayDrmOperation
  /* "InstallLicense" */ val InstallLicense: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.InstallLicense with String = js.native
  
  @js.native
  sealed trait ProcessInitiator extends AVPlayDrmOperation
  /* "ProcessInitiator" */ val ProcessInitiator: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.ProcessInitiator with String = js.native
  
  @js.native
  sealed trait SetProperties extends AVPlayDrmOperation
  /* "SetProperties" */ val SetProperties: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.SetProperties with String = js.native
  
  @js.native
  sealed trait widevine_app_session extends AVPlayDrmOperation
  /* "widevine_app_session" */ val widevine_app_session: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_app_session with String = js.native
  
  @js.native
  sealed trait widevine_data_type extends AVPlayDrmOperation
  /* "widevine_data_type" */ val widevine_data_type: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_data_type with String = js.native
  
  @js.native
  sealed trait widevine_license_data extends AVPlayDrmOperation
  /* "widevine_license_data" */ val widevine_license_data: typings.tizenTvWebapis.avplayMod.AVPlayDrmOperation.widevine_license_data with String = js.native
}
