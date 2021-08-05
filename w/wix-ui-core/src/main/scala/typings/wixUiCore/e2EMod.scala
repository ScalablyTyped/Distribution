package typings.wixUiCore

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object e2EMod {
  
  @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "AddressInputE2E")
  @js.native
  class AddressInputE2E protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    
    def fillStub(): Unit = js.native
    
    def handleOnSelect(value: js.Any): Unit = js.native
    
    def resetStub(): Unit = js.native
  }
  
  object DataHooks {
    
    @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "DataHooks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "DataHooks.fillStub")
    @js.native
    def fillStub: String = js.native
    inline def fillStub_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillStub")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "DataHooks.input")
    @js.native
    def input: String = js.native
    inline def input_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "DataHooks.latLng")
    @js.native
    def latLng: String = js.native
    inline def latLng_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("latLng")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/stories/AddressInput/E2E", "DataHooks.resetStub")
    @js.native
    def resetStub: String = js.native
    inline def resetStub_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetStub")(x.asInstanceOf[js.Any])
  }
}
