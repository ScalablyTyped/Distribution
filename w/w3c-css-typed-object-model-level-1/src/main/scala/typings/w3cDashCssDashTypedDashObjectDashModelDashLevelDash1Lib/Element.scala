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
  def apply(computedStyleMap: js.Function0[StylePropertyMapReadOnly]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computedStyleMap")(computedStyleMap)
    __obj.asInstanceOf[Element]
  }
}

