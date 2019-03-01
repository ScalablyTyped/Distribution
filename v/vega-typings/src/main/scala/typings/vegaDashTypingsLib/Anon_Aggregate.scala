package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate
  extends vegaDashTypingsLib.typesSpecMarkMod.Facet {
  var aggregate: js.UndefOr[Anon_As] = js.undefined
  var data: java.lang.String
  var groupby: java.lang.String | js.Array[java.lang.String]
  var name: java.lang.String
}

object Anon_Aggregate {
  @scala.inline
  def apply(
    data: java.lang.String,
    groupby: java.lang.String | js.Array[java.lang.String],
    name: java.lang.String,
    aggregate: Anon_As = null
  ): Anon_Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    __obj.asInstanceOf[Anon_Aggregate]
  }
}

