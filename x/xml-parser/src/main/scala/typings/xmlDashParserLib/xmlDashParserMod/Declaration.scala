package typings
package xmlDashParserLib.xmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends js.Object {
  var attributes: Attributes
}

object Declaration {
  @scala.inline
  def apply(attributes: Attributes): Declaration = {
    val __obj = js.Dynamic.literal(attributes = attributes)
  
    __obj.asInstanceOf[Declaration]
  }
}

