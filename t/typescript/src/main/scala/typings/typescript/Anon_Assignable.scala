package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assignable extends js.Object {
  var assignable: Double
  var identity: Double
  var subtype: Double
}

object Anon_Assignable {
  @scala.inline
  def apply(assignable: Double, identity: Double, subtype: Double): Anon_Assignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Assignable]
  }
}

