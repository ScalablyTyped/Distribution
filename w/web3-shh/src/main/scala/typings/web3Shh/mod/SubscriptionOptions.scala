package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOptions extends js.Object {
  var allowP2P: js.UndefOr[Boolean] = js.native
  var minPow: js.UndefOr[Double] = js.native
  var privateKeyID: js.UndefOr[String] = js.native
  var sig: js.UndefOr[String] = js.native
  var symKeyID: js.UndefOr[String] = js.native
  var topics: js.UndefOr[js.Array[String]] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
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
    def setAllowP2P(value: Boolean): Self = this.set("allowP2P", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowP2P: Self = this.set("allowP2P", js.undefined)
    @scala.inline
    def setMinPow(value: Double): Self = this.set("minPow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPow: Self = this.set("minPow", js.undefined)
    @scala.inline
    def setPrivateKeyID(value: String): Self = this.set("privateKeyID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKeyID: Self = this.set("privateKeyID", js.undefined)
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSig: Self = this.set("sig", js.undefined)
    @scala.inline
    def setSymKeyID(value: String): Self = this.set("symKeyID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymKeyID: Self = this.set("symKeyID", js.undefined)
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

