package typings.tabris

import typings.std.Document_
import typings.std.Navigator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window_ extends js.Object {
  var cordova: Cordova_
  var document: Document_
  var navigator: Navigator_
  var plugins: CordovaPlugins
  var window: Window_
}

object Window_ {
  @scala.inline
  def apply(
    cordova: Cordova_,
    document: Document_,
    navigator: Navigator_,
    plugins: CordovaPlugins,
    window: Window_
  ): Window_ = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_]
  }
}

