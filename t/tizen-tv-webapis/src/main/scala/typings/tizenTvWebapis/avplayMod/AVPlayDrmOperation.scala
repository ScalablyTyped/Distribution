package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayDrmOperation extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayDrmOperation")
@js.native
object AVPlayDrmOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayDrmOperation with String] = js.native
  
  @js.native
  sealed trait Finalize extends AVPlayDrmOperation
  /* "Finalize" */ @js.native
  object Finalize extends TopLevel[Finalize with String]
  
  @js.native
  sealed trait GetUID extends AVPlayDrmOperation
  /* "GetUID" */ @js.native
  object GetUID extends TopLevel[GetUID with String]
  
  @js.native
  sealed trait Initialize extends AVPlayDrmOperation
  /* "Initialize" */ @js.native
  object Initialize extends TopLevel[Initialize with String]
  
  @js.native
  sealed trait InstallLicense extends AVPlayDrmOperation
  /* "InstallLicense" */ @js.native
  object InstallLicense extends TopLevel[InstallLicense with String]
  
  @js.native
  sealed trait ProcessInitiator extends AVPlayDrmOperation
  /* "ProcessInitiator" */ @js.native
  object ProcessInitiator extends TopLevel[ProcessInitiator with String]
  
  @js.native
  sealed trait SetProperties extends AVPlayDrmOperation
  /* "SetProperties" */ @js.native
  object SetProperties extends TopLevel[SetProperties with String]
  
  @js.native
  sealed trait widevine_app_session extends AVPlayDrmOperation
  /* "widevine_app_session" */ @js.native
  object widevine_app_session extends TopLevel[widevine_app_session with String]
  
  @js.native
  sealed trait widevine_data_type extends AVPlayDrmOperation
  /* "widevine_data_type" */ @js.native
  object widevine_data_type extends TopLevel[widevine_data_type with String]
  
  @js.native
  sealed trait widevine_license_data extends AVPlayDrmOperation
  /* "widevine_license_data" */ @js.native
  object widevine_license_data extends TopLevel[widevine_license_data with String]
}
