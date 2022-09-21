package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.disposableMod.Disposable
import typings.vscodeLanguageserver.serverMod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import typings.vscodeLanguageserverTypes.mod.CallHierarchyItem
import typings.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnIncomingCalls extends StObject {
  
  def onIncomingCalls(
    handler: ServerRequestHandler[
      CallHierarchyIncomingCallsParams, 
      js.Array[CallHierarchyIncomingCall] | Null, 
      js.Array[CallHierarchyIncomingCall], 
      Unit
    ]
  ): Disposable
  
  def onOutgoingCalls(
    handler: ServerRequestHandler[
      CallHierarchyOutgoingCallsParams, 
      js.Array[CallHierarchyOutgoingCall] | Null, 
      js.Array[CallHierarchyOutgoingCall], 
      Unit
    ]
  ): Disposable
  
  def onPrepare(
    handler: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit]
  ): Disposable
}
object OnIncomingCalls {
  
  inline def apply(
    onIncomingCalls: ServerRequestHandler[
      CallHierarchyIncomingCallsParams, 
      js.Array[CallHierarchyIncomingCall] | Null, 
      js.Array[CallHierarchyIncomingCall], 
      Unit
    ] => Disposable,
    onOutgoingCalls: ServerRequestHandler[
      CallHierarchyOutgoingCallsParams, 
      js.Array[CallHierarchyOutgoingCall] | Null, 
      js.Array[CallHierarchyOutgoingCall], 
      Unit
    ] => Disposable,
    onPrepare: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Disposable
  ): OnIncomingCalls = {
    val __obj = js.Dynamic.literal(onIncomingCalls = js.Any.fromFunction1(onIncomingCalls), onOutgoingCalls = js.Any.fromFunction1(onOutgoingCalls), onPrepare = js.Any.fromFunction1(onPrepare))
    __obj.asInstanceOf[OnIncomingCalls]
  }
  
  extension [Self <: OnIncomingCalls](x: Self) {
    
    inline def setOnIncomingCalls(
      value: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onIncomingCalls", js.Any.fromFunction1(value))
    
    inline def setOnOutgoingCalls(
      value: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onOutgoingCalls", js.Any.fromFunction1(value))
    
    inline def setOnPrepare(
      value: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Disposable
    ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction1(value))
  }
}
