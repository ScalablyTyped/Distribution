package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirefoxOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var binary: js.UndefOr[String] = js.native
  var log: js.UndefOr[FirefoxLogObject] = js.native
  var prefs: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  var profile: js.UndefOr[String] = js.native
}

object FirefoxOptions {
  @scala.inline
  def apply(): FirefoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxOptions]
  }
  @scala.inline
  implicit class FirefoxOptionsOps[Self <: FirefoxOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setLog(value: FirefoxLogObject): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setPrefs(value: StringDictionary[String | Double | Boolean]): Self = this.set("prefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefs: Self = this.set("prefs", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

