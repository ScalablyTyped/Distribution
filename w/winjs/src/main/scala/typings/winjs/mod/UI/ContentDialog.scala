package typings.winjs.mod.UI

import typings.std.HTMLElement
import typings.winjs.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a modal dialog which can display arbitrary HTML content.
  **/
@JSImport("winjs", "UI.ContentDialog")
@js.native
/**
  * Creates a new ContentDialog control.
  * @constructor
  * @param The DOM element that hosts the ContentDialog control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class ContentDialog ()
  extends typings.winjs.WinJS.UI.ContentDialog {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.ContentDialog")
@js.native
object ContentDialog extends js.Object {
  /**
    * Specifies the result of dismissing the ContentDialog.
    **/
  var DismissalResult: None = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

