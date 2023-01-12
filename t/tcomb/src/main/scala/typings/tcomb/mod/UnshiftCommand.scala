package typings.tcomb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshiftCommand
  extends StObject
     with Command {
  
  @JSName("$unshift")
  var $unshift: js.Array[scala.Any]
}
object UnshiftCommand {
  
  inline def apply($unshift: js.Array[scala.Any]): UnshiftCommand = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshiftCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnshiftCommand] (val x: Self) extends AnyVal {
    
    inline def set$unshift(value: js.Array[scala.Any]): Self = StObject.set(x, "$unshift", value.asInstanceOf[js.Any])
    
    inline def set$unshiftVarargs(value: scala.Any*): Self = StObject.set(x, "$unshift", js.Array(value*))
  }
}
