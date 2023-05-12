package typings.undici.mod

import typings.undici.typesDispatcherMod.Dispatcher.DispatchHandlers
import typings.undici.typesDispatcherMod.Dispatcher.DispatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("undici", "RedirectHandler")
@js.native
open class RedirectHandler protected ()
  extends typings.undici.typesHandlersMod.RedirectHandler {
  def this(
    dispatch: typings.undici.typesDispatcherMod.default,
    maxRedirections: Double,
    opts: DispatchOptions,
    handler: DispatchHandlers
  ) = this()
}
