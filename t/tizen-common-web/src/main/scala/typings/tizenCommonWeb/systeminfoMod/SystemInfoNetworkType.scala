package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoNetworkType extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoNetworkType")
@js.native
object SystemInfoNetworkType extends js.Object {
  @js.native
  sealed trait `2Dot5G` extends SystemInfoNetworkType
  
  @js.native
  sealed trait `2G` extends SystemInfoNetworkType
  
  @js.native
  sealed trait `3G` extends SystemInfoNetworkType
  
  @js.native
  sealed trait `4G` extends SystemInfoNetworkType
  
  @js.native
  sealed trait ETHERNET extends SystemInfoNetworkType
  
  @js.native
  sealed trait NET_PROXY extends SystemInfoNetworkType
  
  @js.native
  sealed trait NONE extends SystemInfoNetworkType
  
  @js.native
  sealed trait UNKNOWN extends SystemInfoNetworkType
  
  @js.native
  sealed trait WIFI extends SystemInfoNetworkType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoNetworkType with String] = js.native
  /* "2.5G" */ @js.native
  object `2Dot5G` extends TopLevel[`2Dot5G` with String]
  
  /* "2G" */ @js.native
  object `2G` extends TopLevel[`2G` with String]
  
  /* "3G" */ @js.native
  object `3G` extends TopLevel[`3G` with String]
  
  /* "4G" */ @js.native
  object `4G` extends TopLevel[`4G` with String]
  
  /* "ETHERNET" */ @js.native
  object ETHERNET extends TopLevel[ETHERNET with String]
  
  /* "NET_PROXY" */ @js.native
  object NET_PROXY extends TopLevel[NET_PROXY with String]
  
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
  /* "WIFI" */ @js.native
  object WIFI extends TopLevel[WIFI with String]
  
}

