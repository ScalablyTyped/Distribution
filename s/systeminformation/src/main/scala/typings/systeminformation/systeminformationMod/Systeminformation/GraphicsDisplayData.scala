package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsDisplayData extends js.Object {
  var builtin: Boolean
  var connection: String
  var currentRefreshRate: Double
  var currentResX: Double
  var currentResY: Double
  var main: Boolean
  var model: String
  var pixeldepth: Double
  var positionX: Double
  var positionY: Double
  var resolutionx: Double
  var resolutiony: Double
  var sizex: Double
  var sizey: Double
  var vendor: String
}

object GraphicsDisplayData {
  @scala.inline
  def apply(
    builtin: Boolean,
    connection: String,
    currentRefreshRate: Double,
    currentResX: Double,
    currentResY: Double,
    main: Boolean,
    model: String,
    pixeldepth: Double,
    positionX: Double,
    positionY: Double,
    resolutionx: Double,
    resolutiony: Double,
    sizex: Double,
    sizey: Double,
    vendor: String
  ): GraphicsDisplayData = {
    val __obj = js.Dynamic.literal(builtin = builtin, connection = connection, currentRefreshRate = currentRefreshRate, currentResX = currentResX, currentResY = currentResY, main = main, model = model, pixeldepth = pixeldepth, positionX = positionX, positionY = positionY, resolutionx = resolutionx, resolutiony = resolutiony, sizex = sizex, sizey = sizey, vendor = vendor)
  
    __obj.asInstanceOf[GraphicsDisplayData]
  }
}

