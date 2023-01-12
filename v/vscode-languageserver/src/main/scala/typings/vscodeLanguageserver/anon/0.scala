package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.Moniker
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.MonikerParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def on(handler: ServerRequestHandler[MonikerParams, js.Array[Moniker] | Null, js.Array[Moniker], Unit]): Disposable
}
object `0` {
  
  inline def apply(
    on: ServerRequestHandler[MonikerParams, js.Array[Moniker] | Null, js.Array[Moniker], Unit] => Disposable
  ): `0` = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setOn(
      value: ServerRequestHandler[MonikerParams, js.Array[Moniker] | Null, js.Array[Moniker], Unit] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
  }
}
