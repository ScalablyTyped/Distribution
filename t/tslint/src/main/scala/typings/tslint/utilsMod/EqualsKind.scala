package typings.tslint.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqualsKind extends js.Object {
  var isPositive: Boolean
  var isStrict: Boolean
}

object EqualsKind {
  @scala.inline
  def apply(isPositive: Boolean, isStrict: Boolean): EqualsKind = {
    val __obj = js.Dynamic.literal(isPositive = isPositive.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EqualsKind]
  }
}

