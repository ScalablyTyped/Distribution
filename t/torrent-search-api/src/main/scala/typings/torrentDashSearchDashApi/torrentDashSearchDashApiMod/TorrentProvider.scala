package typings.torrentDashSearchDashApi.torrentDashSearchDashApiMod

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
    val __obj = js.Dynamic.literal(autoFixUnstableUrl = autoFixUnstableUrl, baseUrl = baseUrl, categories = categories, defaultCategory = defaultCategory, enableCloudFareBypass = enableCloudFareBypass, headers = headers, itemSelectors = itemSelectors, itemsSelector = itemsSelector, loginQueryString = loginQueryString, loginUrl = loginUrl, magnetSelector = magnetSelector, name = name, paginateSelector = paginateSelector, requireAuthentification = requireAuthentification, resultsPerPageCount = resultsPerPageCount, searchUrl = searchUrl, supportCookiesAuthentification = supportCookiesAuthentification, supportCredentialsAuthentification = supportCredentialsAuthentification, supportTokenAuthentification = supportTokenAuthentification, torrentDetailsSelector = torrentDetailsSelector)
  
    __obj.asInstanceOf[TorrentProvider]
  }
}

