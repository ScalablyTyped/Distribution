package typings
package tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedEvent[T, U] extends js.Object {
  val target: T
  val timeStamp: scala.Double
  val `type`: java.lang.String
  val value: U
}

object PropertyChangedEvent {
  @scala.inline
  def apply[T, U](target: T, timeStamp: scala.Double, `type`: java.lang.String, value: U): PropertyChangedEvent[T, U] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], timeStamp = timeStamp, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PropertyChangedEvent[T, U]]
  }
}

