package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var connection: js.Any
  var result: js.Any
}

object AnonConnection {
  @scala.inline
  def apply(connection: js.Any, result: js.Any): AnonConnection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

