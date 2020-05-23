package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowOptions extends js.Object {
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
  def apply(
    fullscreenWin: js.UndefOr[Boolean] = js.undefined,
    getCellSizePixels: js.UndefOr[Boolean] = js.undefined,
    getIconTitle: js.UndefOr[Boolean] = js.undefined,
    getScreenSizeChars: js.UndefOr[Boolean] = js.undefined,
    getScreenSizePixels: js.UndefOr[Boolean] = js.undefined,
    getWinPosition: js.UndefOr[Boolean] = js.undefined,
    getWinSizeChars: js.UndefOr[Boolean] = js.undefined,
    getWinSizePixels: js.UndefOr[Boolean] = js.undefined,
    getWinState: js.UndefOr[Boolean] = js.undefined,
    getWinTitle: js.UndefOr[Boolean] = js.undefined,
    lowerWin: js.UndefOr[Boolean] = js.undefined,
    maximizeWin: js.UndefOr[Boolean] = js.undefined,
    minimizeWin: js.UndefOr[Boolean] = js.undefined,
    popTitle: js.UndefOr[Boolean] = js.undefined,
    pushTitle: js.UndefOr[Boolean] = js.undefined,
    raiseWin: js.UndefOr[Boolean] = js.undefined,
    refreshWin: js.UndefOr[Boolean] = js.undefined,
    restoreWin: js.UndefOr[Boolean] = js.undefined,
    setWinLines: js.UndefOr[Boolean] = js.undefined,
    setWinPosition: js.UndefOr[Boolean] = js.undefined,
    setWinSizeChars: js.UndefOr[Boolean] = js.undefined,
    setWinSizePixels: js.UndefOr[Boolean] = js.undefined
  ): IWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullscreenWin)) __obj.updateDynamic("fullscreenWin")(fullscreenWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getCellSizePixels)) __obj.updateDynamic("getCellSizePixels")(getCellSizePixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getIconTitle)) __obj.updateDynamic("getIconTitle")(getIconTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getScreenSizeChars)) __obj.updateDynamic("getScreenSizeChars")(getScreenSizeChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getScreenSizePixels)) __obj.updateDynamic("getScreenSizePixels")(getScreenSizePixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getWinPosition)) __obj.updateDynamic("getWinPosition")(getWinPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getWinSizeChars)) __obj.updateDynamic("getWinSizeChars")(getWinSizeChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getWinSizePixels)) __obj.updateDynamic("getWinSizePixels")(getWinSizePixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getWinState)) __obj.updateDynamic("getWinState")(getWinState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getWinTitle)) __obj.updateDynamic("getWinTitle")(getWinTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerWin)) __obj.updateDynamic("lowerWin")(lowerWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizeWin)) __obj.updateDynamic("maximizeWin")(maximizeWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizeWin)) __obj.updateDynamic("minimizeWin")(minimizeWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popTitle)) __obj.updateDynamic("popTitle")(popTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pushTitle)) __obj.updateDynamic("pushTitle")(pushTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseWin)) __obj.updateDynamic("raiseWin")(raiseWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshWin)) __obj.updateDynamic("refreshWin")(refreshWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreWin)) __obj.updateDynamic("restoreWin")(restoreWin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setWinLines)) __obj.updateDynamic("setWinLines")(setWinLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setWinPosition)) __obj.updateDynamic("setWinPosition")(setWinPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setWinSizeChars)) __obj.updateDynamic("setWinSizeChars")(setWinSizeChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setWinSizePixels)) __obj.updateDynamic("setWinSizePixels")(setWinSizePixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowOptions]
  }
}

