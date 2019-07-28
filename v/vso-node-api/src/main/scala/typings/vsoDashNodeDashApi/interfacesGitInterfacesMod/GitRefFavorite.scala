package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefFavorite extends js.Object {
  var _links: js.Any
  var id: Double
  var identityId: String
  var name: String
  var repositoryId: String
  var `type`: RefFavoriteType
  var url: String
}

object GitRefFavorite {
  @scala.inline
  def apply(
    _links: js.Any,
    id: Double,
    identityId: String,
    name: String,
    repositoryId: String,
    `type`: RefFavoriteType,
    url: String
  ): GitRefFavorite = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, identityId = identityId, name = name, repositoryId = repositoryId, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitRefFavorite]
  }
}

