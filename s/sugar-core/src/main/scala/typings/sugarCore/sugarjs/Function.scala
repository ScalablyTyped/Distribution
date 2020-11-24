package typings.sugarCore.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sugarjs.Function")
@js.native
object Function extends js.Object {
  
  @js.native
  trait ChainableBase[RawValue] extends js.Object {
    
    @JSName("apply")
    def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
    
    def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    
    def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    
    var raw: RawValue = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}
