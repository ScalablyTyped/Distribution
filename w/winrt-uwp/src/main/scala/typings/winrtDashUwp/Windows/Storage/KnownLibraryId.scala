package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.KnownLibraryId.documents
import typings.winrtDashUwp.Windows.Storage.KnownLibraryId.music
import typings.winrtDashUwp.Windows.Storage.KnownLibraryId.pictures
import typings.winrtDashUwp.Windows.Storage.KnownLibraryId.videos
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownLibraryId with Double] = js.native
  /* 3 */ @js.native
  object documents extends TopLevel[documents with Double]
  
  /* 0 */ @js.native
  object music extends TopLevel[music with Double]
  
  /* 1 */ @js.native
  object pictures extends TopLevel[pictures with Double]
  
  /* 2 */ @js.native
  object videos extends TopLevel[videos with Double]
  
}

