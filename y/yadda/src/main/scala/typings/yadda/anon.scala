package typings.yadda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofScenarioLevelPlugin extends StObject {
    
    def init(options: js.Any): Unit = js.native
  }
  object TypeofScenarioLevelPlugin {
    
    @scala.inline
    def apply(init: js.Any => Unit): TypeofScenarioLevelPlugin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[TypeofScenarioLevelPlugin]
    }
    
    @scala.inline
    implicit class TypeofScenarioLevelPluginMutableBuilder[Self <: TypeofScenarioLevelPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: js.Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofStepLevelPlugin extends StObject {
    
    def init(): Unit = js.native
    def init(options: js.Any): Unit = js.native
  }
}
