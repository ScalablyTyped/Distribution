package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowOptions extends StObject {
  
  /**
    * Ps=10 ; 0  Undo full-screen mode.
    * Ps=10 ; 1  Change to full-screen.
    * Ps=10 ; 2  Toggle full-screen.
    * No default implementation.
    */
  var fullscreenWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=16  Report xterm character cell size in pixels. Result is "CSI 6 ; height ; width t".
    * Has a default implementation.
    */
  var getCellSizePixels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=20  Report xterm window's icon label. Result is "OSC L label ST".
    * No default implementation.
    */
  var getIconTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=19  Report the size of the screen in characters. Result is "CSI 9 ; height ; width t".
    * No default implementation.
    */
  var getScreenSizeChars: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=15    Report size of the screen in pixels. Result is "CSI 5 ; height ; width t".
    * No default implementation.
    */
  var getScreenSizePixels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=13      Report xterm window position. Result is "CSI 3 ; x ; y t".
    * Ps=13 ; 2  Report xterm text-area position. Result is "CSI 3 ; x ; y t".
    * No default implementation.
    */
  var getWinPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=18  Report the size of the text area in characters. Result is "CSI 8 ; height ; width t".
    * Has a default implementation.
    */
  var getWinSizeChars: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=14      Report xterm text area size in pixels. Result is "CSI 4 ; height ; width t".
    * Ps=14 ; 2  Report xterm window size in pixels. Result is "CSI  4 ; height ; width t".
    * Has a default implementation.
    */
  var getWinSizePixels: js.UndefOr[Boolean] = js.undefined
  
  /** Ps=11   Report xterm window state.
    * If the xterm window is non-iconified, it returns "CSI 1 t".
    * If the xterm window is iconified, it returns "CSI 2 t".
    * No default implementation.
    */
  var getWinState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=21  Report xterm window's title. Result is "OSC l label ST".
    * No default implementation.
    */
  var getWinTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=6    Lower the xterm window to the bottom of the stacking order.
    * No default implementation.
    */
  var lowerWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=9 ; 0   Restore maximized window.
    * Ps=9 ; 1   Maximize window (i.e., resize to screen size).
    * Ps=9 ; 2   Maximize window vertically.
    * Ps=9 ; 3   Maximize window horizontally.
    * No default implementation.
    */
  var maximizeWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=2    Iconify window.
    * No default implementation.
    */
  var minimizeWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=23 ; 0  Restore xterm icon and window title from stack.
    * Ps=23 ; 1  Restore xterm icon title from stack.
    * Ps=23 ; 2  Restore xterm window title from stack.
    * All variants have a default implementation.
    */
  var popTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=22 ; 0  Save xterm icon and window title on stack.
    * Ps=22 ; 1  Save xterm icon title on stack.
    * Ps=22 ; 2  Save xterm window title on stack.
    * All variants have a default implementation.
    */
  var pushTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=5    Raise the window to the front of the stacking order.
    * No default implementation.
    */
  var raiseWin: js.UndefOr[Boolean] = js.undefined
  
  /** Ps=7    Refresh the window. */
  var refreshWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=1    De-iconify window.
    * No default implementation.
    */
  var restoreWin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps>=24  Resize to Ps lines (DECSLPP).
    * DECSLPP is not implemented. This settings is also used to
    * enable / disable DECCOLM (earlier variant of DECSLPP).
    */
  var setWinLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps=3 ; x ; y
    * Move window to [x, y].
    * No default implementation.
    */
  var setWinPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps = 8 ; height ; width
    * Resize the text area to given height and width in characters.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters use the display's height or width.
    * No default implementation.
    */
  var setWinSizeChars: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ps = 4 ; height ; width
    * Resize the window to given `height` and `width` in pixels.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters should use the display's height or width.
    * No default implementation.
    */
  var setWinSizePixels: js.UndefOr[Boolean] = js.undefined
}
object IWindowOptions {
  
  @scala.inline
  def apply(): IWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowOptions]
  }
  
  @scala.inline
  implicit class IWindowOptionsMutableBuilder[Self <: IWindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreenWin(value: Boolean): Self = StObject.set(x, "fullscreenWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenWinUndefined: Self = StObject.set(x, "fullscreenWin", js.undefined)
    
    @scala.inline
    def setGetCellSizePixels(value: Boolean): Self = StObject.set(x, "getCellSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellSizePixelsUndefined: Self = StObject.set(x, "getCellSizePixels", js.undefined)
    
    @scala.inline
    def setGetIconTitle(value: Boolean): Self = StObject.set(x, "getIconTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIconTitleUndefined: Self = StObject.set(x, "getIconTitle", js.undefined)
    
    @scala.inline
    def setGetScreenSizeChars(value: Boolean): Self = StObject.set(x, "getScreenSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScreenSizeCharsUndefined: Self = StObject.set(x, "getScreenSizeChars", js.undefined)
    
    @scala.inline
    def setGetScreenSizePixels(value: Boolean): Self = StObject.set(x, "getScreenSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScreenSizePixelsUndefined: Self = StObject.set(x, "getScreenSizePixels", js.undefined)
    
    @scala.inline
    def setGetWinPosition(value: Boolean): Self = StObject.set(x, "getWinPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWinPositionUndefined: Self = StObject.set(x, "getWinPosition", js.undefined)
    
    @scala.inline
    def setGetWinSizeChars(value: Boolean): Self = StObject.set(x, "getWinSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWinSizeCharsUndefined: Self = StObject.set(x, "getWinSizeChars", js.undefined)
    
    @scala.inline
    def setGetWinSizePixels(value: Boolean): Self = StObject.set(x, "getWinSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWinSizePixelsUndefined: Self = StObject.set(x, "getWinSizePixels", js.undefined)
    
    @scala.inline
    def setGetWinState(value: Boolean): Self = StObject.set(x, "getWinState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWinStateUndefined: Self = StObject.set(x, "getWinState", js.undefined)
    
    @scala.inline
    def setGetWinTitle(value: Boolean): Self = StObject.set(x, "getWinTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWinTitleUndefined: Self = StObject.set(x, "getWinTitle", js.undefined)
    
    @scala.inline
    def setLowerWin(value: Boolean): Self = StObject.set(x, "lowerWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerWinUndefined: Self = StObject.set(x, "lowerWin", js.undefined)
    
    @scala.inline
    def setMaximizeWin(value: Boolean): Self = StObject.set(x, "maximizeWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizeWinUndefined: Self = StObject.set(x, "maximizeWin", js.undefined)
    
    @scala.inline
    def setMinimizeWin(value: Boolean): Self = StObject.set(x, "minimizeWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeWinUndefined: Self = StObject.set(x, "minimizeWin", js.undefined)
    
    @scala.inline
    def setPopTitle(value: Boolean): Self = StObject.set(x, "popTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopTitleUndefined: Self = StObject.set(x, "popTitle", js.undefined)
    
    @scala.inline
    def setPushTitle(value: Boolean): Self = StObject.set(x, "pushTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTitleUndefined: Self = StObject.set(x, "pushTitle", js.undefined)
    
    @scala.inline
    def setRaiseWin(value: Boolean): Self = StObject.set(x, "raiseWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaiseWinUndefined: Self = StObject.set(x, "raiseWin", js.undefined)
    
    @scala.inline
    def setRefreshWin(value: Boolean): Self = StObject.set(x, "refreshWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshWinUndefined: Self = StObject.set(x, "refreshWin", js.undefined)
    
    @scala.inline
    def setRestoreWin(value: Boolean): Self = StObject.set(x, "restoreWin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreWinUndefined: Self = StObject.set(x, "restoreWin", js.undefined)
    
    @scala.inline
    def setSetWinLines(value: Boolean): Self = StObject.set(x, "setWinLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWinLinesUndefined: Self = StObject.set(x, "setWinLines", js.undefined)
    
    @scala.inline
    def setSetWinPosition(value: Boolean): Self = StObject.set(x, "setWinPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWinPositionUndefined: Self = StObject.set(x, "setWinPosition", js.undefined)
    
    @scala.inline
    def setSetWinSizeChars(value: Boolean): Self = StObject.set(x, "setWinSizeChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWinSizeCharsUndefined: Self = StObject.set(x, "setWinSizeChars", js.undefined)
    
    @scala.inline
    def setSetWinSizePixels(value: Boolean): Self = StObject.set(x, "setWinSizePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWinSizePixelsUndefined: Self = StObject.set(x, "setWinSizePixels", js.undefined)
  }
}
