package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: js.Any
  var result: js.Any
}

object Connection {
  @scala.inline
  def apply(connection: js.Any, result: js.Any): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

