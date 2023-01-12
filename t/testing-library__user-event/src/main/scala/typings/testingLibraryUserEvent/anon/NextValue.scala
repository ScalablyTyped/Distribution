package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextValue extends StObject {
  
  var nextValue: js.UndefOr[String] = js.undefined
  
  var previousValue: js.UndefOr[String] = js.undefined
  
  var tracked: js.UndefOr[js.Array[String]] = js.undefined
}
object NextValue {
  
  inline def apply(): NextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NextValue] (val x: Self) extends AnyVal {
    
    inline def setNextValue(value: String): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
    
    inline def setNextValueUndefined: Self = StObject.set(x, "nextValue", js.undefined)
    
    inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    inline def setTracked(value: js.Array[String]): Self = StObject.set(x, "tracked", value.asInstanceOf[js.Any])
    
    inline def setTrackedUndefined: Self = StObject.set(x, "tracked", js.undefined)
    
    inline def setTrackedVarargs(value: String*): Self = StObject.set(x, "tracked", js.Array(value*))
  }
}
