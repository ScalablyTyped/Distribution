package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementPos extends StObject {
  
  var incrementPos: js.Any = js.native
  
  var matchedString: js.Any = js.native
  
  var pos: js.Any = js.native
  
  var success: Boolean = js.native
}
object IncrementPos {
  
  @scala.inline
  def apply(incrementPos: js.Any, matchedString: js.Any, pos: js.Any, success: Boolean): IncrementPos = {
    val __obj = js.Dynamic.literal(incrementPos = incrementPos.asInstanceOf[js.Any], matchedString = matchedString.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementPos]
  }
  
  @scala.inline
  implicit class IncrementPosMutableBuilder[Self <: IncrementPos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncrementPos(value: js.Any): Self = StObject.set(x, "incrementPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedString(value: js.Any): Self = StObject.set(x, "matchedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: js.Any): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
