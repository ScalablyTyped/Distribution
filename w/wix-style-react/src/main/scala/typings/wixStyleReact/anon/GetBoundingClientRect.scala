package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBoundingClientRect extends StObject {
  
  def getBoundingClientRect(): js.Object
}
object GetBoundingClientRect {
  
  inline def apply(getBoundingClientRect: () => js.Object): GetBoundingClientRect = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[GetBoundingClientRect]
  }
  
  extension [Self <: GetBoundingClientRect](x: Self) {
    
    inline def setGetBoundingClientRect(value: () => js.Object): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
  }
}
