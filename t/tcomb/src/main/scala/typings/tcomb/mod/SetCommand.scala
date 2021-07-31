package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCommand
  extends StObject
     with Command {
  
  @JSName("$set")
  var $set: js.Any
}
object SetCommand {
  
  @scala.inline
  def apply($set: js.Any): SetCommand = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommand]
  }
  
  @scala.inline
  implicit class SetCommandMutableBuilder[Self <: SetCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$set(value: js.Any): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
  }
}
