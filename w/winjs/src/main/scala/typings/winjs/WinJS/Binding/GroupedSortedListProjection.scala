package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Do not instantiate. Sorts the underlying list by group key and within a group respects the position of the item in the underlying list. Returned by createGrouped.
  **/
@js.native
trait GroupedSortedListProjection[T, G] extends SortedListProjection[T] {
  
  //#region Properties
  /**
    * Gets a List, which is a projection of the groups that were identified in this list.
    **/
  var groups: GroupsListProjection[G] = js.native
}
