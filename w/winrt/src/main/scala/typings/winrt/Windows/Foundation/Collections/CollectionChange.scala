package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChange extends js.Object

@JSGlobal("Windows.Foundation.Collections.CollectionChange")
@js.native
object CollectionChange extends js.Object {
  @js.native
  sealed trait itemChanged extends CollectionChange
  
  @js.native
  sealed trait itemInserted extends CollectionChange
  
  @js.native
  sealed trait itemRemoved extends CollectionChange
  
  @js.native
  sealed trait reset extends CollectionChange
  
  /* 3 */ val itemChanged: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
  /* 1 */ val itemInserted: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
  /* 2 */ val itemRemoved: typings.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
  /* 0 */ val reset: typings.winrt.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChange with Double] = js.native
}

