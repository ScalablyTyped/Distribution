package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginAddClassesToSVGElement extends PluginConfig {
  var addClassesToSVGElement: Boolean | js.Object
}

object PluginAddClassesToSVGElement {
  @scala.inline
  def apply(addClassesToSVGElement: Boolean | js.Object): PluginAddClassesToSVGElement = {
    val __obj = js.Dynamic.literal(addClassesToSVGElement = addClassesToSVGElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginAddClassesToSVGElement]
  }
}

