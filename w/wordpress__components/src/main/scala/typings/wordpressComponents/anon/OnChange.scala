package typings.wordpressComponents.anon

import typings.wordpressComponents.selectControlMod.SelectControl.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[T /* <: String | js.Array[String] */] extends StObject {
  
  /**
    * A function that receives the value of the new option that is being
    * selected as input. If multiple is true the value received is an
    * array of the selected value. If multiple is false the value received
    * is a single value with the new selected value.
    */
  def onChange(value: T): Unit
  
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  
  var value: js.UndefOr[T] = js.undefined
}
object OnChange {
  
  inline def apply[T /* <: String | js.Array[String] */](onChange: T => Unit): OnChange[T] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OnChange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange[?], T /* <: String | js.Array[String] */] (val x: Self & OnChange[T]) extends AnyVal {
    
    inline def setOnChange(value: T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
