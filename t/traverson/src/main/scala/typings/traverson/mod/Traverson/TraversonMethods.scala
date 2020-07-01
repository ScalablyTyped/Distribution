package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversonMethods extends js.Object {
  def errors(): TraversonMethods
  def from(uri: String): Builder
  def json(): Builder
  def jsonHal(): Builder
  def mediaTypes(): TraversonMethods
  def newRequest(): Builder
  def registerMediaType(name: String, handler: js.Any): TraversonMethods
}

object TraversonMethods {
  @scala.inline
  def apply(
    errors: () => TraversonMethods,
    from: String => Builder,
    json: () => Builder,
    jsonHal: () => Builder,
    mediaTypes: () => TraversonMethods,
    newRequest: () => Builder,
    registerMediaType: (String, js.Any) => TraversonMethods
  ): TraversonMethods = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction0(errors), from = js.Any.fromFunction1(from), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), mediaTypes = js.Any.fromFunction0(mediaTypes), newRequest = js.Any.fromFunction0(newRequest), registerMediaType = js.Any.fromFunction2(registerMediaType))
    __obj.asInstanceOf[TraversonMethods]
  }
}

