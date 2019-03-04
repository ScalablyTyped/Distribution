package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SucceededValue extends js.Object {
  var succeeded: scala.Boolean
  var value: scala.Double
}

object Anon_SucceededValue {
  @scala.inline
  def apply(succeeded: scala.Boolean, value: scala.Double): Anon_SucceededValue = {
    val __obj = js.Dynamic.literal(succeeded = succeeded, value = value)
  
    __obj.asInstanceOf[Anon_SucceededValue]
  }
}

