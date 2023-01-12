package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Photos extends StObject {
  
  var collections: GetRelated
  
  var photos: Get
  
  var search: GetPhotos
  
  var topics: typings.unsplashJs.anon.List
  
  var users: GetCollections
}
object Photos {
  
  inline def apply(
    collections: GetRelated,
    photos: Get,
    search: GetPhotos,
    topics: typings.unsplashJs.anon.List,
    users: GetCollections
  ): Photos = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Photos] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: GetRelated): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: Get): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: GetPhotos): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: typings.unsplashJs.anon.List): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: GetCollections): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
