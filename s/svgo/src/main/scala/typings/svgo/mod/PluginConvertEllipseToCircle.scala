package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertEllipseToCircle extends PluginConfig {
  /** convert ellipse with equal radius measures to circle */
  var convertEllipseToCircle: Boolean | js.Object
}

object PluginConvertEllipseToCircle {
  @scala.inline
  def apply(convertEllipseToCircle: Boolean | js.Object): PluginConvertEllipseToCircle = {
    val __obj = js.Dynamic.literal(convertEllipseToCircle = convertEllipseToCircle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginConvertEllipseToCircle]
  }
}

