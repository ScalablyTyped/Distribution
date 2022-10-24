package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  var expand: Requireable[Boolean | js.Object]
  
  var fadeIn: Requireable[Boolean | js.Object]
  
  var moveIn: Requireable[Boolean | js.Object]
  
  var scaleUp: Requireable[Boolean | js.Object]
}
object Expand {
  
  inline def apply(
    expand: Requireable[Boolean | js.Object],
    fadeIn: Requireable[Boolean | js.Object],
    moveIn: Requireable[Boolean | js.Object],
    scaleUp: Requireable[Boolean | js.Object]
  ): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], fadeIn = fadeIn.asInstanceOf[js.Any], moveIn = moveIn.asInstanceOf[js.Any], scaleUp = scaleUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  
  extension [Self <: Expand](x: Self) {
    
    inline def setExpand(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setFadeIn(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
    
    inline def setMoveIn(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "moveIn", value.asInstanceOf[js.Any])
    
    inline def setScaleUp(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
  }
}
