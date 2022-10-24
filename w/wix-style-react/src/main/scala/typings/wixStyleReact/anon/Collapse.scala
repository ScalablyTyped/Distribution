package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapse extends StObject {
  
  var collapse: Requireable[Boolean | js.Object]
  
  var fadeOut: Requireable[Boolean | js.Object]
  
  var moveOut: Requireable[Boolean | js.Object]
  
  var scaleDown: Requireable[Boolean | js.Object]
}
object Collapse {
  
  inline def apply(
    collapse: Requireable[Boolean | js.Object],
    fadeOut: Requireable[Boolean | js.Object],
    moveOut: Requireable[Boolean | js.Object],
    scaleDown: Requireable[Boolean | js.Object]
  ): Collapse = {
    val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any], fadeOut = fadeOut.asInstanceOf[js.Any], moveOut = moveOut.asInstanceOf[js.Any], scaleDown = scaleDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapse]
  }
  
  extension [Self <: Collapse](x: Self) {
    
    inline def setCollapse(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setFadeOut(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
    
    inline def setMoveOut(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "moveOut", value.asInstanceOf[js.Any])
    
    inline def setScaleDown(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
  }
}
