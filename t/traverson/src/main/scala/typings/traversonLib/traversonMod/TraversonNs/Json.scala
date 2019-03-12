package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  def parseJson(): js.Any
}

object Json {
  @scala.inline
  def apply(parseJson: () => js.Any): Json = {
    val __obj = js.Dynamic.literal(parseJson = js.Any.fromFunction0(parseJson))
  
    __obj.asInstanceOf[Json]
  }
}

