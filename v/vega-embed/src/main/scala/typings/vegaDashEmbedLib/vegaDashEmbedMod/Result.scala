package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var spec: VisualizationSpec
  var view: vegaDashLibLib.vegaDashLibMod.View
}

object Result {
  @scala.inline
  def apply(spec: VisualizationSpec, view: vegaDashLibLib.vegaDashLibMod.View): Result = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any], view = view)
  
    __obj.asInstanceOf[Result]
  }
}

