package typings.winrtUwp.Windows.Foundation.Collections

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
  
}

