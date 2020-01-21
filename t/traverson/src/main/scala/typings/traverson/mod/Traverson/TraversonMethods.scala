package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversonMethods extends js.Object {
  def from(uri: String): Builder
  def registerMediaType(name: String, handler: js.Any): TraversonMethods
}

object TraversonMethods {
  @scala.inline
  def apply(from: String => Builder, registerMediaType: (String, js.Any) => TraversonMethods): TraversonMethods = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), registerMediaType = js.Any.fromFunction2(registerMediaType))
  
    __obj.asInstanceOf[TraversonMethods]
  }
}

