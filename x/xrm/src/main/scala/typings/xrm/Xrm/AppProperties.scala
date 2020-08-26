package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * properties of the current business app in Customer Engagement.
  */
@js.native
trait AppProperties extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var uniqueName: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var webResourceId: js.UndefOr[String] = js.native
  var webResourceName: js.UndefOr[String] = js.native
  var welcomePageId: js.UndefOr[String] = js.native
  var welcomePageName: js.UndefOr[String] = js.native
}

object AppProperties {
  @scala.inline
  def apply(): AppProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProperties]
  }
  @scala.inline
  implicit class AppPropertiesOps[Self <: AppProperties] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWebResourceId(value: String): Self = this.set("webResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResourceId: Self = this.set("webResourceId", js.undefined)
    @scala.inline
    def setWebResourceName(value: String): Self = this.set("webResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResourceName: Self = this.set("webResourceName", js.undefined)
    @scala.inline
    def setWelcomePageId(value: String): Self = this.set("welcomePageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomePageId: Self = this.set("welcomePageId", js.undefined)
    @scala.inline
    def setWelcomePageName(value: String): Self = this.set("welcomePageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomePageName: Self = this.set("welcomePageName", js.undefined)
  }
  
}

