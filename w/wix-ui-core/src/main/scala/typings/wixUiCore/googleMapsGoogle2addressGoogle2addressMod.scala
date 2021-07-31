package typings.wixUiCore

import typings.wixUiCore.anon.Formatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsGoogle2addressGoogle2addressMod {
  
  @JSImport("wix-ui-core/src/clients/GoogleMaps/google2address/google2address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertToFullAddress(googleResponse: js.Any): Formatted = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToFullAddress")(googleResponse.asInstanceOf[js.Any]).asInstanceOf[Formatted]
  
  @scala.inline
  def convertToPartialAddress(googleResponse: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPartialAddress")(googleResponse.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def trySetStreetNumberIfNotReceived(google: js.Any, inputValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trySetStreetNumberIfNotReceived")(google.asInstanceOf[js.Any], inputValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
