package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushCommand
  extends StObject
     with Command {
  
  @JSName("$push")
  var $push: js.Array[scala.Any]
}
object PushCommand {
  
  inline def apply($push: js.Array[scala.Any]): PushCommand = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushCommand]
  }
  
  extension [Self <: PushCommand](x: Self) {
    
    inline def set$push(value: js.Array[scala.Any]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    inline def set$pushVarargs(value: scala.Any*): Self = StObject.set(x, "$push", js.Array(value*))
  }
}
