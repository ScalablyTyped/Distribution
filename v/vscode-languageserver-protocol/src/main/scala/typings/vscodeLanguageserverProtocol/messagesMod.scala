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
  
  @js.native
  sealed trait MessageDirection extends StObject
  @JSImport("vscode-languageserver-protocol/lib/common/messages", "MessageDirection")
  @js.native
  object MessageDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageDirection & String] = js.native
    
    @js.native
    sealed trait both
      extends StObject
         with MessageDirection
    /* "both" */ val both: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.both & String = js.native
    
    @js.native
    sealed trait clientToServer
      extends StObject
         with MessageDirection
    /* "clientToServer" */ val clientToServer: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.clientToServer & String = js.native
    
    @js.native
    sealed trait serverToClient
      extends StObject
         with MessageDirection
    /* "serverToClient" */ val serverToClient: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.serverToClient & String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeLanguageserverProtocol.messagesMod.RegistrationType because Inheritance from two classes. Inlined ____ */ @JSImport("vscode-languageserver-protocol/lib/common/messages", "ProtocolNotificationType")
  @js.native
  open class ProtocolNotificationType[P, RO] protected () extends NotificationType[P] {
    def this(method: String) = this()
    
    /**
      * Clients must not use this property. It is here to ensure correct typing.
      */
    val ___ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
    
    val ____ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeLanguageserverProtocol.messagesMod.RegistrationType because Inheritance from two classes. Inlined ____ */ @JSImport("vscode-languageserver-protocol/lib/common/messages", "ProtocolNotificationType0")
  @js.native
  open class ProtocolNotificationType0[RO] protected () extends NotificationType0 {
    def this(method: String) = this()
    
    /**
      * Clients must not use this property. It is here to ensure correct typing.
      */
    val ___ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
    
    val ____ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeJsonrpc.connectionMod.ProgressType because Inheritance from two classes. Inlined _pr, __
  - typings.vscodeLanguageserverProtocol.messagesMod.RegistrationType because Inheritance from two classes. Inlined ____
  - typings.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined  */ @JSImport("vscode-languageserver-protocol/lib/common/messages", "ProtocolRequestType")
  @js.native
  open class ProtocolRequestType[P, R, PR, E, RO] protected () extends RequestType[P, R, E] {
    def this(method: String) = this()
    
    /**
      * Clients must not use these properties. They are here to ensure correct typing.
      * in TypeScript
      */
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
    
    /**
      * Clients must not use this property. It is here to ensure correct typing.
      */
    val ___ : js.UndefOr[js.Tuple3[PR, RO, _EM]] = js.native
    
    val ____ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
    
    val _pr: js.UndefOr[PR] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vscodeJsonrpc.connectionMod.ProgressType because Inheritance from two classes. Inlined _pr, __
  - typings.vscodeLanguageserverProtocol.messagesMod.RegistrationType because Inheritance from two classes. Inlined ____
  - typings.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined  */ @JSImport("vscode-languageserver-protocol/lib/common/messages", "ProtocolRequestType0")
  @js.native
  open class ProtocolRequestType0[R, PR, E, RO] protected () extends RequestType0[R, E] {
    def this(method: String) = this()
    
    /**
      * Clients must not use these properties. They are here to ensure correct typing.
      * in TypeScript
      */
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
    
    /**
      * Clients must not use these properties. They are here to ensure correct typing.
      * in TypeScript
      */
    val ___ : js.UndefOr[js.Tuple3[PR, RO, _EM]] = js.native
    
    val ____ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
    
    val _pr: js.UndefOr[PR] = js.native
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/messages", "RegistrationType")
  @js.native
  open class RegistrationType[RO] protected () extends StObject {
    def this(method: String) = this()
    
    /**
      * Clients must not use this property. It is here to ensure correct typing.
      */
    val ____ : js.UndefOr[js.Tuple2[RO, _EM]] = js.native
    
    val method: String = js.native
  }
}
