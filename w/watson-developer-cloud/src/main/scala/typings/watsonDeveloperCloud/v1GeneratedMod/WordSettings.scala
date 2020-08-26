package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of Word conversion settings. */
@js.native
trait WordSettings extends js.Object {
  var heading: js.UndefOr[WordHeadingDetection] = js.native
}

object WordSettings {
  @scala.inline
  def apply(): WordSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordSettings]
  }
  @scala.inline
  implicit class WordSettingsOps[Self <: WordSettings] (val x: Self) extends AnyVal {
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
    def setHeading(value: WordHeadingDetection): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
  }
  
}

