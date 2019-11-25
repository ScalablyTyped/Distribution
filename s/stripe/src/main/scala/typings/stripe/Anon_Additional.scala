package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additional extends js.Object {
  var additional: js.Array[String]
  var minimum: js.Array[String]
}

object Anon_Additional {
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): Anon_Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Additional]
  }
}

