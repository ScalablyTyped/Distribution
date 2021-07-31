package typings.wixStyleReact.anon

import typings.wixStyleReact.scrollableContainerMod.AreaX
import typings.wixStyleReact.scrollableContainerMod.AreaY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: AreaX
  
  var y: AreaY
}
object Y {
  
  @scala.inline
  def apply(x: AreaX, y: AreaY): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: AreaX): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: AreaY): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
