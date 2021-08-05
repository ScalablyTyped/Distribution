package typings.wixUiCore

import typings.wixUiCore.typesMod.Address
import typings.wixUiCore.typesMod.Geocode
import typings.wixUiCore.typesMod.InternalAddress
import typings.wixUiCore.typesMod.PlaceDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputTestHelperMod {
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "ADDRESS_1")
  @js.native
  val ADDRESS_1: Address = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "ADDRESS_2")
  @js.native
  val ADDRESS_2: Address = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "ADDRESS_DESC_1")
  @js.native
  val ADDRESS_DESC_1: /* "1 East Broadway, New York, NY, USA" */ String = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "ADDRESS_DESC_2")
  @js.native
  val ADDRESS_DESC_2: /* "114 N 6th St, Brooklyn, NY 11249, USA" */ String = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "API_KEY")
  @js.native
  val API_KEY: /* "api-key" */ String = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "GEOCODE_1")
  @js.native
  val GEOCODE_1: Geocode = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "GEOCODE_2")
  @js.native
  val GEOCODE_2: Geocode = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "INTERNAL_ADDRESS_GEOCODE_1")
  @js.native
  val INTERNAL_ADDRESS_GEOCODE_1: InternalAddress = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "INTERNAL_ADDRESS_GEOCODE_2")
  @js.native
  val INTERNAL_ADDRESS_GEOCODE_2: InternalAddress = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "INTERNAL_ADDRESS_PLACE_DETAILS_1")
  @js.native
  val INTERNAL_ADDRESS_PLACE_DETAILS_1: InternalAddress = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "INTERNAL_ADDRESS_PLACE_DETAILS_2")
  @js.native
  val INTERNAL_ADDRESS_PLACE_DETAILS_2: InternalAddress = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "PLACE_DETAILS_1")
  @js.native
  val PLACE_DETAILS_1: PlaceDetails = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInputTestHelper", "PLACE_DETAILS_2")
  @js.native
  val PLACE_DETAILS_2: PlaceDetails = js.native
  
  inline def getOptionsText(driver: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsText")(driver.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def waitForSingleOption(option: js.Any, driver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForSingleOption")(option.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
