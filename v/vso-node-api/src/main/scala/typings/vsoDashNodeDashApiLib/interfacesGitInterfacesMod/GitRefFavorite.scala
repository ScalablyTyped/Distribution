package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefFavorite extends js.Object {
  var _links: js.Any
  var id: scala.Double
  var identityId: java.lang.String
  var name: java.lang.String
  var repositoryId: java.lang.String
  var `type`: RefFavoriteType
  var url: java.lang.String
}

object GitRefFavorite {
  @scala.inline
  def apply(
    _links: js.Any,
    id: scala.Double,
    identityId: java.lang.String,
    name: java.lang.String,
    repositoryId: java.lang.String,
    `type`: RefFavoriteType,
    url: java.lang.String
  ): GitRefFavorite = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("identityId")(identityId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitRefFavorite]
  }
}

