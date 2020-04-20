package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferenceHelper extends js.Object {
  def getPreferences(): PreferenceHelper
}

object PreferenceHelper {
  @scala.inline
  def apply(getPreferences: () => PreferenceHelper): PreferenceHelper = {
    val __obj = js.Dynamic.literal(getPreferences = js.Any.fromFunction0(getPreferences))
    __obj.asInstanceOf[PreferenceHelper]
  }
}

