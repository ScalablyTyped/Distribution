package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDesignModeStatics extends js.Object {
  var designModeEnabled: Boolean
}

object IDesignModeStatics {
  @scala.inline
  def apply(designModeEnabled: Boolean): IDesignModeStatics = {
    val __obj = js.Dynamic.literal(designModeEnabled = designModeEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesignModeStatics]
  }
}

