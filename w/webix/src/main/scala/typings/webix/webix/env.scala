package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait env extends StObject {
  
  var cssPrefix: String
  
  var isFF: Boolean
  
  var isIE: Boolean
  
  var isSafari: Boolean
  
  var isWebKit: Boolean
  
  var jsPrefix: String
  
  var mouse: js.Any
  
  var strict: Boolean
  
  var svg: Boolean
  
  var transform: Boolean
  
  var transition: Boolean
  
  var transitionDuration: String
  
  var transitionEnd: String
  
  var translate: String
}
object env {
  
  @scala.inline
  def apply(
    cssPrefix: String,
    isFF: Boolean,
    isIE: Boolean,
    isSafari: Boolean,
    isWebKit: Boolean,
    jsPrefix: String,
    mouse: js.Any,
    strict: Boolean,
    svg: Boolean,
    transform: Boolean,
    transition: Boolean,
    transitionDuration: String,
    transitionEnd: String,
    translate: String
  ): env = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any], isFF = isFF.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isWebKit = isWebKit.asInstanceOf[js.Any], jsPrefix = jsPrefix.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[env]
  }
  
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
