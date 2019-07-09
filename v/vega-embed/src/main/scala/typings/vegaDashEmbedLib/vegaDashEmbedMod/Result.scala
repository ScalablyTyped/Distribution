package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** The inut specification. */
  var spec: VisualizationSpec
  /** The compiled and patched Vega specification. */
  var vgSpec: vegaDashTypingsLib.typesSpecMod.Spec
  /** The Vega view. */
  var view: vegaLib.vegaMod.View
}

object Result {
  @scala.inline
  def apply(spec: VisualizationSpec, vgSpec: vegaDashTypingsLib.typesSpecMod.Spec, view: vegaLib.vegaMod.View): Result = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any], vgSpec = vgSpec, view = view)
  
    __obj.asInstanceOf[Result]
  }
}

