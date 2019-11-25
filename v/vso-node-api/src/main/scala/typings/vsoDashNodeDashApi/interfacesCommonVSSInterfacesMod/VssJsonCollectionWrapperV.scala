package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VssJsonCollectionWrapperV[T] extends VssJsonCollectionWrapperBase {
  var value: T
}

object VssJsonCollectionWrapperV {
  @scala.inline
  def apply[T](count: Double, value: T): VssJsonCollectionWrapperV[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VssJsonCollectionWrapperV[T]]
  }
}

