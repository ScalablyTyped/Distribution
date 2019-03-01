package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorProvider extends js.Object {
  /**
    * Capabilities specific to the colorProvider
    */
  var colorProvider: js.UndefOr[Anon_DynamicRegistration] = js.undefined
}

object Anon_ColorProvider {
  @scala.inline
  def apply(colorProvider: Anon_DynamicRegistration = null): Anon_ColorProvider = {
    val __obj = js.Dynamic.literal()
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider)
    __obj.asInstanceOf[Anon_ColorProvider]
  }
}

