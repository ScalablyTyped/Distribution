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
    val __obj = js.Dynamic.literal(assignable = assignable, identity = identity, subtype = subtype)
  
    __obj.asInstanceOf[Anon_Assignable]
  }
}

