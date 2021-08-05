package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var lineHeight: Double
}
object LineHeight {
  
  inline def apply(lineHeight: Double): LineHeight = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  extension [Self <: LineHeight](x: Self) {
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
