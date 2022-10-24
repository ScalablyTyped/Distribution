package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndex extends StObject {
  
  var zIndex: Double
}
object ZIndex {
  
  inline def apply(zIndex: Double): ZIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  
  extension [Self <: ZIndex](x: Self) {
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
