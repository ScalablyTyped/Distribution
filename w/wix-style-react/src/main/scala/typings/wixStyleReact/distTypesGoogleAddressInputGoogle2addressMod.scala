package typings.wixStyleReact

import typings.wixStyleReact.anon.Approximate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleAddressInputGoogle2addressMod {
  
  @JSImport("wix-style-react/dist/types/GoogleAddressInput/google2address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def google2address(google: Any): Approximate = ^.asInstanceOf[js.Dynamic].applyDynamic("google2address")(google.asInstanceOf[js.Any]).asInstanceOf[Approximate]
  
  inline def includes(arr: Any, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def trySetStreetNumberIfNotReceived(google: Any, inputValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trySetStreetNumberIfNotReceived")(google.asInstanceOf[js.Any], inputValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
