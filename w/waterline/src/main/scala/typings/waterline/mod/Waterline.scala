package typings.waterline.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waterline extends StObject {
  
  var collections: js.Any
  
  def initialize(config: Config, cb: js.Function2[/* err */ Error, /* ontology */ Ontology, js.Any]): js.Any
  
  def loadCollection(collection: CollectionClass): Unit
  
  def registerModel(collection: CollectionClass): Unit
}
object Waterline {
  
  inline def apply(
    collections: js.Any,
    initialize: (Config, js.Function2[/* err */ Error, /* ontology */ Ontology, js.Any]) => js.Any,
    loadCollection: CollectionClass => Unit,
    registerModel: CollectionClass => Unit
  ): Waterline = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], initialize = js.Any.fromFunction2(initialize), loadCollection = js.Any.fromFunction1(loadCollection), registerModel = js.Any.fromFunction1(registerModel))
    __obj.asInstanceOf[Waterline]
  }
  
  extension [Self <: Waterline](x: Self) {
    
    inline def setCollections(value: js.Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: (Config, js.Function2[/* err */ Error, /* ontology */ Ontology, js.Any]) => js.Any): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setLoadCollection(value: CollectionClass => Unit): Self = StObject.set(x, "loadCollection", js.Any.fromFunction1(value))
    
    inline def setRegisterModel(value: CollectionClass => Unit): Self = StObject.set(x, "registerModel", js.Any.fromFunction1(value))
  }
}
