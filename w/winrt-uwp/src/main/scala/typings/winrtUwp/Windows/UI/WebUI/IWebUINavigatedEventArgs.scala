package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app navigation event. */
trait IWebUINavigatedEventArgs extends js.Object {
  /** Gets the app navigation operation. */
  var navigatedOperation: WebUINavigatedOperation
}

object IWebUINavigatedEventArgs {
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
}

