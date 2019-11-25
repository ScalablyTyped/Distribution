package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryEntry[T] extends js.Object {
  /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
  var changeList: ChangeList[T]
  /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
  var itemChangeType: VersionControlChangeType
  /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
  var serverItem: String
}

object HistoryEntry {
  @scala.inline
  def apply[T](changeList: ChangeList[T], itemChangeType: VersionControlChangeType, serverItem: String): HistoryEntry[T] = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HistoryEntry[T]]
  }
}

