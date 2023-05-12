package typings.undici

import typings.undici.typesDispatcherMod.Dispatcher.DispatchHandlers
import typings.undici.typesDispatcherMod.Dispatcher.DispatchOptions
import typings.undici.typesDispatcherMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHandlersMod {
  
  @JSImport("undici/types/handlers", "DecoratorHandler")
  @js.native
  open class DecoratorHandler protected ()
    extends StObject
       with DispatchHandlers {
    def this(handler: DispatchHandlers) = this()
  }
  
  @JSImport("undici/types/handlers", "RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends StObject
       with DispatchHandlers {
    def this(dispatch: default, maxRedirections: Double, opts: DispatchOptions, handler: DispatchHandlers) = this()
  }
}
