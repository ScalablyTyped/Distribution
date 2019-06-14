package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChange extends js.Object

@JSGlobal("Windows.Foundation.Collections.CollectionChange")
@js.native
object CollectionChange extends js.Object {
  @js.native
  sealed trait itemChanged
    extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  @js.native
  sealed trait itemInserted
    extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  @js.native
  sealed trait itemRemoved
    extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  @js.native
  sealed trait reset
    extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange
  
  /* 3 */ val itemChanged: itemChanged with scala.Double = js.native
  /* 1 */ val itemInserted: itemInserted with scala.Double = js.native
  /* 2 */ val itemRemoved: itemRemoved with scala.Double = js.native
  /* 0 */ val reset: reset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange with scala.Double] = js.native
}

