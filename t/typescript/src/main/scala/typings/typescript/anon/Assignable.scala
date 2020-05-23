package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignable extends js.Object {
  var assignable: Double
  var identity: Double
  var strictSubtype: Double
  var subtype: Double
}

object Assignable {
  @scala.inline
  def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): Assignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignable]
  }
}

