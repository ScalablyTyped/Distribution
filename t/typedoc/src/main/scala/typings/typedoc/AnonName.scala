package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName[K /* <: String */] extends js.Object {
  var name: K
}

object AnonName {
  @scala.inline
  def apply[K /* <: String */](name: K): AnonName[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName[K]]
  }
}

