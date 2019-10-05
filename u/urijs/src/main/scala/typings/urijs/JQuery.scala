package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def uri(): typings.urijs.uri.URI
}

object JQuery {
  @scala.inline
  def apply(uri: () => typings.urijs.uri.URI): JQuery = {
    val __obj = js.Dynamic.literal(uri = js.Any.fromFunction0(uri))
  
    __obj.asInstanceOf[JQuery]
  }
}

