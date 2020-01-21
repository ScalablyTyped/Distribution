package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcHistoryEntry extends HistoryEntry[TfvcItem] {
  /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
  var encoding: Double
  /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
  var fileId: Double
}

object TfvcHistoryEntry {
  @scala.inline
  def apply(
    changeList: ChangeList[TfvcItem],
    encoding: Double,
    fileId: Double,
    itemChangeType: VersionControlChangeType,
    serverItem: String
  ): TfvcHistoryEntry = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcHistoryEntry]
  }
}

