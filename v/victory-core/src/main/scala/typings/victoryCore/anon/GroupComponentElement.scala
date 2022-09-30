package typings.victoryCore.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponentElement extends StObject {
  
  var groupComponent: Element
}
object GroupComponentElement {
  
  inline def apply(groupComponent: Element): GroupComponentElement = {
    val __obj = js.Dynamic.literal(groupComponent = groupComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponentElement]
  }
  
  extension [Self <: GroupComponentElement](x: Self) {
    
    inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
  }
}
