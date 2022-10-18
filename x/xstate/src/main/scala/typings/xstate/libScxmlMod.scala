package typings.xstate

import typings.xstate.libTypesMod.AnyStateMachine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScxmlMod {
  
  @JSImport("xstate/lib/scxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMachine(xml: String, options: ScxmlToMachineOptions): AnyStateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("toMachine")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnyStateMachine]
  
  trait ScxmlToMachineOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
  }
  object ScxmlToMachineOptions {
    
    inline def apply(): ScxmlToMachineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScxmlToMachineOptions]
    }
    
    extension [Self <: ScxmlToMachineOptions](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
}
