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
  def apply(reject: js.Function1[js.Any, scala.Unit], resolve: js.Function1[js.Any, scala.Unit]): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Anon_Data]
  }
}

