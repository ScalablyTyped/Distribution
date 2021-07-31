package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshiftCommand
  extends StObject
     with Command {
  
  @JSName("$unshift")
  var $unshift: js.Array[js.Any]
}
object UnshiftCommand {
  
  @scala.inline
  def apply($unshift: js.Array[js.Any]): UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshiftCommand]
  }
  
  @scala.inline
  implicit class UnshiftCommandMutableBuilder[Self <: UnshiftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$unshift(value: js.Array[js.Any]): Self = StObject.set(x, "$unshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$unshiftVarargs(value: js.Any*): Self = StObject.set(x, "$unshift", js.Array(value :_*))
  }
}
