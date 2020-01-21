package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObject extends js.Object {
  var settings: Setting
}

object SettingsObject {
  @scala.inline
  def apply(settings: Setting): SettingsObject = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SettingsObject]
  }
}

