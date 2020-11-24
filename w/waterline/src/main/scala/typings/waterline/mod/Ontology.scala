package typings.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ontology extends js.Object {
  
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
  implicit class OntologyOps[Self <: Ontology] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollections(value: js.Any): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastores(value: js.Any): Self = this.set("datastores", value.asInstanceOf[js.Any])
  }
}
