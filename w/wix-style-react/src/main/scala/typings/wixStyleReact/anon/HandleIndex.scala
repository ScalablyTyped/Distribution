package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleIndex extends StObject {
  
  var handleIndex: Double
}
object HandleIndex {
  
  inline def apply(handleIndex: Double): HandleIndex = {
    val __obj = js.Dynamic.literal(handleIndex = handleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleIndex]
  }
  
  extension [Self <: HandleIndex](x: Self) {
    
    inline def setHandleIndex(value: Double): Self = StObject.set(x, "handleIndex", value.asInstanceOf[js.Any])
  }
}
