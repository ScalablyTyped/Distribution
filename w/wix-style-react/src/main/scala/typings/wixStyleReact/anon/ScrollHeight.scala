package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollHeight extends StObject {
  
  var scrollHeight: Double
}
object ScrollHeight {
  
  inline def apply(scrollHeight: Double): ScrollHeight = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollHeight]
  }
  
  extension [Self <: ScrollHeight](x: Self) {
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
  }
}
