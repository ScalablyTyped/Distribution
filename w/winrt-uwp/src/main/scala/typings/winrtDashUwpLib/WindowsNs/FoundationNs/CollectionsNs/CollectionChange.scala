package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChange extends js.Object

/** Describes the action that causes a change to a collection. */
@JSGlobal("Windows.Foundation.Collections.CollectionChange")
@js.native
object CollectionChange extends js.Object {
  /** An item is changed in the collection. */
  @js.native
  sealed trait itemChanged
    extends winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  /** An item is added to the collection. */
  @js.native
  sealed trait itemInserted
    extends winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  /** An item is removed from the collection. */
  @js.native
  sealed trait itemRemoved
    extends winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  /** The collection is changed. */
  @js.native
  sealed trait reset
    extends winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  /* 3 */ val itemChanged: itemChanged with scala.Double = js.native
  /* 1 */ val itemInserted: itemInserted with scala.Double = js.native
  /* 2 */ val itemRemoved: itemRemoved with scala.Double = js.native
  /* 0 */ val reset: reset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange with scala.Double
  ] = js.native
}

