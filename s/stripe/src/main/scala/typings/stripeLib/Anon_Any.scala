package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  /**
    * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based on risk level and other requirements. However, if you wish to request 3D Secure based on
    * logic from your own fraud engine, provide this option. Permitted values include: automatic, any, or challenge_only. If not provided, defaults to automatic.
    */
  var request_three_d_secure: js.UndefOr[
    stripeLib.stripeLibStrings.automatic | stripeLib.stripeLibStrings.challenge_only | stripeLib.stripeLibStrings.any
  ] = js.undefined
}

object Anon_Any {
  @scala.inline
  def apply(
    request_three_d_secure: stripeLib.stripeLibStrings.automatic | stripeLib.stripeLibStrings.challenge_only | stripeLib.stripeLibStrings.any = null
  ): Anon_Any = {
    val __obj = js.Dynamic.literal()
    if (request_three_d_secure != null) __obj.updateDynamic("request_three_d_secure")(request_three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Any]
  }
}

