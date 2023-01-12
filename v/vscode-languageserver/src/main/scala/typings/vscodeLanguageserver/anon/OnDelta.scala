package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRangeParams
import typings.vscodeLanguageserverTypes.mod.SemanticTokens
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDelta extends StObject {
  
  def on(
    handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Disposable
  
  def onDelta(
    handler: ServerRequestHandler[
      SemanticTokensDeltaParams, 
      SemanticTokensDelta | SemanticTokens, 
      SemanticTokensDeltaPartialResult, 
      Unit
    ]
  ): Disposable
  
  def onRange(
    handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Disposable
  
  def refresh(): Unit
}
object OnDelta {
  
  inline def apply(
    on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable,
    onDelta: ServerRequestHandler[
      SemanticTokensDeltaParams, 
      SemanticTokensDelta | SemanticTokens, 
      SemanticTokensDeltaPartialResult, 
      Unit
    ] => Disposable,
    onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable,
    refresh: () => Unit
  ): OnDelta = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onDelta = js.Any.fromFunction1(onDelta), onRange = js.Any.fromFunction1(onRange), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[OnDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDelta] (val x: Self) extends AnyVal {
    
    inline def setOn(
      value: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setOnDelta(
      value: ServerRequestHandler[
          SemanticTokensDeltaParams, 
          SemanticTokensDelta | SemanticTokens, 
          SemanticTokensDeltaPartialResult, 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onDelta", js.Any.fromFunction1(value))
    
    inline def setOnRange(
      value: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable
    ): Self = StObject.set(x, "onRange", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
