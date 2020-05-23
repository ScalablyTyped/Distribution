package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Browse
import typings.tryghostContentApi.anon.BrowseBrowseFunction
import typings.tryghostContentApi.anon.BrowseRead
import typings.tryghostContentApi.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostAPI extends js.Object {
  var authors: Read
  var pages: Browse
  var posts: Browse
  var settings: BrowseBrowseFunction
  var tags: BrowseRead
}

object GhostAPI {
  @scala.inline
  def apply(authors: Read, pages: Browse, posts: Browse, settings: BrowseBrowseFunction, tags: BrowseRead): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostAPI]
  }
}

