package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainRoot extends StObject {
  
  var mainRoot: String
  
  var root: String
  
  var withFrame: String
}
object MainRoot {
  
  inline def apply(mainRoot: String, root: String, withFrame: String): MainRoot = {
    val __obj = js.Dynamic.literal(mainRoot = mainRoot.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], withFrame = withFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainRoot]
  }
  
  extension [Self <: MainRoot](x: Self) {
    
    inline def setMainRoot(value: String): Self = StObject.set(x, "mainRoot", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWithFrame(value: String): Self = StObject.set(x, "withFrame", value.asInstanceOf[js.Any])
  }
}
