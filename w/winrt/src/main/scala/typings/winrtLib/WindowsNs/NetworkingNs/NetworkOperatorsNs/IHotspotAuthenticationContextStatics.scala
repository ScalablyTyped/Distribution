package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContextStatics extends js.Object {
  def tryGetAuthenticationContext(evenToken: java.lang.String): winrtLib.Anon_Context
}

object IHotspotAuthenticationContextStatics {
  @scala.inline
  def apply(tryGetAuthenticationContext: js.Function1[java.lang.String, winrtLib.Anon_Context]): IHotspotAuthenticationContextStatics = {
    val __obj = js.Dynamic.literal(tryGetAuthenticationContext = tryGetAuthenticationContext)
  
    __obj.asInstanceOf[IHotspotAuthenticationContextStatics]
  }
}

