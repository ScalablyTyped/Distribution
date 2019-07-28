package typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs

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
  sealed trait itemChanged extends CollectionChange
  
  /** An item is added to the collection. */
  @js.native
  sealed trait itemInserted extends CollectionChange
  
  /** An item is removed from the collection. */
  @js.native
  sealed trait itemRemoved extends CollectionChange
  
  /** The collection is changed. */
  @js.native
  sealed trait reset extends CollectionChange
  
  /* 3 */ val itemChanged: typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.CollectionChange.itemChanged with Double = js.native
  /* 1 */ val itemInserted: typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.CollectionChange.itemInserted with Double = js.native
  /* 2 */ val itemRemoved: typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.CollectionChange.itemRemoved with Double = js.native
  /* 0 */ val reset: typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.CollectionChange.reset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChange with Double] = js.native
}

