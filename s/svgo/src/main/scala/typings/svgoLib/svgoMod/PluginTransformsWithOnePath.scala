package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginTransformsWithOnePath extends PluginConfig {
  var transformsWithOnePath: scala.Boolean | js.Object
}

object PluginTransformsWithOnePath {
  @scala.inline
  def apply(transformsWithOnePath: scala.Boolean | js.Object): PluginTransformsWithOnePath = {
    val __obj = js.Dynamic.literal(transformsWithOnePath = transformsWithOnePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginTransformsWithOnePath]
  }
}

