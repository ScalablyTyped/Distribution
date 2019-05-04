package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feature extends js.Object {
  var feature: js.UndefOr[java.lang.String] = js.undefined
  var mesh: js.UndefOr[java.lang.String] = js.undefined
  var parse: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Feature {
  @scala.inline
  def apply(
    feature: java.lang.String = null,
    mesh: java.lang.String = null,
    parse: java.lang.String | js.Object = null,
    property: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Feature = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Feature]
  }
}

