package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.begin
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.end
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.report
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcancel
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcreate
import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotprogressMod {
  
  object WorkDoneProgress {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def is(value: ProgressType[Any]): /* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc.ProgressType<vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressBegin | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressReport | vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.progress.WorkDoneProgressEnd> */ Boolean]
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgress.type")
    @js.native
    val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
  }
  
  object WorkDoneProgressCancelNotification {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCancelNotification.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCancelNotification.method")
    @js.native
    val method: windowSlashworkDoneProgressSlashcancel = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCancelNotification.type")
    @js.native
    val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
    
    type HandlerSignature = NotificationHandler[WorkDoneProgressCancelParams]
  }
  
  object WorkDoneProgressCreateRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCreateRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCreateRequest.method")
    @js.native
    val method: windowSlashworkDoneProgressSlashcreate = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.progress", "WorkDoneProgressCreateRequest.type")
    @js.native
    val `type`: ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler[WorkDoneProgressCreateParams, Unit, Unit]
  }
  
  trait WorkDoneProgressBegin extends StObject {
    
    /**
      * Controls if a cancel button should show to allow the user to cancel the
      * long running operation. Clients that don't support cancellation are allowed
      * to ignore the setting.
      */
    var cancellable: js.UndefOr[Boolean] = js.undefined
    
    var kind: begin
    
    /**
      * Optional, more detailed associated progress message. Contains
      * complementary information to the `title`.
      *
      * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
      * If unset, the previous progress message (if any) is still valid.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Optional progress percentage to display (value 100 is considered 100%).
      * If not provided infinite progress is assumed and clients are allowed
      * to ignore the `percentage` value in subsequent in report notifications.
      *
      * The value should be steadily rising. Clients are free to ignore values
      * that are not following this rule. The value range is [0, 100].
      */
    var percentage: js.UndefOr[uinteger] = js.undefined
    
    /**
      * Mandatory title of the progress operation. Used to briefly inform about
      * the kind of operation being performed.
      *
      * Examples: "Indexing" or "Linking dependencies".
      */
    var title: String
  }
  object WorkDoneProgressBegin {
    
    inline def apply(title: String): WorkDoneProgressBegin = {
      val __obj = js.Dynamic.literal(kind = "begin", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressBegin]
    }
    
    extension [Self <: WorkDoneProgressBegin](x: Self) {
      
      inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
      
      inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
      
      inline def setKind(value: begin): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPercentage(value: uinteger): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkDoneProgressCancelParams extends StObject {
    
    /**
      * The token to be used to report progress.
      */
    var token: ProgressToken
  }
  object WorkDoneProgressCancelParams {
    
    inline def apply(token: ProgressToken): WorkDoneProgressCancelParams = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressCancelParams]
    }
    
    extension [Self <: WorkDoneProgressCancelParams](x: Self) {
      
      inline def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkDoneProgressCreateParams extends StObject {
    
    /**
      * The token to be used to report progress.
      */
    var token: ProgressToken
  }
  object WorkDoneProgressCreateParams {
    
    inline def apply(token: ProgressToken): WorkDoneProgressCreateParams = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressCreateParams]
    }
    
    extension [Self <: WorkDoneProgressCreateParams](x: Self) {
      
      inline def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkDoneProgressEnd extends StObject {
    
    var kind: end
    
    /**
      * Optional, a final message indicating to for example indicate the outcome
      * of the operation.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object WorkDoneProgressEnd {
    
    inline def apply(): WorkDoneProgressEnd = {
      val __obj = js.Dynamic.literal(kind = "end")
      __obj.asInstanceOf[WorkDoneProgressEnd]
    }
    
    extension [Self <: WorkDoneProgressEnd](x: Self) {
      
      inline def setKind(value: end): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait WorkDoneProgressReport extends StObject {
    
    /**
      * Controls enablement state of a cancel button.
      *
      * Clients that don't support cancellation or don't support controlling the button's
      * enablement state are allowed to ignore the property.
      */
    var cancellable: js.UndefOr[Boolean] = js.undefined
    
    var kind: report
    
    /**
      * Optional, more detailed associated progress message. Contains
      * complementary information to the `title`.
      *
      * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
      * If unset, the previous progress message (if any) is still valid.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Optional progress percentage to display (value 100 is considered 100%).
      * If not provided infinite progress is assumed and clients are allowed
      * to ignore the `percentage` value in subsequent in report notifications.
      *
      * The value should be steadily rising. Clients are free to ignore values
      * that are not following this rule. The value range is [0, 100]
      */
    var percentage: js.UndefOr[uinteger] = js.undefined
  }
  object WorkDoneProgressReport {
    
    inline def apply(): WorkDoneProgressReport = {
      val __obj = js.Dynamic.literal(kind = "report")
      __obj.asInstanceOf[WorkDoneProgressReport]
    }
    
    extension [Self <: WorkDoneProgressReport](x: Self) {
      
      inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
      
      inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
      
      inline def setKind(value: report): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPercentage(value: uinteger): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    }
  }
}
