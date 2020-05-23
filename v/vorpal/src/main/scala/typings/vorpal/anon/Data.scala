package typings.vorpal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  def data(): js.Promise[js.Array[java.lang.String]]
}

object Data {
  @scala.inline
  def apply(data: () => js.Promise[js.Array[java.lang.String]]): Data = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data))
    __obj.asInstanceOf[Data]
  }
}

