package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClosingPairs extends StObject {
  
  var autoClosingPairs: js.Array[NotIn]
}
object AutoClosingPairs {
  
  inline def apply(autoClosingPairs: js.Array[NotIn]): AutoClosingPairs = {
    val __obj = js.Dynamic.literal(autoClosingPairs = autoClosingPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClosingPairs]
  }
  
  extension [Self <: AutoClosingPairs](x: Self) {
    
    inline def setAutoClosingPairs(value: js.Array[NotIn]): Self = StObject.set(x, "autoClosingPairs", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingPairsVarargs(value: NotIn*): Self = StObject.set(x, "autoClosingPairs", js.Array(value :_*))
  }
}
