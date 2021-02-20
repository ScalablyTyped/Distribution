package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckJsDirective extends TextRange {
  
  var enabled: Boolean = js.native
}
object CheckJsDirective {
  
  @scala.inline
  def apply(enabled: Boolean, end: Double, pos: Double): CheckJsDirective = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckJsDirective]
  }
  
  @scala.inline
  implicit class CheckJsDirectiveMutableBuilder[Self <: CheckJsDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
