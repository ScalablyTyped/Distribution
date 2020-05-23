package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TextRequested event. */
trait CoreTextTextRequestedEventArgs extends js.Object {
  /** Gets information about a TextRequested event. */
  var request: CoreTextTextRequest
}

object CoreTextTextRequestedEventArgs {
  @scala.inline
  def apply(request: CoreTextTextRequest): CoreTextTextRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequestedEventArgs]
  }
}

