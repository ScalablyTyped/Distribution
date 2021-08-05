package typings.xrm

import typings.xrm.XrmEnum.StageCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetValue extends StObject {
    
    def getValue(): StageCategory
  }
  object GetValue {
    
    inline def apply(getValue: () => StageCategory): GetValue = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[GetValue]
    }
    
    extension [Self <: GetValue](x: Self) {
      
      inline def setGetValue(value: () => StageCategory): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
}
