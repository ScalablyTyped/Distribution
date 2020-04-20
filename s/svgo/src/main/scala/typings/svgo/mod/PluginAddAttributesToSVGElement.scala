package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginAddAttributesToSVGElement extends PluginConfig {
  var addAttributesToSVGElement: Boolean | js.Object
}

object PluginAddAttributesToSVGElement {
  @scala.inline
  def apply(addAttributesToSVGElement: Boolean | js.Object): PluginAddAttributesToSVGElement = {
    val __obj = js.Dynamic.literal(addAttributesToSVGElement = addAttributesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddAttributesToSVGElement]
  }
}

