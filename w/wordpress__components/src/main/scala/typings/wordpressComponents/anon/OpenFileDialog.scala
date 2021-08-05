package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileDialog extends StObject {
  
  def openFileDialog(): Unit
}
object OpenFileDialog {
  
  inline def apply(openFileDialog: () => Unit): OpenFileDialog = {
    val __obj = js.Dynamic.literal(openFileDialog = js.Any.fromFunction0(openFileDialog))
    __obj.asInstanceOf[OpenFileDialog]
  }
  
  extension [Self <: OpenFileDialog](x: Self) {
    
    inline def setOpenFileDialog(value: () => Unit): Self = StObject.set(x, "openFileDialog", js.Any.fromFunction0(value))
  }
}
