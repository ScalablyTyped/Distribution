package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.CliConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.CliConfigSetLevels
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.CliConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.CliConfigSetLevels
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

