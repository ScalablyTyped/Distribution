package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LauncherUIOptions
  extends StObject
     with ILauncherUIOptions
object LauncherUIOptions {
  
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): LauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherUIOptions]
  }
}
