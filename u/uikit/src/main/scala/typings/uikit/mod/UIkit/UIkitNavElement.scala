package typings.uikit.mod.UIkit

import typings.uikit.mod.UIkitNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitNavElement extends StObject {
  
  var animate: Boolean
  
  var index: String | Double | UIkitNode
}
object UIkitNavElement {
  
  inline def apply(animate: Boolean, index: String | Double | UIkitNode): UIkitNavElement = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavElement]
  }
  
  extension [Self <: UIkitNavElement](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String | Double | UIkitNode): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
