package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.Anon_As
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facet extends js.Object {
  var aggregate: js.UndefOr[Anon_As] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var groupby: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Facet {
  @scala.inline
  def apply(
    aggregate: Anon_As = null,
    data: String = null,
    field: String = null,
    groupby: String | js.Array[String] = null,
    name: String = null
  ): Facet = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (field != null) __obj.updateDynamic("field")(field)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Facet]
  }
}

