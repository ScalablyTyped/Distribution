package typings
package atWordpressCoreDashDataLib.atWordpressCoreDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var baseURL: java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  var kind: java.lang.String
  var name: java.lang.String
  var plural: js.UndefOr[java.lang.String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    baseURL: java.lang.String,
    kind: java.lang.String,
    name: java.lang.String,
    key: java.lang.String = null,
    plural: java.lang.String = null
  ): Entity = {
    val __obj = js.Dynamic.literal(baseURL = baseURL, kind = kind, name = name)
    if (key != null) __obj.updateDynamic("key")(key)
    if (plural != null) __obj.updateDynamic("plural")(plural)
    __obj.asInstanceOf[Entity]
  }
}

