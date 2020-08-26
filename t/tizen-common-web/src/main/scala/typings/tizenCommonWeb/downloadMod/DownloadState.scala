package typings.tizenCommonWeb.downloadMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DownloadState extends js.Object

@JSImport("tizen-common-web/download", "DownloadState")
@js.native
object DownloadState extends js.Object {
  @js.native
  sealed trait ABANDONED extends DownloadState
  
  @js.native
  sealed trait CANCELED extends DownloadState
  
  @js.native
  sealed trait COMPLETED extends DownloadState
  
  @js.native
  sealed trait DOWNLOADING extends DownloadState
  
  @js.native
  sealed trait FAILED extends DownloadState
  
  @js.native
  sealed trait PAUSED extends DownloadState
  
  @js.native
  sealed trait QUEUED extends DownloadState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadState with String] = js.native
  /* "ABANDONED" */ @js.native
  object ABANDONED extends TopLevel[ABANDONED with String]
  
  /* "CANCELED" */ @js.native
  object CANCELED extends TopLevel[CANCELED with String]
  
  /* "COMPLETED" */ @js.native
  object COMPLETED extends TopLevel[COMPLETED with String]
  
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  /* "FAILED" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  /* "QUEUED" */ @js.native
  object QUEUED extends TopLevel[QUEUED with String]
  
}

