package typings.wdioLogger

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wdio/logger/build/web", JSImport.Namespace)
@js.native
object webMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(component: String): Console = js.native
    
    var clearLogger: js.Function0[Unit] = js.native
    
    var setLevel: js.Function0[Unit] = js.native
    
    var setLogLevelsConfig: js.Function0[Unit] = js.native
    
    var waitForBuffer: js.Function0[Unit] = js.native
  }
}
