package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleComponent extends StObject {
  
  var circleComponent: Element
  
  var clipPathComponent: Element
  
  var groupComponent: Element
  
  var rectComponent: Element
}
object CircleComponent {
  
  inline def apply(
    circleComponent: Element,
    clipPathComponent: Element,
    groupComponent: Element,
    rectComponent: Element
  ): CircleComponent = {
    val __obj = js.Dynamic.literal(circleComponent = circleComponent.asInstanceOf[js.Any], clipPathComponent = clipPathComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], rectComponent = rectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleComponent]
  }
  
  extension [Self <: CircleComponent](x: Self) {
    
    inline def setCircleComponent(value: Element): Self = StObject.set(x, "circleComponent", value.asInstanceOf[js.Any])
    
    inline def setClipPathComponent(value: Element): Self = StObject.set(x, "clipPathComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setRectComponent(value: Element): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
  }
}
