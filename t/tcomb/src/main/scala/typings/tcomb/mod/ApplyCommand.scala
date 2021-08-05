package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyCommand
  extends StObject
     with Command {
  
  @JSName("$apply")
  var $apply: js.Function
}
object ApplyCommand {
  
  inline def apply($apply: js.Function): ApplyCommand = {
    val __obj = js.Dynamic.literal($apply = $apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCommand]
  }
  
  extension [Self <: ApplyCommand](x: Self) {
    
    inline def set$apply(value: js.Function): Self = StObject.set(x, "$apply", value.asInstanceOf[js.Any])
  }
}
