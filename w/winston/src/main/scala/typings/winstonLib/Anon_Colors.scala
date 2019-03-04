package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.winstonNs.CliConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.winstonNs.CliConfigSetLevels
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.winstonNs.CliConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.winstonNs.CliConfigSetLevels
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

