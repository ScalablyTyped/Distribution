package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileRemovedEventArgs extends IFileRemovedEventArgs
object FileRemovedEventArgs {
  
  @scala.inline
  def apply(id: String): FileRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRemovedEventArgs]
  }
}
