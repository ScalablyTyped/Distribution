package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferenceHelper extends js.Object {
  def getPreferences(): PreferenceHelper = js.native
}

object PreferenceHelper {
  @scala.inline
  def apply(getPreferences: () => PreferenceHelper): PreferenceHelper = {
    val __obj = js.Dynamic.literal(getPreferences = js.Any.fromFunction0(getPreferences))
    __obj.asInstanceOf[PreferenceHelper]
  }
  @scala.inline
  implicit class PreferenceHelperOps[Self <: PreferenceHelper] (val x: Self) extends AnyVal {
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
    def setGetPreferences(value: () => PreferenceHelper): Self = this.set("getPreferences", js.Any.fromFunction0(value))
  }
  
}

