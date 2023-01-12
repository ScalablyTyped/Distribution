package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgeGestureEventArgs extends StObject {
  
  var kind: EdgeGestureKind
}
object IEdgeGestureEventArgs {
  
  inline def apply(kind: EdgeGestureKind): IEdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGestureEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEdgeGestureEventArgs] (val x: Self) extends AnyVal {
    
    inline def setKind(value: EdgeGestureKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
