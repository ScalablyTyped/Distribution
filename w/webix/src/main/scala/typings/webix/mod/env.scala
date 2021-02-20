package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait env extends StObject {
  
  var cssPrefix: String = js.native
  
  var isFF: Boolean = js.native
  
  var isIE: Boolean = js.native
  
  var isSafari: Boolean = js.native
  
  var isWebKit: Boolean = js.native
  
  var jsPrefix: String = js.native
  
  var mouse: js.Any = js.native
  
  var strict: Boolean = js.native
  
  var svg: Boolean = js.native
  
  var transform: Boolean = js.native
  
  var transition: Boolean = js.native
  
  var transitionDuration: String = js.native
  
  var transitionEnd: String = js.native
  
  var translate: String = js.native
}
object env {
  
  @JSImport("webix", "env")
  @js.native
  val ^ : typings.webix.webix.env = js.native
  
  @scala.inline
  implicit class envMutableBuilder[Self <: env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFF(value: Boolean): Self = StObject.set(x, "isFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebKit(value: Boolean): Self = StObject.set(x, "isWebKit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsPrefix(value: String): Self = StObject.set(x, "jsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouse(value: js.Any): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: Boolean): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEnd(value: String): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
  }
}
