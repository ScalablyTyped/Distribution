package typings.wixUiCore

import typings.wixUiCore.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsAddressInputMod {
  
  @JSImport("wix-ui-core/src/components/address-input", "AddressInput")
  @js.native
  class AddressInput protected ()
    extends typings.wixUiCore.srcComponentsAddressInputAddressInputMod.AddressInput {
    def this(props: js.Any) = this()
  }
  /* static members */
  object AddressInput {
    
    @JSImport("wix-ui-core/src/components/address-input", "AddressInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/address-input", "AddressInput.defaultProps")
    @js.native
    def defaultProps: Lang = js.native
    inline def defaultProps_=(x: Lang): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/address-input", "AddressInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
