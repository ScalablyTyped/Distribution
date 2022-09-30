package typings.webdriverio.typesMod

import typings.wdioProtocols.typesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomStrategyReference extends StObject {
  
  def strategy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): ElementReference | js.Array[ElementReference]
  
  var strategyArguments: js.Array[Any]
  
  var strategyName: String
  
  @JSName("strategy")
  var strategy_Original: CustomStrategyFunction
}
object CustomStrategyReference {
  
  inline def apply(
    strategy: /* args */ Any => ElementReference | js.Array[ElementReference],
    strategyArguments: js.Array[Any],
    strategyName: String
  ): CustomStrategyReference = {
    val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction1(strategy), strategyArguments = strategyArguments.asInstanceOf[js.Any], strategyName = strategyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStrategyReference]
  }
  
  extension [Self <: CustomStrategyReference](x: Self) {
    
    inline def setStrategy(value: /* args */ Any => ElementReference | js.Array[ElementReference]): Self = StObject.set(x, "strategy", js.Any.fromFunction1(value))
    
    inline def setStrategyArguments(value: js.Array[Any]): Self = StObject.set(x, "strategyArguments", value.asInstanceOf[js.Any])
    
    inline def setStrategyArgumentsVarargs(value: Any*): Self = StObject.set(x, "strategyArguments", js.Array(value*))
    
    inline def setStrategyName(value: String): Self = StObject.set(x, "strategyName", value.asInstanceOf[js.Any])
  }
}
