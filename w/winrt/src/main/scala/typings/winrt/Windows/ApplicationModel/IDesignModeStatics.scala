package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDesignModeStatics extends js.Object {
  var designModeEnabled: Boolean = js.native
}

object IDesignModeStatics {
  @scala.inline
  def apply(designModeEnabled: Boolean): IDesignModeStatics = {
    val __obj = js.Dynamic.literal(designModeEnabled = designModeEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesignModeStatics]
  }
  @scala.inline
  implicit class IDesignModeStaticsOps[Self <: IDesignModeStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDesignModeEnabled(value: Boolean): Self = this.set("designModeEnabled", value.asInstanceOf[js.Any])
  }
  
}

