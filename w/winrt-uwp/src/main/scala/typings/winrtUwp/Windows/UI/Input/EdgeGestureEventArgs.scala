package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the type of user input that triggered the edge gesture event. */
trait EdgeGestureEventArgs extends StObject {
  
  /** Gets the type of user input that triggered the edge gesture event. */
  var kind: EdgeGestureKind
}
object EdgeGestureEventArgs {
  
  inline def apply(kind: EdgeGestureKind): EdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeGestureEventArgs]
  }
  
  extension [Self <: EdgeGestureEventArgs](x: Self) {
    
    inline def setKind(value: EdgeGestureKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
