package typings.vegaDashEmbed.vegaDashEmbedMod

import typings.vega.vegaMod.View
import typings.vegaDashTypings.typesSpecMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** The inut specification. */
  var spec: VisualizationSpec
  /** The compiled and patched Vega specification. */
  var vgSpec: Spec
  /** The Vega view. */
  var view: View
}

object Result {
  @scala.inline
  def apply(spec: VisualizationSpec, vgSpec: Spec, view: View): Result = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any], vgSpec = vgSpec, view = view)
  
    __obj.asInstanceOf[Result]
  }
}

