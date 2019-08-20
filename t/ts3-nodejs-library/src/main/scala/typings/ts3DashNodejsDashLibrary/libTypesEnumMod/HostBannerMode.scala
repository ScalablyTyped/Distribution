package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostBannerMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "HostBannerMode")
@js.native
object HostBannerMode extends js.Object {
  /** adjust but ignore aspect ratio (like TeamSpeak 2) */
  @js.native
  sealed trait IGNOREASPECT extends HostBannerMode
  
  /** adjust and keep aspect ratio */
  @js.native
  sealed trait KEEPASPECT extends HostBannerMode
  
  /** do not adjust */
  @js.native
  sealed trait NOADJUST extends HostBannerMode
  
  /* 1 */ val IGNOREASPECT: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.IGNOREASPECT with Double = js.native
  /* 2 */ val KEEPASPECT: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.KEEPASPECT with Double = js.native
  /* 0 */ val NOADJUST: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode.NOADJUST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostBannerMode with Double] = js.native
}

