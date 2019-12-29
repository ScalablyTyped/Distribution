package typings.winrtDashUwp.Windows.Storage.AccessCache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecentStorageItemVisibility extends js.Object

/** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
@JSGlobal("Windows.Storage.AccessCache.RecentStorageItemVisibility")
@js.native
object RecentStorageItemVisibility extends js.Object {
  /** The storage item is visible in the MRU list for the app and the system. */
  @js.native
  sealed trait appAndSystem extends RecentStorageItemVisibility
  
  /** The storage item is visible in the MRU list for the app only. */
  @js.native
  sealed trait appOnly extends RecentStorageItemVisibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecentStorageItemVisibility with Double] = js.native
  /* 1 */ @js.native
  object appAndSystem extends TopLevel[appAndSystem with Double]
  
  /* 0 */ @js.native
  object appOnly extends TopLevel[appOnly with Double]
  
}

