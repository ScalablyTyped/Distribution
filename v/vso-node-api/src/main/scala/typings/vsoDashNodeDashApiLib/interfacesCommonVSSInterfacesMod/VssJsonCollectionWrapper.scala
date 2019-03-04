package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VssJsonCollectionWrapper extends VssJsonCollectionWrapperBase {
  var value: js.Array[_]
}

object VssJsonCollectionWrapper {
  @scala.inline
  def apply(count: scala.Double, value: js.Array[_]): VssJsonCollectionWrapper = {
    val __obj = js.Dynamic.literal(count = count, value = value)
  
    __obj.asInstanceOf[VssJsonCollectionWrapper]
  }
}

