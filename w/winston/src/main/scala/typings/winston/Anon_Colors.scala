package typings.winston

import typings.winston.libWinstonConfigMod.CliConfigSetColors
import typings.winston.libWinstonConfigMod.CliConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: CliConfigSetColors
  var levels: CliConfigSetLevels
}

object Anon_Colors {
  @scala.inline
  def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

