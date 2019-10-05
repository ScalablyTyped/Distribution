package typings.winrtDashUwp.Windows.Storage

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
  sealed trait documents extends KnownLibraryId
  
  /** Music library. */
  @js.native
  sealed trait music extends KnownLibraryId
  
  /** Pictures library. */
  @js.native
  sealed trait pictures extends KnownLibraryId
  
  /** Videos library. */
  @js.native
  sealed trait videos extends KnownLibraryId
  
  /* 3 */ val documents: typings.winrtDashUwp.Windows.Storage.KnownLibraryId.documents with Double = js.native
  /* 0 */ val music: typings.winrtDashUwp.Windows.Storage.KnownLibraryId.music with Double = js.native
  /* 1 */ val pictures: typings.winrtDashUwp.Windows.Storage.KnownLibraryId.pictures with Double = js.native
  /* 2 */ val videos: typings.winrtDashUwp.Windows.Storage.KnownLibraryId.videos with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownLibraryId with Double] = js.native
}

