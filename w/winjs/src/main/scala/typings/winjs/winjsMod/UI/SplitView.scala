package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import typings.winjs.Anon_BottomLeft
import typings.winjs.Anon_Inline
import typings.winjs.Anon_InlineOverlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
  **/
@JSImport("winjs", "UI.SplitView")
@js.native
/**
  * Creates a new SplitView.
  * @constructor
  * @param element The DOM element hosts the new SplitView.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class SplitView ()
  extends typings.winjs.WinJS.UI.SplitView {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.SplitView")
@js.native
object SplitView extends js.Object {
  /**
    * Display options for a SplitView's pane when it is closed.
    **/
  var ClosedDisplayMode: Anon_Inline = js.native
  /**
    * Display options for a SplitView's pane when it is open.
    **/
  var OpenedDisplayMode: Anon_InlineOverlay = js.native
  /**
    * Placement options for a SplitView's pane.
    **/
  var PanePlacement: Anon_BottomLeft = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

