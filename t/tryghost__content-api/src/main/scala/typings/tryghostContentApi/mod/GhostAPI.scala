package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Browse
import typings.tryghostContentApi.anon.BrowseBrowseFunction
import typings.tryghostContentApi.anon.BrowseRead
import typings.tryghostContentApi.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GhostAPI extends StObject {
  
  var authors: Read
  
  var pages: Browse
  
  var posts: Browse
  
  var settings: BrowseBrowseFunction
  
  var tags: BrowseRead
}
object GhostAPI {
  
  inline def apply(authors: Read, pages: Browse, posts: Browse, settings: BrowseBrowseFunction, tags: BrowseRead): GhostAPI = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostAPI]
  }
  
  extension [Self <: GhostAPI](x: Self) {
    
    inline def setAuthors(value: Read): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Browse): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPosts(value: Browse): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: BrowseBrowseFunction): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setTags(value: BrowseRead): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
