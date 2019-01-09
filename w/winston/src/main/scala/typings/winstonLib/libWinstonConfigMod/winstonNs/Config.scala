package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: winstonLib.Anon_Colors
  var npm: winstonLib.Anon_ColorsLevels
  var syslog: winstonLib.Anon_ColorsLevelsSyslogConfigSetColors
  def addColors(colors: AbstractConfigSetColors): scala.Unit
}

