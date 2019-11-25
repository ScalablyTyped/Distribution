package typings.winrt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SucceededValue extends js.Object {
  var succeeded: Boolean
  var value: Double
}

object Anon_SucceededValue {
  @scala.inline
  def apply(succeeded: Boolean, value: Double): Anon_SucceededValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SucceededValue]
  }
}

