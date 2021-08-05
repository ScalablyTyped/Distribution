package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ListCollectionsResponse. */
trait ListCollectionsResponse extends StObject {
  
  /** An array containing information about each collection in the environment. */
  var collections: js.UndefOr[js.Array[Collection]] = js.undefined
}
object ListCollectionsResponse {
  
  inline def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  extension [Self <: ListCollectionsResponse](x: Self) {
    
    inline def setCollections(value: js.Array[Collection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: Collection*): Self = StObject.set(x, "collections", js.Array(value :_*))
  }
}
