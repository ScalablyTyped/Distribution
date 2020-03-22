package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressParams[T] extends js.Object {
  /**
    * The progress token provided by the client or server.
    */
  var token: ProgressToken
  /**
    * The progress data.
    */
  var value: T
}

object ProgressParams {
  @scala.inline
  def apply[T](token: ProgressToken, value: T): ProgressParams[T] = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressParams[T]]
  }
}

