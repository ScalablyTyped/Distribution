package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ontology extends StObject {
  
  var collections: Any
  
  /** A set of datastores */
  var datastores: StringDictionary[Datastore]
}
object Ontology {
  
  inline def apply(collections: Any, datastores: StringDictionary[Datastore]): Ontology = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], datastores = datastores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ontology]
  }
  
  extension [Self <: Ontology](x: Self) {
    
    inline def setCollections(value: Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setDatastores(value: StringDictionary[Datastore]): Self = StObject.set(x, "datastores", value.asInstanceOf[js.Any])
  }
}
