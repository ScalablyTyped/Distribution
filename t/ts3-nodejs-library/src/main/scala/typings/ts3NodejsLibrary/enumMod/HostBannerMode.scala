package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostBannerMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "HostBannerMode")
@js.native
object HostBannerMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostBannerMode with Double] = js.native
  
  /** adjust but ignore aspect ratio (like TeamSpeak 2) */
  @js.native
  sealed trait IGNOREASPECT extends HostBannerMode
  /* 1 */ val IGNOREASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.IGNOREASPECT with Double = js.native
  
  /** adjust and keep aspect ratio */
  @js.native
  sealed trait KEEPASPECT extends HostBannerMode
  /* 2 */ val KEEPASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.KEEPASPECT with Double = js.native
  
  /** do not adjust */
  @js.native
  sealed trait NOADJUST extends HostBannerMode
  /* 0 */ val NOADJUST: typings.ts3NodejsLibrary.enumMod.HostBannerMode.NOADJUST with Double = js.native
}
