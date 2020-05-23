package typings.typeCheck.TypeCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var customTypes: CustomType
}

object Options {
  @scala.inline
  def apply(customTypes: CustomType): Options = {
    val __obj = js.Dynamic.literal(customTypes = customTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

