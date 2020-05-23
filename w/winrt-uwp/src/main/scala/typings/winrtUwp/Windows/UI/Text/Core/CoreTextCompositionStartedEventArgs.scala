package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CompositionStarted event. */
trait CoreTextCompositionStartedEventArgs extends js.Object {
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
}

object CoreTextCompositionStartedEventArgs {
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean): CoreTextCompositionStartedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionStartedEventArgs]
  }
}

