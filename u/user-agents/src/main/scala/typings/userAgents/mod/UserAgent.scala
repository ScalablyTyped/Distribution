package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends js.Object {
  /**
    *  The value of data.appName
    */
  var appName: String = js.native
  /**
    * Get a fingerprint for the UserAgent instance
    */
  var data: Data = js.native
  /**
    * Generates a new UserAgent instance using the same filters that were used to construct userAgent
    */
  def random(): UserAgent = js.native
}

object UserAgent {
  @scala.inline
  def apply(appName: String, data: Data, random: () => UserAgent): UserAgent = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], random = js.Any.fromFunction0(random))
    __obj.asInstanceOf[UserAgent]
  }
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRandom(value: () => UserAgent): Self = this.set("random", js.Any.fromFunction0(value))
  }
  
}

