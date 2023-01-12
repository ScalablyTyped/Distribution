package typings.yadda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofScenarioLevelPlugin extends StObject {
    
    def init(options: Any): Unit
  }
  object TypeofScenarioLevelPlugin {
    
    inline def apply(init: Any => Unit): TypeofScenarioLevelPlugin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[TypeofScenarioLevelPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofScenarioLevelPlugin] (val x: Self) extends AnyVal {
      
      inline def setInit(value: Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofStepLevelPlugin extends StObject {
    
    def init(): Unit = js.native
    def init(options: Any): Unit = js.native
  }
}
