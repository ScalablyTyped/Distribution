package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedCompletionInfo extends StObject {
  
  /**
    * The range that will be replaced if this completion item is accepted.
    */
  val range: Range
  
  /**
    * The text the range will be replaced with if this completion is accepted.
    */
  val text: String
}
object SelectedCompletionInfo {
  
  inline def apply(range: Range, text: String): SelectedCompletionInfo = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCompletionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedCompletionInfo] (val x: Self) extends AnyVal {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
