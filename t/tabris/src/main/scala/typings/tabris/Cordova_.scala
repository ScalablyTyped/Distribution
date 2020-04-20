package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova_ extends js.Object {
  var plugins: CordovaPlugins
}

object Cordova_ {
  @scala.inline
  def apply(plugins: CordovaPlugins): Cordova_ = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova_]
  }
}

