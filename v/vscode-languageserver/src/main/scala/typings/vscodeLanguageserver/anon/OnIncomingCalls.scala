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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnIncomingCalls extends js.Object {
  
  def onIncomingCalls(
    handler: ServerRequestHandler[
      CallHierarchyIncomingCallsParams, 
      js.Array[CallHierarchyIncomingCall] | Null, 
      js.Array[CallHierarchyIncomingCall], 
      Unit
    ]
  ): Unit = js.native
  
  def onOutgoingCalls(
    handler: ServerRequestHandler[
      CallHierarchyOutgoingCallsParams, 
      js.Array[CallHierarchyOutgoingCall] | Null, 
      js.Array[CallHierarchyOutgoingCall], 
      Unit
    ]
  ): Unit = js.native
  
  def onPrepare(
    handler: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit]
  ): Unit = js.native
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
  
  @scala.inline
  implicit class OnIncomingCallsOps[Self <: OnIncomingCalls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnIncomingCalls(
      value: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ] => Unit
    ): Self = this.set("onIncomingCalls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOutgoingCalls(
      value: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ] => Unit
    ): Self = this.set("onOutgoingCalls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPrepare(
      value: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
    ): Self = this.set("onPrepare", js.Any.fromFunction1(value))
  }
}
