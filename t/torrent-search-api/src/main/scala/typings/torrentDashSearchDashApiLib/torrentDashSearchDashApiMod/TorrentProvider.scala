package typings
package torrentDashSearchDashApiLib.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentProvider extends js.Object {
  var autoFixUnstableUrl: scala.Boolean
  var baseUrl: java.lang.String
  var categories: js.Any
   // FIXME {key: [string]}
  var defaultCategory: java.lang.String
  var enableCloudFareBypass: scala.Boolean
  var headers: js.Any
  var itemSelectors: js.Any
  var itemsSelector: java.lang.String
  var loginQueryString: java.lang.String
  var loginUrl: java.lang.String
   // FIXME {key:[string]}
  var magnetSelector: java.lang.String
  var name: java.lang.String
   // FIXME {key: [string]}
  var paginateSelector: java.lang.String
  var requireAuthentification: scala.Boolean
  var resultsPerPageCount: scala.Double
  var searchUrl: java.lang.String
  var supportCookiesAuthentification: scala.Boolean
  var supportCredentialsAuthentification: scala.Boolean
  var supportTokenAuthentification: scala.Boolean
  var torrentDetailsSelector: java.lang.String
}

object TorrentProvider {
  @scala.inline
  def apply(
    autoFixUnstableUrl: scala.Boolean,
    baseUrl: java.lang.String,
    categories: js.Any,
    defaultCategory: java.lang.String,
    enableCloudFareBypass: scala.Boolean,
    headers: js.Any,
    itemSelectors: js.Any,
    itemsSelector: java.lang.String,
    loginQueryString: java.lang.String,
    loginUrl: java.lang.String,
    magnetSelector: java.lang.String,
    name: java.lang.String,
    paginateSelector: java.lang.String,
    requireAuthentification: scala.Boolean,
    resultsPerPageCount: scala.Double,
    searchUrl: java.lang.String,
    supportCookiesAuthentification: scala.Boolean,
    supportCredentialsAuthentification: scala.Boolean,
    supportTokenAuthentification: scala.Boolean,
    torrentDetailsSelector: java.lang.String
  ): TorrentProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoFixUnstableUrl")(autoFixUnstableUrl)
    __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("defaultCategory")(defaultCategory)
    __obj.updateDynamic("enableCloudFareBypass")(enableCloudFareBypass)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("itemSelectors")(itemSelectors)
    __obj.updateDynamic("itemsSelector")(itemsSelector)
    __obj.updateDynamic("loginQueryString")(loginQueryString)
    __obj.updateDynamic("loginUrl")(loginUrl)
    __obj.updateDynamic("magnetSelector")(magnetSelector)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("paginateSelector")(paginateSelector)
    __obj.updateDynamic("requireAuthentification")(requireAuthentification)
    __obj.updateDynamic("resultsPerPageCount")(resultsPerPageCount)
    __obj.updateDynamic("searchUrl")(searchUrl)
    __obj.updateDynamic("supportCookiesAuthentification")(supportCookiesAuthentification)
    __obj.updateDynamic("supportCredentialsAuthentification")(supportCredentialsAuthentification)
    __obj.updateDynamic("supportTokenAuthentification")(supportTokenAuthentification)
    __obj.updateDynamic("torrentDetailsSelector")(torrentDetailsSelector)
    __obj.asInstanceOf[TorrentProvider]
  }
}

