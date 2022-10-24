package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesCommonScrollableContainerMod.AreaX
import typings.wixStyleReact.distTypesCommonScrollableContainerMod.AreaY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  var x: AreaX
  
  var y: AreaY
}
object XY {
  
  inline def apply(x: AreaX, y: AreaY): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: AreaX): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: AreaY): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
