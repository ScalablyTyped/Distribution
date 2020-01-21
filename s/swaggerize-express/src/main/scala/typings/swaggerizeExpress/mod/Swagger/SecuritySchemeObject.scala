package typings.swaggerizeExpress.mod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeObject extends js.Object {
  var authorizationUrl: String
  var description: js.UndefOr[String] = js.undefined
  var flow: String
  var in: String
  var name: String
  var scopes: ScopesObject
  var tokenUrl: String
  var `type`: String
}

object SecuritySchemeObject {
  @scala.inline
  def apply(
    authorizationUrl: String,
    flow: String,
    in: String,
    name: String,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: String,
    description: String = null
  ): SecuritySchemeObject = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObject]
  }
}

