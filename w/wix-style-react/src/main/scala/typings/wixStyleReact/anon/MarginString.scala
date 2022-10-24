package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginString extends StObject {
  
  var margin: String
}
object MarginString {
  
  inline def apply(margin: String): MarginString = {
    val __obj = js.Dynamic.literal(margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginString]
  }
  
  extension [Self <: MarginString](x: Self) {
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
  }
}
