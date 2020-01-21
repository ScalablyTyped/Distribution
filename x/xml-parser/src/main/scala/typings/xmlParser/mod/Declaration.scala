package typings.xmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends js.Object {
  var attributes: Attributes
}

object Declaration {
  @scala.inline
  def apply(attributes: Attributes): Declaration = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Declaration]
  }
}

