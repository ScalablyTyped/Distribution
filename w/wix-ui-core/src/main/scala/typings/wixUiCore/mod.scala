package typings.wixUiCore

import typings.wixUiCore.anon.ConverterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wix-ui-core/address-input", "AddressInput")
  @js.native
  class AddressInput protected ()
    extends typings.wixUiCore.addressInputMod.AddressInput {
    def this(props: js.Any) = this()
  }
  /* static members */
  object AddressInput {
    
    @JSImport("wix-ui-core/address-input", "AddressInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/address-input", "AddressInput.defaultProps")
    @js.native
    def defaultProps: ConverterType = js.native
    inline def defaultProps_=(x: ConverterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/address-input", "AddressInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
