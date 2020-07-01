package typings.waterline.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("waterline", JSImport.Namespace)
@js.native
class ^ () extends Waterline {
  /* CompleteClass */
  override var collections: js.Any = js.native
  /* CompleteClass */
  override def initialize(config: Config, cb: js.Function2[/* err */ Error, /* ontology */ Ontology, _]): js.Any = js.native
  /* CompleteClass */
  override def loadCollection(collection: CollectionClass): Unit = js.native
  /* CompleteClass */
  override def registerModel(collection: CollectionClass): Unit = js.native
}

@JSImport("waterline", JSImport.Namespace)
@js.native
object ^ extends TopLevel[WaterlineStatic]

