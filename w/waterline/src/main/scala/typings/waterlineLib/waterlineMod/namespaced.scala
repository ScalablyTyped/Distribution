package typings
package waterlineLib.waterlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("waterline", JSImport.Namespace)
@js.native
class namespaced ()
  extends waterlineLib.waterlineMod.WaterlineNs.Waterline {
  /* CompleteClass */
  override var collections: js.Any = js.native
  /* CompleteClass */
  override def initialize(
    config: waterlineLib.waterlineMod.WaterlineNs.Config,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* ontology */ waterlineLib.waterlineMod.WaterlineNs.Ontology, 
      _
    ]
  ): js.Any = js.native
  /* CompleteClass */
  override def loadCollection(collection: waterlineLib.waterlineMod.WaterlineNs.CollectionClass): scala.Unit = js.native
}

