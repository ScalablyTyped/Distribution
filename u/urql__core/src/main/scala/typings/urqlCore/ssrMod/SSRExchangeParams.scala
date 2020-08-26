package typings.urqlCore.ssrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSRExchangeParams extends js.Object {
  var initialState: js.UndefOr[SSRData] = js.native
  var isClient: js.UndefOr[Boolean] = js.native
}

object SSRExchangeParams {
  @scala.inline
  def apply(): SSRExchangeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSRExchangeParams]
  }
  @scala.inline
  implicit class SSRExchangeParamsOps[Self <: SSRExchangeParams] (val x: Self) extends AnyVal {
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
    def setInitialState(value: SSRData): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setIsClient(value: Boolean): Self = this.set("isClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClient: Self = this.set("isClient", js.undefined)
  }
  
}

