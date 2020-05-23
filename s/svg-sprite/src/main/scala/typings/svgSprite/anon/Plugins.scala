package typings.svgSprite.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var plugins: js.UndefOr[js.Array[StringDictionary[Boolean]]] = js.undefined
}

object Plugins {
  @scala.inline
  def apply(plugins: js.Array[StringDictionary[Boolean]] = null): Plugins = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

