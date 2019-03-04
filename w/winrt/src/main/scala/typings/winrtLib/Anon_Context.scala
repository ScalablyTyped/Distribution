package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationContext
  var isValid: scala.Boolean
}

object Anon_Context {
  @scala.inline
  def apply(
    context: winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationContext,
    isValid: scala.Boolean
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, isValid = isValid)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

