package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var authorization: ProxyAuthorization
  /**
    * This is a description string
    */
  var description: String
  /**
    * The friendly name of the server
    */
  var friendlyName: String
  var globalDefault: Boolean
  /**
    * This is a string representation of the site that the proxy server is located in (e.g. "NA-WA-RED")
    */
  var site: String
  var siteDefault: Boolean
  /**
    * The URL of the proxy server
    */
  var url: String
}

object Proxy {
  @scala.inline
  def apply(
    authorization: ProxyAuthorization,
    description: String,
    friendlyName: String,
    globalDefault: Boolean,
    site: String,
    siteDefault: Boolean,
    url: String
  ): Proxy = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], siteDefault = siteDefault.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Proxy]
  }
}

