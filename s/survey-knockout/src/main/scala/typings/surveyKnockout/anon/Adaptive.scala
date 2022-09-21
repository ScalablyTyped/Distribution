package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adaptive extends StObject {
  
  var adaptive: String
  
  var image: String
  
  var mainRoot: String
  
  var root: String
  
  var withFrame: String
}
object Adaptive {
  
  inline def apply(adaptive: String, image: String, mainRoot: String, root: String, withFrame: String): Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mainRoot = mainRoot.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], withFrame = withFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  
  extension [Self <: Adaptive](x: Self) {
    
    inline def setAdaptive(value: String): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMainRoot(value: String): Self = StObject.set(x, "mainRoot", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWithFrame(value: String): Self = StObject.set(x, "withFrame", value.asInstanceOf[js.Any])
  }
}
