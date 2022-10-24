package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: Unit
  
  var backgroundColor: Unit
  
  var backgroundImage: String
  
  var backgroundPosition: String
  
  var backgroundRepeat: String
  
  var backgroundSize: String
}
object Background {
  
  inline def apply(
    background: Unit,
    backgroundColor: Unit,
    backgroundImage: String,
    backgroundPosition: String,
    backgroundRepeat: String,
    backgroundSize: String
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], backgroundPosition = backgroundPosition.asInstanceOf[js.Any], backgroundRepeat = backgroundRepeat.asInstanceOf[js.Any], backgroundSize = backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setBackground(value: Unit): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Unit): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
  }
}
