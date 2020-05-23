package typings.winrt.anon

import typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: HotspotAuthenticationContext
  var isValid: Boolean
}

object Context {
  @scala.inline
  def apply(context: HotspotAuthenticationContext, isValid: Boolean): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

