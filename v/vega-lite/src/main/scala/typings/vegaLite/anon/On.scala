package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait On extends StObject {
  
  var name: String = js.native
  
  var on: js.Array[Events] = js.native
}
object On {
  
  @scala.inline
  def apply(name: String, on: js.Array[Events]): On = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: js.Array[Events]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVarargs(value: Events*): Self = StObject.set(x, "on", js.Array(value :_*))
  }
}
