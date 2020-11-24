package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostBannerMode extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "HostBannerMode")
@js.native
object HostBannerMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostBannerMode with Double] = js.native
  
  /** adjust but ignore aspect ratio (like TeamSpeak 2) */
  @js.native
  sealed trait IGNOREASPECT extends HostBannerMode
  /* 1 */ @js.native
  object IGNOREASPECT extends TopLevel[IGNOREASPECT with Double]
  
  /** adjust and keep aspect ratio */
  @js.native
  sealed trait KEEPASPECT extends HostBannerMode
  /* 2 */ @js.native
  object KEEPASPECT extends TopLevel[KEEPASPECT with Double]
  
  /** do not adjust */
  @js.native
  sealed trait NOADJUST extends HostBannerMode
  /* 0 */ @js.native
  object NOADJUST extends TopLevel[NOADJUST with Double]
}
