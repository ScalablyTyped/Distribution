package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    *  The value of navigator.appName
    */
  var appName: String
  /**
    *  The value of navigator.connection
    */
  var connection: js.UndefOr[Connection] = js.undefined
  /**
    *  The value of navigator.cpuClass
    */
  var cpuClass: js.UndefOr[String] = js.undefined
  /**
    * One of desktop, mobile, or tablet depending on the type of device
    */
  var deviceCategory: js.UndefOr[String] = js.undefined
  /**
    *  The value of navigator.oscpu
    */
  var oscpu: js.UndefOr[String] = js.undefined
  /**
    * The value of navigator.platform
    */
  var platform: String
  /**
    * The value of navigator.plugins.length
    */
  var pluginsLength: Double
  /**
    *  The value of screen.height
    */
  var screenHeight: Double
  /**
    * The value of screen.width
    */
  var screenWidth: Double
  /**
    * The value of navigator.userAgent
    */
  var userAgent: String
  /**
    * The value of navigator.vendor
    */
  var vendor: String
  /**
    * The value of window.innerHeight
    */
  var viewportHeight: Double
  /**
    * The value of window.innerWidth
    */
  var viewportWidth: Double
}

object Data {
  @scala.inline
  def apply(
    appName: String,
    platform: String,
    pluginsLength: Double,
    screenHeight: Double,
    screenWidth: Double,
    userAgent: String,
    vendor: String,
    viewportHeight: Double,
    viewportWidth: Double,
    connection: Connection = null,
    cpuClass: String = null,
    deviceCategory: String = null,
    oscpu: String = null
  ): Data = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pluginsLength = pluginsLength.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (cpuClass != null) __obj.updateDynamic("cpuClass")(cpuClass.asInstanceOf[js.Any])
    if (deviceCategory != null) __obj.updateDynamic("deviceCategory")(deviceCategory.asInstanceOf[js.Any])
    if (oscpu != null) __obj.updateDynamic("oscpu")(oscpu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

