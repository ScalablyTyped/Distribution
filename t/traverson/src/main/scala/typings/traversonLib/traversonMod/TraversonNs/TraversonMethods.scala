package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversonMethods extends js.Object {
  def from(uri: java.lang.String): Builder
  def registerMediaType(name: java.lang.String, handler: js.Any): TraversonMethods
}

object TraversonMethods {
  @scala.inline
  def apply(
    from: java.lang.String => Builder,
    registerMediaType: (java.lang.String, js.Any) => TraversonMethods
  ): TraversonMethods = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), registerMediaType = js.Any.fromFunction2(registerMediaType))
  
    __obj.asInstanceOf[TraversonMethods]
  }
}

