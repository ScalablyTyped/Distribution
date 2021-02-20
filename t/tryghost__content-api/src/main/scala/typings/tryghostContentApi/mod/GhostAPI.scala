package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Browse
import typings.tryghostContentApi.anon.BrowseBrowseFunction
import typings.tryghostContentApi.anon.BrowseRead
import typings.tryghostContentApi.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostAPI extends StObject {
  
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
  implicit class GhostAPIMutableBuilder[Self <: GhostAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors(value: Read): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Browse): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosts(value: Browse): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: BrowseBrowseFunction): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: BrowseRead): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
