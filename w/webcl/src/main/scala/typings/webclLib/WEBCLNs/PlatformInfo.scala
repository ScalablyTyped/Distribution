package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlatformInfo extends js.Object

/* cl_platforinfo */
@JSGlobal("WEBCL.PlatformInfo")
@js.native
object PlatformInfo extends js.Object {
  @js.native
  sealed trait PLATFORM_EXTENSIONS
    extends webclLib.WEBCLNs.PlatformInfo
  
  @js.native
  sealed trait PLATFORM_NAME
    extends webclLib.WEBCLNs.PlatformInfo
  
  @js.native
  sealed trait PLATFORM_PROFILE
    extends webclLib.WEBCLNs.PlatformInfo
  
  @js.native
  sealed trait PLATFORM_VENDOR
    extends webclLib.WEBCLNs.PlatformInfo
  
  @js.native
  sealed trait PLATFORM_VERSION
    extends webclLib.WEBCLNs.PlatformInfo
  
  /* 0x0904 */ val PLATFORM_EXTENSIONS: PLATFORM_EXTENSIONS with scala.Double = js.native
  /* 0x0902 */ val PLATFORM_NAME: PLATFORM_NAME with scala.Double = js.native
  /* 0x0900 */ val PLATFORM_PROFILE: PLATFORM_PROFILE with scala.Double = js.native
  /* 0x0903 */ val PLATFORM_VENDOR: PLATFORM_VENDOR with scala.Double = js.native
  /* 0x0901 */ val PLATFORM_VERSION: PLATFORM_VERSION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.PlatformInfo with scala.Double] = js.native
}

