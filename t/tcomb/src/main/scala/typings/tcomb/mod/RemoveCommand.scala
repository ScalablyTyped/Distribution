package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCommand
  extends StObject
     with Command {
  
  @JSName("$remove")
  var $remove: js.Array[java.lang.String]
}
object RemoveCommand {
  
  @scala.inline
  def apply($remove: js.Array[java.lang.String]): RemoveCommand = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCommand]
  }
  
  @scala.inline
  implicit class RemoveCommandMutableBuilder[Self <: RemoveCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$remove(value: js.Array[java.lang.String]): Self = StObject.set(x, "$remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$removeVarargs(value: java.lang.String*): Self = StObject.set(x, "$remove", js.Array(value :_*))
  }
}
