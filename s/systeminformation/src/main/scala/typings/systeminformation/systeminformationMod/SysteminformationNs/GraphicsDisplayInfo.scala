package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsDisplayInfo extends js.Object {
  var builtin: Boolean
  var connection: String
  var main: Boolean
  var model: String
  var pixeldepth: Double
  var resolutionx: Double
  var resolutiony: Double
  var sizex: Double
  var sizey: Double
}

object GraphicsDisplayInfo {
  @scala.inline
  def apply(
    builtin: Boolean,
    connection: String,
    main: Boolean,
    model: String,
    pixeldepth: Double,
    resolutionx: Double,
    resolutiony: Double,
    sizex: Double,
    sizey: Double
  ): GraphicsDisplayInfo = {
    val __obj = js.Dynamic.literal(builtin = builtin, connection = connection, main = main, model = model, pixeldepth = pixeldepth, resolutionx = resolutionx, resolutiony = resolutiony, sizex = sizex, sizey = sizey)
  
    __obj.asInstanceOf[GraphicsDisplayInfo]
  }
}

