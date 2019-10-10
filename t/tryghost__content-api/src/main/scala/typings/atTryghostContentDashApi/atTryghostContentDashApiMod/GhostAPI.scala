package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Browse
import typings.atTryghostContentDashApi.Anon_BrowseBrowseFunction
import typings.atTryghostContentDashApi.Anon_BrowseRead
import typings.atTryghostContentDashApi.Anon_BrowseReadBrowseFunction
import typings.atTryghostContentDashApi.Anon_BrowseReadBrowseFunctionPagesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostAPI extends js.Object {
  var authors: Anon_BrowseRead
  var pages: Anon_BrowseReadBrowseFunctionPagesObject
  var posts: Anon_Browse
  var settings: Anon_BrowseBrowseFunction
  var tags: Anon_BrowseReadBrowseFunction
}

object GhostAPI {
  @scala.inline
  def apply(
    authors: Anon_BrowseRead,
    pages: Anon_BrowseReadBrowseFunctionPagesObject,
    posts: Anon_Browse,
    settings: Anon_BrowseBrowseFunction,
    tags: Anon_BrowseReadBrowseFunction
  ): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors, pages = pages, posts = posts, settings = settings, tags = tags)
  
    __obj.asInstanceOf[GhostAPI]
  }
}

