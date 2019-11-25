package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToManager extends js.Object {
  var defaultSourceSelection: Boolean
  var onsourcerequested: js.Any
  var onsourceselected: js.Any
}

object IPlayToManager {
  @scala.inline
  def apply(defaultSourceSelection: Boolean, onsourcerequested: js.Any, onsourceselected: js.Any): IPlayToManager = {
    val __obj = js.Dynamic.literal(defaultSourceSelection = defaultSourceSelection.asInstanceOf[js.Any], onsourcerequested = onsourcerequested.asInstanceOf[js.Any], onsourceselected = onsourceselected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlayToManager]
  }
}

