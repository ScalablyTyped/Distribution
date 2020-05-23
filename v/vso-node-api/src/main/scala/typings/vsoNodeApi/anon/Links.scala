package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  var all: scala.Double
  var fields: scala.Double
  var links: scala.Double
  var none: scala.Double
  var relations: scala.Double
}

object Links {
  @scala.inline
  def apply(
    all: scala.Double,
    fields: scala.Double,
    links: scala.Double,
    none: scala.Double,
    relations: scala.Double
  ): Links = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

