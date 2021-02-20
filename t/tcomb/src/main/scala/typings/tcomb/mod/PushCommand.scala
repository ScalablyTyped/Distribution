package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushCommand extends Command {
  
  @JSName("$push")
  var $push: js.Array[_] = js.native
}
object PushCommand {
  
  @scala.inline
  def apply($push: js.Array[_]): PushCommand = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushCommand]
  }
  
  @scala.inline
  implicit class PushCommandMutableBuilder[Self <: PushCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$push(value: js.Array[_]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pushVarargs(value: js.Any*): Self = StObject.set(x, "$push", js.Array(value :_*))
  }
}
