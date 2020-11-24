package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTransferManager extends IDataTransferManager
object DataTransferManager {
  
  @scala.inline
  def apply(ondatarequested: js.Any, ontargetapplicationchosen: js.Any): DataTransferManager = {
    val __obj = js.Dynamic.literal(ondatarequested = ondatarequested.asInstanceOf[js.Any], ontargetapplicationchosen = ontargetapplicationchosen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferManager]
  }
}
