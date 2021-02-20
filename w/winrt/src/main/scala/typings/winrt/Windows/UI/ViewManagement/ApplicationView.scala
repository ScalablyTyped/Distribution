package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationView extends StObject {
  
  /**
    * Gets whether the current window (app view) is adjacent to the left edge of the screen.
    **/
  var adjacentToLeftDisplayEdge: Double = js.native
  
  /**
    * Gets whether the current window (app view) is adjacent to the right edge of the screen.
    **/
  var adjacentToRightDisplayEdge: Boolean = js.native
  
  /**
    * Gets the current ID of the window (app view) .
    **/
  var id: Double = js.native
  
  /**
    * Gets whether the window(app view) is full screen or not.
    **/
  var isFullScreen: Boolean = js.native
  
  /**
    * Gets whether the window (app view) is on the Windows lock screen.
    **/
  var isOnLockScreen: Boolean = js.native
  
  /**
    * Gets or sets whether screen capture is enabled for the window (app view).
    **/
  var isScreenCaptureEnabled: Boolean = js.native
  
  /**
    * Gets the current orientation of the window (app view) with respect to the display.
    **/
  var orientation: ApplicationViewOrientation = js.native
  
  /**
    * Gets or sets the displayed title of the window.
    **/
  var title: String = js.native
  
  /**
    * Gets the title bar of the app.
    **/
  var titleBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any = js.native
}
object ApplicationView {
  
  @scala.inline
  def apply(
    adjacentToLeftDisplayEdge: Double,
    adjacentToRightDisplayEdge: Boolean,
    id: Double,
    isFullScreen: Boolean,
    isOnLockScreen: Boolean,
    isScreenCaptureEnabled: Boolean,
    orientation: ApplicationViewOrientation,
    title: String,
    titleBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any
  ): ApplicationView = {
    val __obj = js.Dynamic.literal(adjacentToLeftDisplayEdge = adjacentToLeftDisplayEdge.asInstanceOf[js.Any], adjacentToRightDisplayEdge = adjacentToRightDisplayEdge.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isOnLockScreen = isOnLockScreen.asInstanceOf[js.Any], isScreenCaptureEnabled = isScreenCaptureEnabled.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleBar = titleBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationView]
  }
  
  @scala.inline
  implicit class ApplicationViewMutableBuilder[Self <: ApplicationView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjacentToLeftDisplayEdge(value: Double): Self = StObject.set(x, "adjacentToLeftDisplayEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjacentToRightDisplayEdge(value: Boolean): Self = StObject.set(x, "adjacentToRightDisplayEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnLockScreen(value: Boolean): Self = StObject.set(x, "isOnLockScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScreenCaptureEnabled(value: Boolean): Self = StObject.set(x, "isScreenCaptureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: ApplicationViewOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any
    ): Self = StObject.set(x, "titleBar", value.asInstanceOf[js.Any])
  }
}
