package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskProgressingEventArgs extends IPrintTaskProgressingEventArgs
object PrintTaskProgressingEventArgs {
  
  @scala.inline
  def apply(documentPageCount: Double): PrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskProgressingEventArgs]
  }
}
