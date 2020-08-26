package typings.xmlbuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubID extends js.Object {
  var pubID: js.UndefOr[java.lang.String] = js.native
  var sysID: js.UndefOr[java.lang.String] = js.native
}

object PubID {
  @scala.inline
  def apply(): PubID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubID]
  }
  @scala.inline
  implicit class PubIDOps[Self <: PubID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPubID(value: java.lang.String): Self = this.set("pubID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubID: Self = this.set("pubID", js.undefined)
    @scala.inline
    def setSysID(value: java.lang.String): Self = this.set("sysID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSysID: Self = this.set("sysID", js.undefined)
  }
  
}

