package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSStyleRule extends js.Object {
  val styleMap: StylePropertyMap
}

object CSSStyleRule {
  @scala.inline
  def apply(styleMap: StylePropertyMap): CSSStyleRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("styleMap")(styleMap)
    __obj.asInstanceOf[CSSStyleRule]
  }
}

