package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeObject extends js.Object {
  var authorizationUrl: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var flow: java.lang.String
  var in: java.lang.String
  var name: java.lang.String
  var scopes: ScopesObject
  var tokenUrl: java.lang.String
  var `type`: java.lang.String
}

object SecuritySchemeObject {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: java.lang.String,
    in: java.lang.String,
    name: java.lang.String,
    scopes: ScopesObject,
    tokenUrl: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow, in = in, name = name, scopes = scopes, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

