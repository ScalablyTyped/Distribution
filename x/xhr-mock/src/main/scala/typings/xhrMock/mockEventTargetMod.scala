package typings.xhrMock

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/MockEventTarget", JSImport.Namespace)
@js.native
object mockEventTargetMod extends js.Object {
  
  @js.native
  trait MockEventTarget extends EventTarget {
    
    var listeners: js.Any = js.native
  }
  
  @js.native
  class default () extends MockEventTarget
}
