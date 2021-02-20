package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcHistoryEntry extends HistoryEntry[TfvcItem] {
  
  /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
  var encoding: Double = js.native
  
  /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
  var fileId: Double = js.native
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
  
  @scala.inline
  implicit class TfvcHistoryEntryMutableBuilder[Self <: TfvcHistoryEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
  }
}
