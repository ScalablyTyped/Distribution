package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VssJsonCollectionWrapper extends VssJsonCollectionWrapperBase {
  var value: js.Array[_]
}

object VssJsonCollectionWrapper {
  @scala.inline
  def apply(count: Double, value: js.Array[_]): VssJsonCollectionWrapper = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VssJsonCollectionWrapper]
  }
}

