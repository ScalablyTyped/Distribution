package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facet extends js.Object {
  var aggregate: js.UndefOr[vegaDashTypingsLib.Anon_As] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var groupby: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Facet {
  @scala.inline
  def apply(
    aggregate: vegaDashTypingsLib.Anon_As = null,
    data: java.lang.String = null,
    field: java.lang.String = null,
    groupby: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null
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

