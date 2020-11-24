package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Browse
import typings.tryghostContentApi.anon.BrowseBrowseFunction
import typings.tryghostContentApi.anon.BrowseRead
import typings.tryghostContentApi.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostAPI extends js.Object {
  
  var authors: Read = js.native
  
  var pages: Browse = js.native
  
  var posts: Browse = js.native
  
  var settings: BrowseBrowseFunction = js.native
  
  var tags: BrowseRead = js.native
}
object GhostAPI {
  
  @scala.inline
  def apply(authors: Read, pages: Browse, posts: Browse, settings: BrowseBrowseFunction, tags: BrowseRead): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostAPI]
  }
  
  @scala.inline
  implicit class GhostAPIOps[Self <: GhostAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthors(value: Read): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Browse): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosts(value: Browse): Self = this.set("posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: BrowseBrowseFunction): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: BrowseRead): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
