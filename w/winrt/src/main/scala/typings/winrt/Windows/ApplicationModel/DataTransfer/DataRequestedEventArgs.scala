package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRequestedEventArgs extends IDataRequestedEventArgs
object DataRequestedEventArgs {
  
  @scala.inline
  def apply(request: DataRequest): DataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequestedEventArgs]
  }
}
