package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryEntry[T] extends js.Object {
  
  /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
  var changeList: ChangeList[T] = js.native
  
  /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
  var itemChangeType: VersionControlChangeType = js.native
  
  /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
  var serverItem: String = js.native
}
object HistoryEntry {
  
  @scala.inline
  def apply[T](changeList: ChangeList[T], itemChangeType: VersionControlChangeType, serverItem: String): HistoryEntry[T] = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEntry[T]]
  }
  
  @scala.inline
  implicit class HistoryEntryOps[Self <: HistoryEntry[_], T] (val x: Self with HistoryEntry[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeList(value: ChangeList[T]): Self = this.set("changeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChangeType(value: VersionControlChangeType): Self = this.set("itemChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerItem(value: String): Self = this.set("serverItem", value.asInstanceOf[js.Any])
  }
}
