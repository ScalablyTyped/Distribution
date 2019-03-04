package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsDisplayInfo extends js.Object {
  var builtin: scala.Boolean
  var connection: java.lang.String
  var main: scala.Boolean
  var model: java.lang.String
  var pixeldepth: scala.Double
  var resolutionx: scala.Double
  var resolutiony: scala.Double
  var sizex: scala.Double
  var sizey: scala.Double
}

object GraphicsDisplayInfo {
  @scala.inline
  def apply(
    builtin: scala.Boolean,
    connection: java.lang.String,
    main: scala.Boolean,
    model: java.lang.String,
    pixeldepth: scala.Double,
    resolutionx: scala.Double,
    resolutiony: scala.Double,
    sizex: scala.Double,
    sizey: scala.Double
  ): GraphicsDisplayInfo = {
    val __obj = js.Dynamic.literal(builtin = builtin, connection = connection, main = main, model = model, pixeldepth = pixeldepth, resolutionx = resolutionx, resolutiony = resolutiony, sizex = sizex, sizey = sizey)
  
    __obj.asInstanceOf[GraphicsDisplayInfo]
  }
}

