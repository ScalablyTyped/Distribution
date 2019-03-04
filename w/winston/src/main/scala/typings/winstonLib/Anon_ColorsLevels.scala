package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevels extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.winstonNs.NpmConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.winstonNs.NpmConfigSetLevels
}

object Anon_ColorsLevels {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.winstonNs.NpmConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.winstonNs.NpmConfigSetLevels
  ): Anon_ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_ColorsLevels]
  }
}

