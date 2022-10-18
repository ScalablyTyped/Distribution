package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcHistoryEntry
  extends StObject
     with HistoryEntry[TfvcItem] {
  
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
  
  inline def apply(
    changeList: ChangeList[TfvcItem],
    encoding: Double,
    fileId: Double,
    itemChangeType: VersionControlChangeType,
    serverItem: String
  ): TfvcHistoryEntry = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcHistoryEntry]
  }
  
  extension [Self <: TfvcHistoryEntry](x: Self) {
    
    inline def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
  }
}
