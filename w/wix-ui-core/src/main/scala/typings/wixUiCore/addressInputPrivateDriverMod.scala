package typings.wixUiCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputPrivateDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/address-input/AddressInput.private.driver", "AddressInputPrivateDriver")
  @js.native
  class AddressInputPrivateDriver protected () extends StObject {
    def this(root: HTMLElement) = this()
    
    var root: HTMLElement = js.native
    
    def selectOption(index: js.Any): Unit = js.native
    
    def `type`(value: js.Any): Unit = js.native
    
    def value: String = js.native
    
    def waitForContentElement(): js.Any = js.native
    
    def waitForValue(value: js.Any): js.Any = js.native
  }
}
