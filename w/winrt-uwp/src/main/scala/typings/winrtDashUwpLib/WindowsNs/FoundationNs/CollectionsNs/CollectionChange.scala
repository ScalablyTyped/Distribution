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
  
  val itemChanged: itemChanged with java.lang.String = js.native
  val itemInserted: itemInserted with java.lang.String = js.native
  val itemRemoved: itemRemoved with java.lang.String = js.native
  val reset: reset with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange with java.lang.String
  ] = js.native
}

