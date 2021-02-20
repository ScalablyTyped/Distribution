package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorDecorationType extends StObject {
  
  /**
    * Remove this decoration type and all decorations on all text editors using it.
    */
  def dispose(): Unit = js.native
  
  /**
    * Internal representation of the handle.
    */
  val key: String = js.native
}
object TextEditorDecorationType {
  
  @scala.inline
  def apply(dispose: () => Unit, key: String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorDecorationType]
  }
  
  @scala.inline
  implicit class TextEditorDecorationTypeMutableBuilder[Self <: TextEditorDecorationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
