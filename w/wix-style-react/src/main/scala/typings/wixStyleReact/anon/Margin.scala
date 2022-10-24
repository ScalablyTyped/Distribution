package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Margin extends StObject {
  
  var gap: Double
  
  var margin: String
}
object Margin {
  
  inline def apply(gap: Double, margin: String): Margin = {
    val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
  
  extension [Self <: Margin](x: Self) {
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
  }
}
