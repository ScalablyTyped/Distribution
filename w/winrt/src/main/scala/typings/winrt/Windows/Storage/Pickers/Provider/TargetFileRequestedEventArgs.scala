package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFileRequestedEventArgs extends ITargetFileRequestedEventArgs
object TargetFileRequestedEventArgs {
  
  @scala.inline
  def apply(request: TargetFileRequest): TargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequestedEventArgs]
  }
}
