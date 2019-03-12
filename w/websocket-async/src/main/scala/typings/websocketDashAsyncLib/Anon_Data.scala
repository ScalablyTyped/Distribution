package typings
package websocketDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def reject(reason: js.Any): scala.Unit
  def resolve(data: js.Any): scala.Unit
}

object Anon_Data {
  @scala.inline
  def apply(reject: js.Any => scala.Unit, resolve: js.Any => scala.Unit): Anon_Data = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

