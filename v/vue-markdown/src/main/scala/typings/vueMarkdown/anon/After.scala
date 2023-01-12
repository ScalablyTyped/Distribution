package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: scala.Any
  
  var at: scala.Any
  
  var before: scala.Any
  
  var disable: scala.Any
  
  var enable: scala.Any
  
  var enableOnly: scala.Any
  
  var getRules: scala.Any
  
  var push: scala.Any
}
object After {
  
  inline def apply(
    after: scala.Any,
    at: scala.Any,
    before: scala.Any,
    disable: scala.Any,
    enable: scala.Any,
    enableOnly: scala.Any,
    getRules: scala.Any,
    push: scala.Any
  ): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableOnly = enableOnly.asInstanceOf[js.Any], getRules = getRules.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: scala.Any): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAt(value: scala.Any): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: scala.Any): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: scala.Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: scala.Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableOnly(value: scala.Any): Self = StObject.set(x, "enableOnly", value.asInstanceOf[js.Any])
    
    inline def setGetRules(value: scala.Any): Self = StObject.set(x, "getRules", value.asInstanceOf[js.Any])
    
    inline def setPush(value: scala.Any): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
  }
}
