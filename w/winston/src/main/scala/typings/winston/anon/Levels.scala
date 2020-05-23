package typings.winston.anon

import typings.winston.configMod.NpmConfigSetColors
import typings.winston.configMod.NpmConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levels extends js.Object {
  var colors: NpmConfigSetColors
  var levels: NpmConfigSetLevels
}

object Levels {
  @scala.inline
  def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
}

