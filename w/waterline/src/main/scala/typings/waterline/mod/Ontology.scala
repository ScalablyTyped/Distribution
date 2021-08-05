package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ontology extends StObject {
  
  var collections: js.Any
  
  var datastores: js.Any
}
object Ontology {
  
  inline def apply(collections: js.Any, datastores: js.Any): Ontology = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], datastores = datastores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ontology]
  }
  
  extension [Self <: Ontology](x: Self) {
    
    inline def setCollections(value: js.Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setDatastores(value: js.Any): Self = StObject.set(x, "datastores", value.asInstanceOf[js.Any])
  }
}
