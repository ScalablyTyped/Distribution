package typings.typeDashCheck.TypeCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var customTypes: CustomType
}

object Options {
  @scala.inline
  def apply(customTypes: CustomType): Options = {
    val __obj = js.Dynamic.literal(customTypes = customTypes)
  
    __obj.asInstanceOf[Options]
  }
}

