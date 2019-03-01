package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins extends js.Object {
  var plugins: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]] = js.undefined
}

object Anon_Plugins {
  @scala.inline
  def apply(plugins: js.Array[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = null): Anon_Plugins = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Anon_Plugins]
  }
}

