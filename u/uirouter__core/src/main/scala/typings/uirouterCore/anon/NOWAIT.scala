package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOWAIT extends StObject {
  
  var NOWAIT: String
  
  var WAIT: String
}
object NOWAIT {
  
  @scala.inline
  def apply(NOWAIT: String, WAIT: String): NOWAIT = {
    val __obj = js.Dynamic.literal(NOWAIT = NOWAIT.asInstanceOf[js.Any], WAIT = WAIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOWAIT]
  }
  
  @scala.inline
  implicit class NOWAITMutableBuilder[Self <: NOWAIT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNOWAIT(value: String): Self = StObject.set(x, "NOWAIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWAIT(value: String): Self = StObject.set(x, "WAIT", value.asInstanceOf[js.Any])
  }
}
