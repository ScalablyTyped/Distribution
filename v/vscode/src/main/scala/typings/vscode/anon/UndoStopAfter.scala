package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoStopAfter extends StObject {
  
  var undoStopAfter: Boolean = js.native
  
  var undoStopBefore: Boolean = js.native
}
object UndoStopAfter {
  
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoStopAfter]
  }
  
  @scala.inline
  implicit class UndoStopAfterMutableBuilder[Self <: UndoStopAfter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUndoStopAfter(value: Boolean): Self = StObject.set(x, "undoStopAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoStopBefore(value: Boolean): Self = StObject.set(x, "undoStopBefore", value.asInstanceOf[js.Any])
  }
}
