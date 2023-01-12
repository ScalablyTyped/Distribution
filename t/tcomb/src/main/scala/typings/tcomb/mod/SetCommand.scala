package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCommand
  extends StObject
     with Command {
  
  @JSName("$set")
  var $set: scala.Any
}
object SetCommand {
  
  inline def apply($set: scala.Any): SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetCommand] (val x: Self) extends AnyVal {
    
    inline def set$set(value: scala.Any): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
  }
}
