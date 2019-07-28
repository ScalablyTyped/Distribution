package typings.swaggerDashUiDashDist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeepLinking extends js.Object {
  var deepLinking: Boolean
  var dom_id: String
  var layout: String
  var plugins: js.Any
  var presets: js.Array[_]
  var urls: js.Array[js.Tuple2[String, String]]
}

object Anon_DeepLinking {
  @scala.inline
  def apply(
    deepLinking: Boolean,
    dom_id: String,
    layout: String,
    plugins: js.Any,
    presets: js.Array[_],
    urls: js.Array[js.Tuple2[String, String]]
  ): Anon_DeepLinking = {
    val __obj = js.Dynamic.literal(deepLinking = deepLinking, dom_id = dom_id, layout = layout, plugins = plugins, presets = presets, urls = urls)
  
    __obj.asInstanceOf[Anon_DeepLinking]
  }
}

