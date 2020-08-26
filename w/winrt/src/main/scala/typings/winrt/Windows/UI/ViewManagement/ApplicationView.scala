package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationView extends js.Object {
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
  implicit class ApplicationViewOps[Self <: ApplicationView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjacentToLeftDisplayEdge(value: Double): Self = this.set("adjacentToLeftDisplayEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdjacentToRightDisplayEdge(value: Boolean): Self = this.set("adjacentToRightDisplayEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("isFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOnLockScreen(value: Boolean): Self = this.set("isOnLockScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScreenCaptureEnabled(value: Boolean): Self = this.set("isScreenCaptureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: ApplicationViewOrientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any
    ): Self = this.set("titleBar", value.asInstanceOf[js.Any])
  }
  
}

