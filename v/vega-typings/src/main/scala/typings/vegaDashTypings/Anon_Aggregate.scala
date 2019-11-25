package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecMarkMod.Facet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate extends Facet {
  var aggregate: js.UndefOr[Anon_As] = js.undefined
  var data: String
  var groupby: String | js.Array[String]
  var name: String
}

object Anon_Aggregate {
  @scala.inline
  def apply(data: String, groupby: String | js.Array[String], name: String, aggregate: Anon_As = null): Anon_Aggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aggregate]
  }
}

