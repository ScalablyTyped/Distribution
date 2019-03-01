package typings
package tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabris.js interfaces
trait EventObject[T] extends js.Object {
  val target: T
  val timeStamp: scala.Double
  val `type`: java.lang.String
}

object EventObject {
  @scala.inline
  def apply[T](target: T, timeStamp: scala.Double, `type`: java.lang.String): EventObject[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[EventObject[T]]
  }
}

