package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionsUndefined extends StObject {
  
  var collections: Unit
}
object CollectionsUndefined {
  
  inline def apply(collections: Unit): CollectionsUndefined = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionsUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionsUndefined] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: Unit): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
  }
}
