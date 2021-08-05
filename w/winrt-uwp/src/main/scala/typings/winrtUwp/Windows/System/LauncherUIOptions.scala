package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
trait LauncherUIOptions extends StObject {
  
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: Point
  
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: Placement
  
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: Rect
}
object LauncherUIOptions {
  
  inline def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): LauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherUIOptions]
  }
  
  extension [Self <: LauncherUIOptions](x: Self) {
    
    inline def setInvocationPoint(value: Point): Self = StObject.set(x, "invocationPoint", value.asInstanceOf[js.Any])
    
    inline def setPreferredPlacement(value: Placement): Self = StObject.set(x, "preferredPlacement", value.asInstanceOf[js.Any])
    
    inline def setSelectionRect(value: Rect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
