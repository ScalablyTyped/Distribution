package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundPosition extends StObject {
  
  var background: String
  
  var backgroundColor: Unit
  
  var backgroundImage: Unit
  
  var backgroundPosition: Unit
  
  var backgroundRepeat: Unit
  
  var backgroundSize: Unit
}
object BackgroundPosition {
  
  inline def apply(
    background: String,
    backgroundColor: Unit,
    backgroundImage: Unit,
    backgroundPosition: Unit,
    backgroundRepeat: Unit,
    backgroundSize: Unit
  ): BackgroundPosition = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], backgroundPosition = backgroundPosition.asInstanceOf[js.Any], backgroundRepeat = backgroundRepeat.asInstanceOf[js.Any], backgroundSize = backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPosition]
  }
  
  extension [Self <: BackgroundPosition](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Unit): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImage(value: Unit): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPosition(value: Unit): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeat(value: Unit): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSize(value: Unit): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
  }
}
