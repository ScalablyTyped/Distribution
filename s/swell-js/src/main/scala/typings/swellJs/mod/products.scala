package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object products {
  
  @JSImport("swell-js", "products")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(productId: String): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(productId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
  
  inline def list(input: Query): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
  inline def list(input: SearchQuery): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
  
  inline def variation(productId: String, options: CartOption): js.Promise[Product] = (^.asInstanceOf[js.Dynamic].applyDynamic("variation")(productId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Product]]
}
