package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additional extends js.Object {
  var additional: js.Array[java.lang.String]
  var minimum: js.Array[java.lang.String]
}

object Anon_Additional {
  @scala.inline
  def apply(additional: js.Array[java.lang.String], minimum: js.Array[java.lang.String]): Anon_Additional = {
    val __obj = js.Dynamic.literal(additional = additional, minimum = minimum)
  
    __obj.asInstanceOf[Anon_Additional]
  }
}

