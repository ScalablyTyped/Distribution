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
  
  val itemChanged: itemChanged with java.lang.String = js.native
  val itemInserted: itemInserted with java.lang.String = js.native
  val itemRemoved: itemRemoved with java.lang.String = js.native
  val reset: reset with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.CollectionChange with java.lang.String
  ] = js.native
}

