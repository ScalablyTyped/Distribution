package typings.winrt

import typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: HotspotAuthenticationContext
  var isValid: Boolean
}

object Anon_Context {
  @scala.inline
  def apply(context: HotspotAuthenticationContext, isValid: Boolean): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, isValid = isValid)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

