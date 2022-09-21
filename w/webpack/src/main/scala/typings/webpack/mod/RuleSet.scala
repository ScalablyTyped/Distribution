package typings.webpack.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSet extends StObject {
  
  /**
  	 * execute the rule set
  	 */
  def exec(arg0: js.Object): js.Array[Effect]
  
  /**
  	 * map of references in the rule set (may grow over time)
  	 */
  var references: Map[String, Any]
}
object RuleSet {
  
  inline def apply(exec: js.Object => js.Array[Effect], references: Map[String, Any]): RuleSet = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  extension [Self <: RuleSet](x: Self) {
    
    inline def setExec(value: js.Object => js.Array[Effect]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setReferences(value: Map[String, Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
