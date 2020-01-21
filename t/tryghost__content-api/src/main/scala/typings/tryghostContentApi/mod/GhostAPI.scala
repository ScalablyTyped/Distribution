package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonBrowse
import typings.tryghostContentApi.AnonBrowseBrowseFunction
import typings.tryghostContentApi.AnonBrowseRead
import typings.tryghostContentApi.AnonBrowseReadBrowseFunction
import typings.tryghostContentApi.AnonBrowseReadBrowseFunctionPagesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostAPI extends js.Object {
  var authors: AnonBrowseRead
  var pages: AnonBrowseReadBrowseFunctionPagesObject
  var posts: AnonBrowse
  var settings: AnonBrowseBrowseFunction
  var tags: AnonBrowseReadBrowseFunction
}

object GhostAPI {
  @scala.inline
  def apply(
    authors: AnonBrowseRead,
    pages: AnonBrowseReadBrowseFunctionPagesObject,
    posts: AnonBrowse,
    settings: AnonBrowseBrowseFunction,
    tags: AnonBrowseReadBrowseFunction
  ): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GhostAPI]
  }
}

