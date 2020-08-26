package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSelectorOptions extends js.Object {
  var props: js.UndefOr[js.Object] = js.native
  var state: js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean] = js.native
}

object ReactSelectorOptions {
  @scala.inline
  def apply(): ReactSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSelectorOptions]
  }
  @scala.inline
  implicit class ReactSelectorOptionsOps[Self <: ReactSelectorOptions] (val x: Self) extends AnyVal {
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
    def setProps(value: js.Object): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setStateVarargs(value: js.Any*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[_] | Double | String | js.Object | Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

