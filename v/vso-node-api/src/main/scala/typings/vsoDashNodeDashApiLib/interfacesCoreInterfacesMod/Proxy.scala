package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var authorization: ProxyAuthorization
  /**
    * This is a description string
    */
  var description: java.lang.String
  /**
    * The friendly name of the server
    */
  var friendlyName: java.lang.String
  var globalDefault: scala.Boolean
  /**
    * This is a string representation of the site that the proxy server is located in (e.g. "NA-WA-RED")
    */
  var site: java.lang.String
  var siteDefault: scala.Boolean
  /**
    * The URL of the proxy server
    */
  var url: java.lang.String
}

object Proxy {
  @scala.inline
  def apply(
    authorization: ProxyAuthorization,
    description: java.lang.String,
    friendlyName: java.lang.String,
    globalDefault: scala.Boolean,
    site: java.lang.String,
    siteDefault: scala.Boolean,
    url: java.lang.String
  ): Proxy = {
    val __obj = js.Dynamic.literal(authorization = authorization, description = description, friendlyName = friendlyName, globalDefault = globalDefault, site = site, siteDefault = siteDefault, url = url)
  
    __obj.asInstanceOf[Proxy]
  }
}

