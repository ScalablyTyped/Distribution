package typings.waterline.anon

import typings.waterline.mod.CollectionClass
import typings.waterline.mod.CollectionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  def extend(params: CollectionDefinition): CollectionClass
}

object Extend {
  @scala.inline
  def apply(extend: CollectionDefinition => CollectionClass): Extend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[Extend]
  }
}

