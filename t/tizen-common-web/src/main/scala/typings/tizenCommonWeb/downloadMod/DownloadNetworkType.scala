package typings.tizenCommonWeb.downloadMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DownloadNetworkType extends js.Object

@JSImport("tizen-common-web/download", "DownloadNetworkType")
@js.native
object DownloadNetworkType extends js.Object {
  @js.native
  sealed trait ALL extends DownloadNetworkType
  
  @js.native
  sealed trait CELLULAR extends DownloadNetworkType
  
  @js.native
  sealed trait WIFI extends DownloadNetworkType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadNetworkType with String] = js.native
  /* "ALL" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "CELLULAR" */ @js.native
  object CELLULAR extends TopLevel[CELLULAR with String]
  
  /* "WIFI" */ @js.native
  object WIFI extends TopLevel[WIFI with String]
  
}

