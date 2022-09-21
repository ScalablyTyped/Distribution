package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** animationData */
trait AnimationExportResult extends StObject {
  
  var actions: js.Array[IAnyObject]
}
object AnimationExportResult {
  
  inline def apply(actions: js.Array[IAnyObject]): AnimationExportResult = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationExportResult]
  }
  
  extension [Self <: AnimationExportResult](x: Self) {
    
    inline def setActions(value: js.Array[IAnyObject]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: IAnyObject*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
