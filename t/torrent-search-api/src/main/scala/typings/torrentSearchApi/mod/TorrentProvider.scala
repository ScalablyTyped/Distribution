package typings.torrentSearchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentProvider extends js.Object {
  var autoFixUnstableUrl: Boolean = js.native
  var baseUrl: String = js.native
  var categories: js.Any = js.native
   // FIXME {key: [string]}
  var defaultCategory: String = js.native
  var enableCloudFareBypass: Boolean = js.native
  var headers: js.Any = js.native
  var itemSelectors: js.Any = js.native
  var itemsSelector: String = js.native
  var loginQueryString: String = js.native
  var loginUrl: String = js.native
   // FIXME {key:[string]}
  var magnetSelector: String = js.native
  var name: String = js.native
   // FIXME {key: [string]}
  var paginateSelector: String = js.native
  var requireAuthentification: Boolean = js.native
  var resultsPerPageCount: Double = js.native
  var searchUrl: String = js.native
  var supportCookiesAuthentification: Boolean = js.native
  var supportCredentialsAuthentification: Boolean = js.native
  var supportTokenAuthentification: Boolean = js.native
  var torrentDetailsSelector: String = js.native
}

object TorrentProvider {
  @scala.inline
  def apply(
    autoFixUnstableUrl: Boolean,
    baseUrl: String,
    categories: js.Any,
    defaultCategory: String,
    enableCloudFareBypass: Boolean,
    headers: js.Any,
    itemSelectors: js.Any,
    itemsSelector: String,
    loginQueryString: String,
    loginUrl: String,
    magnetSelector: String,
    name: String,
    paginateSelector: String,
    requireAuthentification: Boolean,
    resultsPerPageCount: Double,
    searchUrl: String,
    supportCookiesAuthentification: Boolean,
    supportCredentialsAuthentification: Boolean,
    supportTokenAuthentification: Boolean,
    torrentDetailsSelector: String
  ): TorrentProvider = {
    val __obj = js.Dynamic.literal(autoFixUnstableUrl = autoFixUnstableUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], enableCloudFareBypass = enableCloudFareBypass.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], itemSelectors = itemSelectors.asInstanceOf[js.Any], itemsSelector = itemsSelector.asInstanceOf[js.Any], loginQueryString = loginQueryString.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any], magnetSelector = magnetSelector.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paginateSelector = paginateSelector.asInstanceOf[js.Any], requireAuthentification = requireAuthentification.asInstanceOf[js.Any], resultsPerPageCount = resultsPerPageCount.asInstanceOf[js.Any], searchUrl = searchUrl.asInstanceOf[js.Any], supportCookiesAuthentification = supportCookiesAuthentification.asInstanceOf[js.Any], supportCredentialsAuthentification = supportCredentialsAuthentification.asInstanceOf[js.Any], supportTokenAuthentification = supportTokenAuthentification.asInstanceOf[js.Any], torrentDetailsSelector = torrentDetailsSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentProvider]
  }
  @scala.inline
  implicit class TorrentProviderOps[Self <: TorrentProvider] (val x: Self) extends AnyVal {
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
    def setAutoFixUnstableUrl(value: Boolean): Self = this.set("autoFixUnstableUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: js.Any): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCategory(value: String): Self = this.set("defaultCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableCloudFareBypass(value: Boolean): Self = this.set("enableCloudFareBypass", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemSelectors(value: js.Any): Self = this.set("itemSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsSelector(value: String): Self = this.set("itemsSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginQueryString(value: String): Self = this.set("loginQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagnetSelector(value: String): Self = this.set("magnetSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaginateSelector(value: String): Self = this.set("paginateSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireAuthentification(value: Boolean): Self = this.set("requireAuthentification", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsPerPageCount(value: Double): Self = this.set("resultsPerPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchUrl(value: String): Self = this.set("searchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportCookiesAuthentification(value: Boolean): Self = this.set("supportCookiesAuthentification", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportCredentialsAuthentification(value: Boolean): Self = this.set("supportCredentialsAuthentification", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportTokenAuthentification(value: Boolean): Self = this.set("supportTokenAuthentification", value.asInstanceOf[js.Any])
    @scala.inline
    def setTorrentDetailsSelector(value: String): Self = this.set("torrentDetailsSelector", value.asInstanceOf[js.Any])
  }
  
}

