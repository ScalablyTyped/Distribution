package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var background: Unit
  
  var backgroundColor: Any
  
  var backgroundImage: Unit
  
  var backgroundPosition: Unit
  
  var backgroundRepeat: Unit
  
  var backgroundSize: Unit
}
object BackgroundColor {
  
  inline def apply(
    background: Unit,
    backgroundColor: Any,
    backgroundImage: Unit,
    backgroundPosition: Unit,
    backgroundRepeat: Unit,
    backgroundSize: Unit
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], backgroundPosition = backgroundPosition.asInstanceOf[js.Any], backgroundRepeat = backgroundRepeat.asInstanceOf[js.Any], backgroundSize = backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackground(value: Unit): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImage(value: Unit): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPosition(value: Unit): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeat(value: Unit): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSize(value: Unit): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
  }
}
