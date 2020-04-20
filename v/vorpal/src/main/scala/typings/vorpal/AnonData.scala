package typings.vorpal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  def data(): js.Promise[js.Array[String]]
}

object AnonData {
  @scala.inline
  def apply(data: () => js.Promise[js.Array[String]]): AnonData = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data))
    __obj.asInstanceOf[AnonData]
  }
}

