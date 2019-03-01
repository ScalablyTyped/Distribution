package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VssJsonCollectionWrapperV[T] extends VssJsonCollectionWrapperBase {
  var value: T
}

object VssJsonCollectionWrapperV {
  @scala.inline
  def apply[T](count: scala.Double, value: T): VssJsonCollectionWrapperV[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperV[T]]
  }
}

