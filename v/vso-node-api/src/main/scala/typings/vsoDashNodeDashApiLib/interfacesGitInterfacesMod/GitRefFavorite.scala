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
    val __obj = js.Dynamic.literal(_links = _links, id = id, identityId = identityId, name = name, repositoryId = repositoryId, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitRefFavorite]
  }
}

