package typings.svgSprite

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugins extends js.Object {
  var plugins: js.UndefOr[js.Array[StringDictionary[Boolean]]] = js.undefined
}

object AnonPlugins {
  @scala.inline
  def apply(plugins: js.Array[StringDictionary[Boolean]] = null): AnonPlugins = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlugins]
  }
}

