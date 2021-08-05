package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpliceCommand
  extends StObject
     with Command {
  
  @JSName("$splice")
  var $splice: js.Array[js.Array[js.Any]]
}
object SpliceCommand {
  
  inline def apply($splice: js.Array[js.Array[js.Any]]): SpliceCommand = {
    val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpliceCommand]
  }
  
  extension [Self <: SpliceCommand](x: Self) {
    
    inline def set$splice(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "$splice", value.asInstanceOf[js.Any])
    
    inline def set$spliceVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "$splice", js.Array(value :_*))
  }
}
