package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var width: Double
}
object Width {
  
  inline def apply(width: Double): Width = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
