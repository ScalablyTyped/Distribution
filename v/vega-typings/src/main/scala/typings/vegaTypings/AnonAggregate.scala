package typings.vegaTypings

import typings.vegaTypings.markMod.Facet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregate extends Facet {
  var aggregate: js.UndefOr[AnonAs] = js.undefined
  var data: String
  var groupby: String | js.Array[String]
  var name: String
}

object AnonAggregate {
  @scala.inline
  def apply(data: String, groupby: String | js.Array[String], name: String, aggregate: AnonAs = null): AnonAggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregate]
  }
}

