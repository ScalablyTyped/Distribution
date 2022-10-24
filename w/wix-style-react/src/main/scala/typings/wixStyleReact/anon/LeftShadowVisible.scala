package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftShadowVisible extends StObject {
  
  var leftShadowVisible: Boolean
  
  var rightShadowVisible: Boolean
}
object LeftShadowVisible {
  
  inline def apply(leftShadowVisible: Boolean, rightShadowVisible: Boolean): LeftShadowVisible = {
    val __obj = js.Dynamic.literal(leftShadowVisible = leftShadowVisible.asInstanceOf[js.Any], rightShadowVisible = rightShadowVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftShadowVisible]
  }
  
  extension [Self <: LeftShadowVisible](x: Self) {
    
    inline def setLeftShadowVisible(value: Boolean): Self = StObject.set(x, "leftShadowVisible", value.asInstanceOf[js.Any])
    
    inline def setRightShadowVisible(value: Boolean): Self = StObject.set(x, "rightShadowVisible", value.asInstanceOf[js.Any])
  }
}
