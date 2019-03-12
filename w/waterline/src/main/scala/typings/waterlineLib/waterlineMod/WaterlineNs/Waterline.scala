package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waterline extends js.Object {
  var collections: js.Any
  def initialize(config: Config, cb: js.Function2[/* err */ stdLib.Error, /* ontology */ Ontology, _]): js.Any
  def loadCollection(collection: CollectionClass): scala.Unit
}

object Waterline {
  @scala.inline
  def apply(
    collections: js.Any,
    initialize: (Config, js.Function2[/* err */ stdLib.Error, /* ontology */ Ontology, _]) => js.Any,
    loadCollection: CollectionClass => scala.Unit
  ): Waterline = {
    val __obj = js.Dynamic.literal(collections = collections, initialize = js.Any.fromFunction2(initialize), loadCollection = js.Any.fromFunction1(loadCollection))
  
    __obj.asInstanceOf[Waterline]
  }
}

