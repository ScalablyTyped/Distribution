package typings.tslint.objectLiteralShorthandRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var enforceShorthandMethods: Boolean
  var enforceShorthandProperties: Boolean
}

object Options {
  @scala.inline
  def apply(enforceShorthandMethods: Boolean, enforceShorthandProperties: Boolean): Options = {
    val __obj = js.Dynamic.literal(enforceShorthandMethods = enforceShorthandMethods.asInstanceOf[js.Any], enforceShorthandProperties = enforceShorthandProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

