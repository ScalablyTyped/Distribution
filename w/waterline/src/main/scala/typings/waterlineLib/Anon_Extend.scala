package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  def extend(params: waterlineLib.waterlineMod.CollectionDefinition): waterlineLib.waterlineMod.CollectionClass
}

object Anon_Extend {
  @scala.inline
  def apply(
    extend: waterlineLib.waterlineMod.CollectionDefinition => waterlineLib.waterlineMod.CollectionClass
  ): Anon_Extend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
  
    __obj.asInstanceOf[Anon_Extend]
  }
}

