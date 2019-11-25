package typings.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisabledInterval extends js.Object {
  var endPosition: Double
  var startPosition: Double
}

object IDisabledInterval {
  @scala.inline
  def apply(endPosition: Double, startPosition: Double): IDisabledInterval = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDisabledInterval]
  }
}

