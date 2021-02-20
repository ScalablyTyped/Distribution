package typings.waterline.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Waterline extends StObject {
  
  var collections: js.Any = js.native
  
  def initialize(config: Config, cb: js.Function2[/* err */ Error, /* ontology */ Ontology, _]): js.Any = js.native
  
  def loadCollection(collection: CollectionClass): Unit = js.native
  
  def registerModel(collection: CollectionClass): Unit = js.native
}
object Waterline {
  
  @scala.inline
  def apply(
    collections: js.Any,
    initialize: (Config, js.Function2[/* err */ Error, /* ontology */ Ontology, _]) => js.Any,
    loadCollection: CollectionClass => Unit,
    registerModel: CollectionClass => Unit
  ): Waterline = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], initialize = js.Any.fromFunction2(initialize), loadCollection = js.Any.fromFunction1(loadCollection), registerModel = js.Any.fromFunction1(registerModel))
    __obj.asInstanceOf[Waterline]
  }
  
  @scala.inline
  implicit class WaterlineMutableBuilder[Self <: Waterline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: js.Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialize(value: (Config, js.Function2[/* err */ Error, /* ontology */ Ontology, _]) => js.Any): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadCollection(value: CollectionClass => Unit): Self = StObject.set(x, "loadCollection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterModel(value: CollectionClass => Unit): Self = StObject.set(x, "registerModel", js.Any.fromFunction1(value))
  }
}
