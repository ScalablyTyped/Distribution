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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeList")(changeList)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("fileId")(fileId)
    __obj.updateDynamic("itemChangeType")(itemChangeType)
    __obj.updateDynamic("serverItem")(serverItem)
    __obj.asInstanceOf[TfvcHistoryEntry]
  }
}

