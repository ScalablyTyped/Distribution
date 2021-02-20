package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedString extends StObject {
  
  var incrementPos: js.UndefOr[scala.Nothing] = js.native
  
  var matchedString: js.UndefOr[scala.Nothing] = js.native
  
  var pos: js.Any = js.native
  
  var success: Boolean = js.native
}
object MatchedString {
  
  @scala.inline
  def apply(pos: js.Any, success: Boolean): MatchedString = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedString]
  }
  
  @scala.inline
  implicit class MatchedStringMutableBuilder[Self <: MatchedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPos(value: js.Any): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
