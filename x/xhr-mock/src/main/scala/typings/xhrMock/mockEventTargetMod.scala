package typings.xhrMock

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockEventTargetMod {
  
  @JSImport("xhr-mock/lib/MockEventTarget", JSImport.Default)
  @js.native
  class default () extends MockEventTarget
  
  @js.native
  trait MockEventTarget extends EventTarget {
    
    var listeners: js.Any = js.native
  }
}
