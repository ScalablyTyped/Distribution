package typings.vigourUa.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends /* value */ StringDictionary[String | Double] {
  var browser: String = js.native
  var prefix: String = js.native
  var version: Double = js.native
}

object UserAgent {
  @scala.inline
  def apply(browser: String, prefix: String, version: Double): UserAgent = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

