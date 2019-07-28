package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feature extends js.Object {
  var feature: js.UndefOr[String] = js.undefined
  var mesh: js.UndefOr[String] = js.undefined
  var parse: js.UndefOr[String | js.Object] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Feature {
  @scala.inline
  def apply(
    feature: String = null,
    mesh: String = null,
    parse: String | js.Object = null,
    property: String = null,
    `type`: String = null
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

