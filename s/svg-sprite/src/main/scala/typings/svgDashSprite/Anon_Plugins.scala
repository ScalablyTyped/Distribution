package typings.svgDashSprite

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins extends js.Object {
  var plugins: js.UndefOr[js.Array[StringDictionary[Boolean]]] = js.undefined
}

object Anon_Plugins {
  @scala.inline
  def apply(plugins: js.Array[StringDictionary[Boolean]] = null): Anon_Plugins = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Plugins]
  }
}

