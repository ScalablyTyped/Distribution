package typings
package swaggerDashUiDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeepLinking extends js.Object {
  var deepLinking: scala.Boolean
  var dom_id: java.lang.String
  var layout: java.lang.String
  var plugins: js.Any
  var presets: js.Array[_]
  var urls: js.Array[js.Tuple2[java.lang.String, java.lang.String]]
}

object Anon_DeepLinking {
  @scala.inline
  def apply(
    deepLinking: scala.Boolean,
    dom_id: java.lang.String,
    layout: java.lang.String,
    plugins: js.Any,
    presets: js.Array[_],
    urls: js.Array[js.Tuple2[java.lang.String, java.lang.String]]
  ): Anon_DeepLinking = {
    val __obj = js.Dynamic.literal(deepLinking = deepLinking, dom_id = dom_id, layout = layout, plugins = plugins, presets = presets, urls = urls)
  
    __obj.asInstanceOf[Anon_DeepLinking]
  }
}

