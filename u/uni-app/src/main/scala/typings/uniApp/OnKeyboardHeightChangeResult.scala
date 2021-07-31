package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyboardHeightChangeResult extends StObject {
  
  /**
    * 键盘高度
    */
  var height: js.UndefOr[Double] = js.undefined
}
object OnKeyboardHeightChangeResult {
  
  @scala.inline
  def apply(): OnKeyboardHeightChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnKeyboardHeightChangeResult]
  }
  
  @scala.inline
  implicit class OnKeyboardHeightChangeResultMutableBuilder[Self <: OnKeyboardHeightChangeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
  }
}
