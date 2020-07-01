package typings.waterline.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waterline extends js.Object {
  var collections: js.Any
  def initialize(config: Config, cb: js.Function2[/* err */ Error, /* ontology */ Ontology, _]): js.Any
  def loadCollection(collection: CollectionClass): Unit
  def registerModel(collection: CollectionClass): Unit
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
}

