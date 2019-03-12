package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def computedStyleMap(): StylePropertyMapReadOnly
}

object Element {
  @scala.inline
  def apply(computedStyleMap: () => StylePropertyMapReadOnly): Element = {
    val __obj = js.Dynamic.literal(computedStyleMap = js.Any.fromFunction0(computedStyleMap))
  
    __obj.asInstanceOf[Element]
  }
}

