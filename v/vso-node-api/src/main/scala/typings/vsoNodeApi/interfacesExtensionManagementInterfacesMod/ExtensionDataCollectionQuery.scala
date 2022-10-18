package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDataCollectionQuery extends StObject {
  
  /**
    * A list of collections to query
    */
  var collections: js.Array[ExtensionDataCollection]
}
object ExtensionDataCollectionQuery {
  
  inline def apply(collections: js.Array[ExtensionDataCollection]): ExtensionDataCollectionQuery = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollectionQuery]
  }
  
  extension [Self <: ExtensionDataCollectionQuery](x: Self) {
    
    inline def setCollections(value: js.Array[ExtensionDataCollection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: ExtensionDataCollection*): Self = StObject.set(x, "collections", js.Array(value*))
  }
}
