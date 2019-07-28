package typings.stubby.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  def matches(request: StubbyRequest): StubbyRequest | Null
}

object Endpoint {
  @scala.inline
  def apply(matches: StubbyRequest => StubbyRequest | Null): Endpoint = {
    val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
  
    __obj.asInstanceOf[Endpoint]
  }
}

