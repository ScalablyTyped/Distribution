package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionId extends StObject {
  
  var collectionId: String
}
object CollectionId {
  
  inline def apply(collectionId: String): CollectionId = {
    val __obj = js.Dynamic.literal(collectionId = collectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionId]
  }
  
  extension [Self <: CollectionId](x: Self) {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
  }
}
