package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWindowOptions extends js.Object {
  
  /**
    * Ps=10 ; 0  Undo full-screen mode.
    * Ps=10 ; 1  Change to full-screen.
    * Ps=10 ; 2  Toggle full-screen.
    * No default implementation.
    */
  var fullscreenWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=16  Report xterm character cell size in pixels. Result is "CSI 6 ; height ; width t".
    * Has a default implementation.
    */
  var getCellSizePixels: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=20  Report xterm window's icon label. Result is "OSC L label ST".
    * No default implementation.
    */
  var getIconTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=19  Report the size of the screen in characters. Result is "CSI 9 ; height ; width t".
    * No default implementation.
    */
  var getScreenSizeChars: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=15    Report size of the screen in pixels. Result is "CSI 5 ; height ; width t".
    * No default implementation.
    */
  var getScreenSizePixels: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=13      Report xterm window position. Result is "CSI 3 ; x ; y t".
    * Ps=13 ; 2  Report xterm text-area position. Result is "CSI 3 ; x ; y t".
    * No default implementation.
    */
  var getWinPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=18  Report the size of the text area in characters. Result is "CSI 8 ; height ; width t".
    * Has a default implementation.
    */
  var getWinSizeChars: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=14      Report xterm text area size in pixels. Result is "CSI 4 ; height ; width t".
    * Ps=14 ; 2  Report xterm window size in pixels. Result is "CSI  4 ; height ; width t".
    * Has a default implementation.
    */
  var getWinSizePixels: js.UndefOr[Boolean] = js.native
  
  /** Ps=11   Report xterm window state.
    * If the xterm window is non-iconified, it returns "CSI 1 t".
    * If the xterm window is iconified, it returns "CSI 2 t".
    * No default implementation.
    */
  var getWinState: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=21  Report xterm window's title. Result is "OSC l label ST".
    * No default implementation.
    */
  var getWinTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=6    Lower the xterm window to the bottom of the stacking order.
    * No default implementation.
    */
  var lowerWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=9 ; 0   Restore maximized window.
    * Ps=9 ; 1   Maximize window (i.e., resize to screen size).
    * Ps=9 ; 2   Maximize window vertically.
    * Ps=9 ; 3   Maximize window horizontally.
    * No default implementation.
    */
  var maximizeWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=2    Iconify window.
    * No default implementation.
    */
  var minimizeWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=23 ; 0  Restore xterm icon and window title from stack.
    * Ps=23 ; 1  Restore xterm icon title from stack.
    * Ps=23 ; 2  Restore xterm window title from stack.
    * All variants have a default implementation.
    */
  var popTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=22 ; 0  Save xterm icon and window title on stack.
    * Ps=22 ; 1  Save xterm icon title on stack.
    * Ps=22 ; 2  Save xterm window title on stack.
    * All variants have a default implementation.
    */
  var pushTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=5    Raise the window to the front of the stacking order.
    * No default implementation.
    */
  var raiseWin: js.UndefOr[Boolean] = js.native
  
  /** Ps=7    Refresh the window. */
  var refreshWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=1    De-iconify window.
    * No default implementation.
    */
  var restoreWin: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps>=24  Resize to Ps lines (DECSLPP).
    * DECSLPP is not implemented. This settings is also used to
    * enable / disable DECCOLM (earlier variant of DECSLPP).
    */
  var setWinLines: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps=3 ; x ; y
    * Move window to [x, y].
    * No default implementation.
    */
  var setWinPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps = 8 ; height ; width
    * Resize the text area to given height and width in characters.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters use the display's height or width.
    * No default implementation.
    */
  var setWinSizeChars: js.UndefOr[Boolean] = js.native
  
  /**
    * Ps = 4 ; height ; width
    * Resize the window to given `height` and `width` in pixels.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters should use the display's height or width.
    * No default implementation.
    */
  var setWinSizePixels: js.UndefOr[Boolean] = js.native
}
object IWindowOptions {
  
  @scala.inline
  def apply(): IWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowOptions]
  }
  
  @scala.inline
  implicit class IWindowOptionsOps[Self <: IWindowOptions] (val x: Self) extends AnyVal {
    
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
    def setFullscreenWin(value: Boolean): Self = this.set("fullscreenWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenWin: Self = this.set("fullscreenWin", js.undefined)
    
    @scala.inline
    def setGetCellSizePixels(value: Boolean): Self = this.set("getCellSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCellSizePixels: Self = this.set("getCellSizePixels", js.undefined)
    
    @scala.inline
    def setGetIconTitle(value: Boolean): Self = this.set("getIconTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetIconTitle: Self = this.set("getIconTitle", js.undefined)
    
    @scala.inline
    def setGetScreenSizeChars(value: Boolean): Self = this.set("getScreenSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetScreenSizeChars: Self = this.set("getScreenSizeChars", js.undefined)
    
    @scala.inline
    def setGetScreenSizePixels(value: Boolean): Self = this.set("getScreenSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetScreenSizePixels: Self = this.set("getScreenSizePixels", js.undefined)
    
    @scala.inline
    def setGetWinPosition(value: Boolean): Self = this.set("getWinPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWinPosition: Self = this.set("getWinPosition", js.undefined)
    
    @scala.inline
    def setGetWinSizeChars(value: Boolean): Self = this.set("getWinSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWinSizeChars: Self = this.set("getWinSizeChars", js.undefined)
    
    @scala.inline
    def setGetWinSizePixels(value: Boolean): Self = this.set("getWinSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWinSizePixels: Self = this.set("getWinSizePixels", js.undefined)
    
    @scala.inline
    def setGetWinState(value: Boolean): Self = this.set("getWinState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWinState: Self = this.set("getWinState", js.undefined)
    
    @scala.inline
    def setGetWinTitle(value: Boolean): Self = this.set("getWinTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWinTitle: Self = this.set("getWinTitle", js.undefined)
    
    @scala.inline
    def setLowerWin(value: Boolean): Self = this.set("lowerWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerWin: Self = this.set("lowerWin", js.undefined)
    
    @scala.inline
    def setMaximizeWin(value: Boolean): Self = this.set("maximizeWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizeWin: Self = this.set("maximizeWin", js.undefined)
    
    @scala.inline
    def setMinimizeWin(value: Boolean): Self = this.set("minimizeWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizeWin: Self = this.set("minimizeWin", js.undefined)
    
    @scala.inline
    def setPopTitle(value: Boolean): Self = this.set("popTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopTitle: Self = this.set("popTitle", js.undefined)
    
    @scala.inline
    def setPushTitle(value: Boolean): Self = this.set("pushTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushTitle: Self = this.set("pushTitle", js.undefined)
    
    @scala.inline
    def setRaiseWin(value: Boolean): Self = this.set("raiseWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaiseWin: Self = this.set("raiseWin", js.undefined)
    
    @scala.inline
    def setRefreshWin(value: Boolean): Self = this.set("refreshWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshWin: Self = this.set("refreshWin", js.undefined)
    
    @scala.inline
    def setRestoreWin(value: Boolean): Self = this.set("restoreWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreWin: Self = this.set("restoreWin", js.undefined)
    
    @scala.inline
    def setSetWinLines(value: Boolean): Self = this.set("setWinLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWinLines: Self = this.set("setWinLines", js.undefined)
    
    @scala.inline
    def setSetWinPosition(value: Boolean): Self = this.set("setWinPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWinPosition: Self = this.set("setWinPosition", js.undefined)
    
    @scala.inline
    def setSetWinSizeChars(value: Boolean): Self = this.set("setWinSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWinSizeChars: Self = this.set("setWinSizeChars", js.undefined)
    
    @scala.inline
    def setSetWinSizePixels(value: Boolean): Self = this.set("setWinSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWinSizePixels: Self = this.set("setWinSizePixels", js.undefined)
  }
}
