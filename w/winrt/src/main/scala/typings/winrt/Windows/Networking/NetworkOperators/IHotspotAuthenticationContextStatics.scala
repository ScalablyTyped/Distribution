package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationContextStatics extends js.Object {
  def tryGetAuthenticationContext(evenToken: String): Anon_Context
}

object IHotspotAuthenticationContextStatics {
  @scala.inline
  def apply(tryGetAuthenticationContext: String => Anon_Context): IHotspotAuthenticationContextStatics = {
    val __obj = js.Dynamic.literal(tryGetAuthenticationContext = js.Any.fromFunction1(tryGetAuthenticationContext))
  
    __obj.asInstanceOf[IHotspotAuthenticationContextStatics]
  }
}

