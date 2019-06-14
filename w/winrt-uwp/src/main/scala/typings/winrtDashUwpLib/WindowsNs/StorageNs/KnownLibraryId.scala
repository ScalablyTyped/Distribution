package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KnownLibraryId extends js.Object

/** Provides values that identify storage libraries. */
@JSGlobal("Windows.Storage.KnownLibraryId")
@js.native
object KnownLibraryId extends js.Object {
  /** Documents library. */
  @js.native
  sealed trait documents
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId
  
  /** Music library. */
  @js.native
  sealed trait music
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId
  
  /** Pictures library. */
  @js.native
  sealed trait pictures
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId
  
  /** Videos library. */
  @js.native
  sealed trait videos
    extends winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId
  
  /* 3 */ val documents: documents with scala.Double = js.native
  /* 0 */ val music: music with scala.Double = js.native
  /* 1 */ val pictures: pictures with scala.Double = js.native
  /* 2 */ val videos: videos with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId with scala.Double] = js.native
}

