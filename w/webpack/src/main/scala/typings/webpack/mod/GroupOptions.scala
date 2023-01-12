package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var groupChildren: js.UndefOr[Boolean] = js.undefined
  
  var targetGroupCount: js.UndefOr[Double] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setGroupChildren(value: Boolean): Self = StObject.set(x, "groupChildren", value.asInstanceOf[js.Any])
    
    inline def setGroupChildrenUndefined: Self = StObject.set(x, "groupChildren", js.undefined)
    
    inline def setTargetGroupCount(value: Double): Self = StObject.set(x, "targetGroupCount", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupCountUndefined: Self = StObject.set(x, "targetGroupCount", js.undefined)
  }
}
