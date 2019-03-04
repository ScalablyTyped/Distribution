package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcHistoryEntry extends HistoryEntry[TfvcItem] {
  /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
  var encoding: scala.Double
  /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
  var fileId: scala.Double
}

object TfvcHistoryEntry {
  @scala.inline
  def apply(
    changeList: ChangeList[TfvcItem],
    encoding: scala.Double,
    fileId: scala.Double,
    itemChangeType: VersionControlChangeType,
    serverItem: java.lang.String
  ): TfvcHistoryEntry = {
    val __obj = js.Dynamic.literal(changeList = changeList, encoding = encoding, fileId = fileId, itemChangeType = itemChangeType, serverItem = serverItem)
  
    __obj.asInstanceOf[TfvcHistoryEntry]
  }
}

