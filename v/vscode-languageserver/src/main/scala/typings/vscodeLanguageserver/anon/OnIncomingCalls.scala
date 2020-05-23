package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserver.mod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCall
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyItem
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCall
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyPrepareParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnIncomingCalls extends js.Object {
  def onIncomingCalls(
    handler: ServerRequestHandler[
      CallHierarchyIncomingCallsParams, 
      js.Array[CallHierarchyIncomingCall] | Null, 
      js.Array[CallHierarchyIncomingCall], 
      Unit
    ]
  ): Unit
  def onOutgoingCalls(
    handler: ServerRequestHandler[
      CallHierarchyOutgoingCallsParams, 
      js.Array[CallHierarchyOutgoingCall] | Null, 
      js.Array[CallHierarchyOutgoingCall], 
      Unit
    ]
  ): Unit
  def onPrepare(
    handler: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit]
  ): Unit
}

object OnIncomingCalls {
  @scala.inline
  def apply(
    onIncomingCalls: ServerRequestHandler[
      CallHierarchyIncomingCallsParams, 
      js.Array[CallHierarchyIncomingCall] | Null, 
      js.Array[CallHierarchyIncomingCall], 
      Unit
    ] => Unit,
    onOutgoingCalls: ServerRequestHandler[
      CallHierarchyOutgoingCallsParams, 
      js.Array[CallHierarchyOutgoingCall] | Null, 
      js.Array[CallHierarchyOutgoingCall], 
      Unit
    ] => Unit,
    onPrepare: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
  ): OnIncomingCalls = {
    val __obj = js.Dynamic.literal(onIncomingCalls = js.Any.fromFunction1(onIncomingCalls), onOutgoingCalls = js.Any.fromFunction1(onOutgoingCalls), onPrepare = js.Any.fromFunction1(onPrepare))
    __obj.asInstanceOf[OnIncomingCalls]
  }
}

