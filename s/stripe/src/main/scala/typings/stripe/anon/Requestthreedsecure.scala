package typings.stripe.anon

import typings.stripe.stripeStrings.any
import typings.stripe.stripeStrings.automatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestthreedsecure extends StObject {
  
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
object Requestthreedsecure {
  
  inline def apply(): Requestthreedsecure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requestthreedsecure]
  }
  
  extension [Self <: Requestthreedsecure](x: Self) {
    
    inline def setRequest_three_d_secure(value: automatic | any): Self = StObject.set(x, "request_three_d_secure", value.asInstanceOf[js.Any])
    
    inline def setRequest_three_d_secureUndefined: Self = StObject.set(x, "request_three_d_secure", js.undefined)
  }
}
