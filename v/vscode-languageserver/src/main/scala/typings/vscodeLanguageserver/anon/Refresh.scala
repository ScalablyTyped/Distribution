package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotinlayHintMod.InlayHintParams
import typings.vscodeLanguageserverTypes.mod.InlayHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refresh extends StObject {
  
  /**
    * Installs a handler for the inlay hints request.
    *
    * @param handler The corresponding handler.
    */
  def on(
    handler: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit]
  ): Disposable
  
  /**
    * Ask the client to refresh all inlay hints.
    */
  def refresh(): js.Promise[Unit]
  
  /**
    * Installs a handler for the inlay hint resolve request.
    *
    * @param handler The corresponding handler.
    */
  def resolve(handler: RequestHandler[InlayHint, InlayHint, Unit]): Disposable
}
object Refresh {
  
  inline def apply(
    on: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit] => Disposable,
    refresh: () => js.Promise[Unit],
    resolve: RequestHandler[InlayHint, InlayHint, Unit] => Disposable
  ): Refresh = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), refresh = js.Any.fromFunction0(refresh), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Refresh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refresh] (val x: Self) extends AnyVal {
    
    inline def setOn(
      value: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => js.Promise[Unit]): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setResolve(value: RequestHandler[InlayHint, InlayHint, Unit] => Disposable): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
