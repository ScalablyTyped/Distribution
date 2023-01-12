package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickActionOptions
  extends StObject
     with MouseActionOptions {
  
  /**
    * The initial caret position if the action is performed on a text input field. A zero-based integer.
    * The default is the length of the input field content.
    */
  var caretPos: js.UndefOr[Double] = js.undefined
}
object ClickActionOptions {
  
  inline def apply(): ClickActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickActionOptions] (val x: Self) extends AnyVal {
    
    inline def setCaretPos(value: Double): Self = StObject.set(x, "caretPos", value.asInstanceOf[js.Any])
    
    inline def setCaretPosUndefined: Self = StObject.set(x, "caretPos", js.undefined)
  }
}
