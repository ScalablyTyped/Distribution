package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.Any
  
  var at: js.Any
  
  var before: js.Any
  
  var disable: js.Any
  
  var enable: js.Any
  
  var enableOnly: js.Any
  
  var getRules: js.Any
  
  var push: js.Any
}
object After {
  
  inline def apply(
    after: js.Any,
    at: js.Any,
    before: js.Any,
    disable: js.Any,
    enable: js.Any,
    enableOnly: js.Any,
    getRules: js.Any,
    push: js.Any
  ): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableOnly = enableOnly.asInstanceOf[js.Any], getRules = getRules.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAfter(value: js.Any): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAt(value: js.Any): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: js.Any): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: js.Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: js.Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableOnly(value: js.Any): Self = StObject.set(x, "enableOnly", value.asInstanceOf[js.Any])
    
    inline def setGetRules(value: js.Any): Self = StObject.set(x, "getRules", value.asInstanceOf[js.Any])
    
    inline def setPush(value: js.Any): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
  }
}
