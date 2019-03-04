package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferenceHelper extends js.Object {
  def getPreferences(): PreferenceHelper
}

object PreferenceHelper {
  @scala.inline
  def apply(getPreferences: js.Function0[PreferenceHelper]): PreferenceHelper = {
    val __obj = js.Dynamic.literal(getPreferences = getPreferences)
  
    __obj.asInstanceOf[PreferenceHelper]
  }
}

