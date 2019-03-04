package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def uri(): urijsLib.uriNs.URI
}

object JQuery {
  @scala.inline
  def apply(uri: js.Function0[urijsLib.uriNs.URI]): JQuery = {
    val __obj = js.Dynamic.literal(uri = uri)
  
    __obj.asInstanceOf[JQuery]
  }
}

