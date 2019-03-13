package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickInput extends js.Object {
  /**
  		 * If the UI should show a progress indicator. Defaults to false.
  		 *
  		 * Change this to true, e.g., while loading more data or validating
  		 * user input.
  		 */
  var busy: scala.Boolean = js.native
  /**
  		 * If the UI should allow for user input. Defaults to true.
  		 *
  		 * Change this to false, e.g., while validating user input or
  		 * loading data for the next step in user input.
  		 */
  var enabled: scala.Boolean = js.native
  /**
  		 * If the UI should stay open even when loosing UI focus. Defaults to false.
  		 */
  var ignoreFocusOut: scala.Boolean = js.native
  /**
  		 * An event signaling when this input UI is hidden.
  		 *
  		 * There are several reasons why this UI might have to be hidden and
  		 * the extension will be notified through [QuickInput.onDidHide](#QuickInput.onDidHide).
  		 * (Examples include: an explict call to [QuickInput.hide](#QuickInput.hide),
  		 * the user pressing Esc, some other input UI opening, etc.)
  		 */
  @JSName("onDidHide")
  var onDidHide_Original: Event[scala.Unit] = js.native
  /**
  		 * An optional current step count.
  		 */
  var step: js.UndefOr[scala.Double] = js.native
  /**
  		 * An optional title.
  		 */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
  		 * An optional total step count.
  		 */
  var totalSteps: js.UndefOr[scala.Double] = js.native
  /**
  		 * Dispose of this input UI and any associated resources. If it is still
  		 * visible, it is first hidden. After this call the input UI is no longer
  		 * functional and no additional methods or properties on it should be
  		 * accessed. Instead a new input UI should be created.
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * Hides this input UI. This will also fire an [QuickInput.onDidHide](#QuickInput.onDidHide)
  		 * event.
  		 */
  def hide(): scala.Unit = js.native
  /**
  		 * An event signaling when this input UI is hidden.
  		 *
  		 * There are several reasons why this UI might have to be hidden and
  		 * the extension will be notified through [QuickInput.onDidHide](#QuickInput.onDidHide).
  		 * (Examples include: an explict call to [QuickInput.hide](#QuickInput.hide),
  		 * the user pressing Esc, some other input UI opening, etc.)
  		 */
  def onDidHide(listener: js.Function1[/* e */ scala.Unit, _]): Disposable = js.native
  def onDidHide(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): Disposable = js.native
  def onDidHide(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Makes the input UI visible in its current configuration. Any other input
  		 * UI will first fire an [QuickInput.onDidHide](#QuickInput.onDidHide) event.
  		 */
  def show(): scala.Unit = js.native
}

