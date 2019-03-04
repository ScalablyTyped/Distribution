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
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventObject[T]]
  }
}

