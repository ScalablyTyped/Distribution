package typings.waterline.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("waterline", JSImport.Namespace)
@js.native
class ^ ()
  extends StObject
     with Waterline {
  
  /* CompleteClass */
  var collections: js.Any = js.native
  
  /* CompleteClass */
  override def initialize(config: Config, cb: js.Function2[/* err */ Error, /* ontology */ Ontology, js.Any]): js.Any = js.native
  
  /* CompleteClass */
  override def loadCollection(collection: CollectionClass): Unit = js.native
  
  /* CompleteClass */
  override def registerModel(collection: CollectionClass): Unit = js.native
}
@JSImport("waterline", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[WaterlineStatic]
