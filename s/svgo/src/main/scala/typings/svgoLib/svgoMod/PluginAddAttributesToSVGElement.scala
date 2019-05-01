package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginAddAttributesToSVGElement extends PluginConfig {
  var addAttributesToSVGElement: scala.Boolean | js.Object
}

object PluginAddAttributesToSVGElement {
  @scala.inline
  def apply(addAttributesToSVGElement: scala.Boolean | js.Object): PluginAddAttributesToSVGElement = {
    val __obj = js.Dynamic.literal(addAttributesToSVGElement = addAttributesToSVGElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginAddAttributesToSVGElement]
  }
}

