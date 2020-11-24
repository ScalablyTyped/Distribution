package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoNetworkType extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkType")
@js.native
object SystemInfoNetworkType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkType with String] = js.native
  
  @js.native
  sealed trait `2Dot5G` extends SystemInfoNetworkType
  /* "2.5G" */ @js.native
  object `2Dot5G` extends TopLevel[`2Dot5G` with String]
  
  @js.native
  sealed trait `2G` extends SystemInfoNetworkType
  /* "2G" */ @js.native
  object `2G` extends TopLevel[`2G` with String]
  
  @js.native
  sealed trait `3G` extends SystemInfoNetworkType
  /* "3G" */ @js.native
  object `3G` extends TopLevel[`3G` with String]
  
  @js.native
  sealed trait `4G` extends SystemInfoNetworkType
  /* "4G" */ @js.native
  object `4G` extends TopLevel[`4G` with String]
  
  @js.native
  sealed trait ETHERNET extends SystemInfoNetworkType
  /* "ETHERNET" */ @js.native
  object ETHERNET extends TopLevel[ETHERNET with String]
  
  @js.native
  sealed trait NET_PROXY extends SystemInfoNetworkType
  /* "NET_PROXY" */ @js.native
  object NET_PROXY extends TopLevel[NET_PROXY with String]
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkType
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  @js.native
  sealed trait UNKNOWN extends SystemInfoNetworkType
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
  @js.native
  sealed trait WIFI extends SystemInfoNetworkType
  /* "WIFI" */ @js.native
  object WIFI extends TopLevel[WIFI with String]
}
