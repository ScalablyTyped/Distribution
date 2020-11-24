package typings.tizenCommonWeb.downloadMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DownloadNetworkType extends js.Object
@JSImport("tizen-common-web/download", "DownloadNetworkType")
@js.native
object DownloadNetworkType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadNetworkType with String] = js.native
  
  @js.native
  sealed trait ALL extends DownloadNetworkType
  /* "ALL" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  @js.native
  sealed trait CELLULAR extends DownloadNetworkType
  /* "CELLULAR" */ @js.native
  object CELLULAR extends TopLevel[CELLULAR with String]
  
  @js.native
  sealed trait WIFI extends DownloadNetworkType
  /* "WIFI" */ @js.native
  object WIFI extends TopLevel[WIFI with String]
}
