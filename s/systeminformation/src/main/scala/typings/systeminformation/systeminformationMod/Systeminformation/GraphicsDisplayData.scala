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
    val __obj = js.Dynamic.literal(builtin = builtin.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], currentRefreshRate = currentRefreshRate.asInstanceOf[js.Any], currentResX = currentResX.asInstanceOf[js.Any], currentResY = currentResY.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixeldepth = pixeldepth.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], resolutionx = resolutionx.asInstanceOf[js.Any], resolutiony = resolutiony.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphicsDisplayData]
  }
}

