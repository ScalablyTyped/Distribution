package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainColor extends StObject {
  
  var mainColor: Any
}
object MainColor {
  
  inline def apply(mainColor: Any): MainColor = {
    val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainColor]
  }
  
  extension [Self <: MainColor](x: Self) {
    
    inline def setMainColor(value: Any): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
  }
}
