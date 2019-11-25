package typings.winston

import typings.winston.libWinstonConfigMod.NpmConfigSetColors
import typings.winston.libWinstonConfigMod.NpmConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevels extends js.Object {
  var colors: NpmConfigSetColors
  var levels: NpmConfigSetLevels
}

object Anon_ColorsLevels {
  @scala.inline
  def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Anon_ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorsLevels]
  }
}

