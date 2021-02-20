package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAGER extends StObject {
  
  var EAGER: String = js.native
  
  var LAZY: String = js.native
}
object EAGER {
  
  @scala.inline
  def apply(EAGER: String, LAZY: String): EAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAGER]
  }
  
  @scala.inline
  implicit class EAGERMutableBuilder[Self <: EAGER] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEAGER(value: String): Self = StObject.set(x, "EAGER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAZY(value: String): Self = StObject.set(x, "LAZY", value.asInstanceOf[js.Any])
  }
}
