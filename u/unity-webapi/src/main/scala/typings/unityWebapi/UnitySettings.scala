package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitySettings extends js.Object {
  var iconUrl: String
  var name: String
  var onInit: js.Function
}

object UnitySettings {
  @scala.inline
  def apply(iconUrl: String, name: String, onInit: js.Function): UnitySettings = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitySettings]
  }
}

