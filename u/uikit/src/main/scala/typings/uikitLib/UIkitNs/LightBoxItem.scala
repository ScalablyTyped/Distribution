package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightBoxItem extends js.Object {
  var source: java.lang.String
  var `type`: java.lang.String
}

object LightBoxItem {
  @scala.inline
  def apply(source: java.lang.String, `type`: java.lang.String): LightBoxItem = {
    val __obj = js.Dynamic.literal(source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LightBoxItem]
  }
}

