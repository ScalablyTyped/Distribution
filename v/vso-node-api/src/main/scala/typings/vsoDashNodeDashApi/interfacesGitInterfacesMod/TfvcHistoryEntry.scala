package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(changeList = changeList, encoding = encoding, fileId = fileId, itemChangeType = itemChangeType, serverItem = serverItem)
  
    __obj.asInstanceOf[TfvcHistoryEntry]
  }
}

