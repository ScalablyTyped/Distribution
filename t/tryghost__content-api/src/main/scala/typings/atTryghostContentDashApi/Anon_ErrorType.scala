package typings.atTryghostContentDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorType extends js.Object {
  var errorType: String
  var message: String
}

object Anon_ErrorType {
  @scala.inline
  def apply(errorType: String, message: String): Anon_ErrorType = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorType]
  }
}

