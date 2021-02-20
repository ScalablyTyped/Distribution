package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEdgeGestureEventArgs extends StObject {
  
  var kind: EdgeGestureKind = js.native
}
object IEdgeGestureEventArgs {
  
  @scala.inline
  def apply(kind: EdgeGestureKind): IEdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGestureEventArgs]
  }
  
  @scala.inline
  implicit class IEdgeGestureEventArgsMutableBuilder[Self <: IEdgeGestureEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: EdgeGestureKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
