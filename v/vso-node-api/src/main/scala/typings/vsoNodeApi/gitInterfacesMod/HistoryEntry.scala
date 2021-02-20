package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryEntry[T] extends StObject {
  
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
  implicit class HistoryEntryMutableBuilder[Self <: HistoryEntry[_], T] (val x: Self with HistoryEntry[T]) extends AnyVal {
    
    @scala.inline
    def setChangeList(value: ChangeList[T]): Self = StObject.set(x, "changeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChangeType(value: VersionControlChangeType): Self = StObject.set(x, "itemChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
  }
}
