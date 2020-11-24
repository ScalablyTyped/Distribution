package typings.tizenCommonWeb.downloadMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DownloadState extends js.Object
@JSImport("tizen-common-web/download", "DownloadState")
@js.native
object DownloadState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadState with String] = js.native
  
  @js.native
  sealed trait ABANDONED extends DownloadState
  /* "ABANDONED" */ @js.native
  object ABANDONED extends TopLevel[ABANDONED with String]
  
  @js.native
  sealed trait CANCELED extends DownloadState
  /* "CANCELED" */ @js.native
  object CANCELED extends TopLevel[CANCELED with String]
  
  @js.native
  sealed trait COMPLETED extends DownloadState
  /* "COMPLETED" */ @js.native
  object COMPLETED extends TopLevel[COMPLETED with String]
  
  @js.native
  sealed trait DOWNLOADING extends DownloadState
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  @js.native
  sealed trait FAILED extends DownloadState
  /* "FAILED" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  @js.native
  sealed trait PAUSED extends DownloadState
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  @js.native
  sealed trait QUEUED extends DownloadState
  /* "QUEUED" */ @js.native
  object QUEUED extends TopLevel[QUEUED with String]
}
