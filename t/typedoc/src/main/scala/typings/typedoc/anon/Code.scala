package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends StObject {
  
  var code: Boolean = js.native
  
  var pre: Boolean = js.native
  
  var script: Boolean = js.native
  
  var style: Boolean = js.native
  
  var textarea: Boolean = js.native
}
object Code {
  
  @scala.inline
  def apply(code: Boolean, pre: Boolean, script: Boolean, style: Boolean, textarea: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
  }
}
