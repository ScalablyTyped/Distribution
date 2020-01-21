package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllFields extends js.Object {
  var all: Double
  var fields: Double
  var links: Double
  var none: Double
  var relations: Double
}

object AnonAllFields {
  @scala.inline
  def apply(all: Double, fields: Double, links: Double, none: Double, relations: Double): AnonAllFields = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllFields]
  }
}

