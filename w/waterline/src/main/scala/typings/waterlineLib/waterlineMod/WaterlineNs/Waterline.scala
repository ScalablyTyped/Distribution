package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waterline extends js.Object {
  var collections: js.Any
  def initialize(config: Config, cb: js.Function2[/* err */ nodeLib.Error, /* ontology */ Ontology, _]): js.Any
  def loadCollection(collection: CollectionClass): scala.Unit
}

