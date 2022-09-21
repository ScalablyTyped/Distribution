package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Waterline extends StObject {
  
  var collections: Any = js.native
  
  def initialize(config: Config, cb: js.Function2[/* err */ js.Error, /* ontology */ Ontology, Any]): Any = js.native
  
  def loadCollection(collection: CollectionClass): Unit = js.native
  
  def registerModel(collection: CollectionClass): Unit = js.native
  
  def teardown(): Unit = js.native
  def teardown(done: js.Function): Unit = js.native
}
