package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevels extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.NpmConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.NpmConfigSetLevels
}

object Anon_ColorsLevels {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.NpmConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.NpmConfigSetLevels
  ): Anon_ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_ColorsLevels]
  }
}

