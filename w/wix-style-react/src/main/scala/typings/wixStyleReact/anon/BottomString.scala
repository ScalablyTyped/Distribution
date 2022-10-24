package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomString extends StObject {
  
  var bottom: String
}
object BottomString {
  
  inline def apply(bottom: String): BottomString = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomString]
  }
  
  extension [Self <: BottomString](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
  }
}
