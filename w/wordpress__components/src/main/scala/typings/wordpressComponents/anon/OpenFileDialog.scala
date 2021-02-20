package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFileDialog extends StObject {
  
  def openFileDialog(): Unit = js.native
}
object OpenFileDialog {
  
  @scala.inline
  def apply(openFileDialog: () => Unit): OpenFileDialog = {
    val __obj = js.Dynamic.literal(openFileDialog = js.Any.fromFunction0(openFileDialog))
    __obj.asInstanceOf[OpenFileDialog]
  }
  
  @scala.inline
  implicit class OpenFileDialogMutableBuilder[Self <: OpenFileDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenFileDialog(value: () => Unit): Self = StObject.set(x, "openFileDialog", js.Any.fromFunction0(value))
  }
}
