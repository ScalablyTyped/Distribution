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
  
  val documents: documents with java.lang.String = js.native
  val music: music with java.lang.String = js.native
  val pictures: pictures with java.lang.String = js.native
  val videos: videos with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId with java.lang.String] = js.native
}

