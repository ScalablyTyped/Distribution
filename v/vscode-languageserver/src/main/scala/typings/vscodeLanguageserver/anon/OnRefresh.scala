package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueParams
import typings.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRefresh extends StObject {
  
  /**
    * Installs a handler for the inline values request.
    *
    * @param handler The corresponding handler.
    */
  def on(
    handler: ServerRequestHandler[
      InlineValueParams, 
      js.UndefOr[js.Array[InlineValue] | Null], 
      js.Array[InlineValue], 
      Unit
    ]
  ): Disposable
  
  /**
    * Ask the client to refresh all inline values.
    */
  def refresh(): js.Promise[Unit]
}
object OnRefresh {
  
  inline def apply(
    on: ServerRequestHandler[
      InlineValueParams, 
      js.UndefOr[js.Array[InlineValue] | Null], 
      js.Array[InlineValue], 
      Unit
    ] => Disposable,
    refresh: () => js.Promise[Unit]
  ): OnRefresh = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[OnRefresh]
  }
  
  extension [Self <: OnRefresh](x: Self) {
    
    inline def setOn(
      value: ServerRequestHandler[
          InlineValueParams, 
          js.UndefOr[js.Array[InlineValue] | Null], 
          js.Array[InlineValue], 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => js.Promise[Unit]): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
