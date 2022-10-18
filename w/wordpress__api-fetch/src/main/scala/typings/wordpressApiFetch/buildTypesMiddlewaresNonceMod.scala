package typings.wordpressApiFetch

import typings.wordpressApiFetch.anon.Nonce
import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMiddlewaresNonceMod {
  
  @JSImport("@wordpress/api-fetch/build-types/middlewares/nonce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {string} nonce
    * @return {import('../types').APIFetchMiddleware & { nonce: string }} A middleware to enhance a request with a nonce.
    */
  inline def default(nonce: String): APIFetchMiddleware & Nonce = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nonce.asInstanceOf[js.Any]).asInstanceOf[APIFetchMiddleware & Nonce]
}
