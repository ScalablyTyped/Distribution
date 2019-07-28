package typings.waterline

import typings.waterline.waterlineMod.CollectionClass
import typings.waterline.waterlineMod.CollectionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  def extend(params: CollectionDefinition): CollectionClass
}

object Anon_Extend {
  @scala.inline
  def apply(extend: CollectionDefinition => CollectionClass): Anon_Extend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
  
    __obj.asInstanceOf[Anon_Extend]
  }
}

