package typings.winston

import typings.winston.configMod.NpmConfigSetColors
import typings.winston.configMod.NpmConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevels extends js.Object {
  var colors: NpmConfigSetColors
  var levels: NpmConfigSetLevels
}

object AnonLevels {
  @scala.inline
  def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): AnonLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevels]
  }
}

