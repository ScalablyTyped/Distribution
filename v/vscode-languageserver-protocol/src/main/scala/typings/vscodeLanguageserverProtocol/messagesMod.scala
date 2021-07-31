package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.messagesMod._EM
import typings.vscodeJsonrpc.mod.NotificationType
import typings.vscodeJsonrpc.mod.NotificationType0
import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeJsonrpc.mod.RequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("vscode-languageserver-protocol/lib/messages", "ProtocolNotificationType")
  @js.native
  class ProtocolNotificationType[P, RO] protected () extends NotificationType[P, RO] {
    def this(method: String) = this()
  }
  
  @JSImport("vscode-languageserver-protocol/lib/messages", "ProtocolNotificationType0")
  @js.native
  class ProtocolNotificationType0[RO] protected () extends NotificationType0[RO] {
    def this(method: String) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined __ */ @JSImport("vscode-languageserver-protocol/lib/messages", "ProtocolRequestType")
  @js.native
  class ProtocolRequestType[P, R, PR, E, RO] protected () extends RequestType[P, R, E, RO] {
    def this(method: String) = this()
    
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined __ */ @JSImport("vscode-languageserver-protocol/lib/messages", "ProtocolRequestType0")
  @js.native
  class ProtocolRequestType0[R, PR, E, RO] protected () extends RequestType0[R, E, RO] {
    def this(method: String) = this()
    
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
  }
}
