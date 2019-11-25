package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedEventArgsDeferral extends js.Object {
  var activatedOperation: ActivatedOperation
}

object IActivatedEventArgsDeferral {
  @scala.inline
  def apply(activatedOperation: ActivatedOperation): IActivatedEventArgsDeferral = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IActivatedEventArgsDeferral]
  }
}

