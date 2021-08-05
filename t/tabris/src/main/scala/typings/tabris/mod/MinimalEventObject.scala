package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimalEventObject[T /* <: js.Object */] extends StObject {
  
  var target: T
}
object MinimalEventObject {
  
  inline def apply[T /* <: js.Object */](target: T): MinimalEventObject[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalEventObject[T]]
  }
  
  extension [Self <: MinimalEventObject[?], T /* <: js.Object */](x: Self & MinimalEventObject[T]) {
    
    inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
