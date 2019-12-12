package typings.winrtDashUwp.Windows.Foundation.Collections

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.CollectionChange.itemChanged
import typings.winrtDashUwp.Windows.Foundation.Collections.CollectionChange.itemInserted
import typings.winrtDashUwp.Windows.Foundation.Collections.CollectionChange.itemRemoved
import typings.winrtDashUwp.Windows.Foundation.Collections.CollectionChange.reset
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChange with Double] = js.native
  /* 3 */ @js.native
  object itemChanged extends TopLevel[itemChanged with Double]
  
  /* 1 */ @js.native
  object itemInserted extends TopLevel[itemInserted with Double]
  
  /* 2 */ @js.native
  object itemRemoved extends TopLevel[itemRemoved with Double]
  
  /* 0 */ @js.native
  object reset extends TopLevel[reset with Double]
  
}

