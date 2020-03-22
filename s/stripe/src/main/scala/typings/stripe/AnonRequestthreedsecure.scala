package typings.stripe

import typings.stripe.stripeStrings.any
import typings.stripe.stripeStrings.automatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestthreedsecure extends js.Object {
  /**
    * We strongly recommend that you rely on our SCA Engine to automatically prompt your
    * customers for authentication based on risk level and other requirements. However,
    * if you wish to request 3D Secure based on logic from your own fraud engine, provide
    * this option. Permitted values include: `automatic` or `any`. If not provided, defaults
    * to `automatic`. Read our guide on manually requesting 3D Secure for more information
    * on how this configuration interacts with Radar and our SCA Engine.
    */
  var request_three_d_secure: js.UndefOr[automatic | any] = js.undefined
}

object AnonRequestthreedsecure {
  @scala.inline
  def apply(request_three_d_secure: automatic | any = null): AnonRequestthreedsecure = {
    val __obj = js.Dynamic.literal()
    if (request_three_d_secure != null) __obj.updateDynamic("request_three_d_secure")(request_three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestthreedsecure]
  }
}

