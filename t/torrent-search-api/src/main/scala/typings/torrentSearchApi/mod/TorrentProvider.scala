package typings.torrentSearchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentProvider extends js.Object {
  var autoFixUnstableUrl: Boolean
  var baseUrl: String
  var categories: js.Any
   // FIXME {key: [string]}
  var defaultCategory: String
  var enableCloudFareBypass: Boolean
  var headers: js.Any
  var itemSelectors: js.Any
  var itemsSelector: String
  var loginQueryString: String
  var loginUrl: String
   // FIXME {key:[string]}
  var magnetSelector: String
  var name: String
   // FIXME {key: [string]}
  var paginateSelector: String
  var requireAuthentification: Boolean
  var resultsPerPageCount: Double
  var searchUrl: String
  var supportCookiesAuthentification: Boolean
  var supportCredentialsAuthentification: Boolean
  var supportTokenAuthentification: Boolean
  var torrentDetailsSelector: String
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
}

