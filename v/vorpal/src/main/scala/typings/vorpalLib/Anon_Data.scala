package typings
package vorpalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def data(): js.Promise[js.Array[java.lang.String]]
}

object Anon_Data {
  @scala.inline
  def apply(data: () => js.Promise[js.Array[java.lang.String]]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

