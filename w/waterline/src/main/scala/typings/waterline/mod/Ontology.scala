package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ontology extends StObject {
  
  var collections: js.Any = js.native
  
  var datastores: js.Any = js.native
}
object Ontology {
  
  @scala.inline
  def apply(collections: js.Any, datastores: js.Any): Ontology = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], datastores = datastores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ontology]
  }
  
  @scala.inline
  implicit class OntologyMutableBuilder[Self <: Ontology] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: js.Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastores(value: js.Any): Self = StObject.set(x, "datastores", value.asInstanceOf[js.Any])
  }
}
