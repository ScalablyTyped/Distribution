package typings
package tslintLib.libLanguageUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqualsKind extends js.Object {
  var isPositive: scala.Boolean
  var isStrict: scala.Boolean
}

object EqualsKind {
  @scala.inline
  def apply(isPositive: scala.Boolean, isStrict: scala.Boolean): EqualsKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPositive")(isPositive)
    __obj.updateDynamic("isStrict")(isStrict)
    __obj.asInstanceOf[EqualsKind]
  }
}

