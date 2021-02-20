package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.anon.`3`
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.begin
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.end
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolProgressMod {
  
  object WorkDoneProgress {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgress.type")
    @js.native
    val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
  }
  
  object WorkDoneProgressCancelNotification {
    
    type HandlerSignature = NotificationHandler[WorkDoneProgressCancelParams]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCancelNotification.type")
    @js.native
    val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
  }
  
  object WorkDoneProgressCreateRequest {
    
    type HandlerSignature = RequestHandler[WorkDoneProgressCreateParams, Unit, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCreateRequest.type")
    @js.native
    val `type`: ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
  }
  
  @js.native
  trait WorkDoneProgressBegin extends StObject {
    
    /**
      * Controls if a cancel button should show to allow the user to cancel the
      * long running operation. Clients that don't support cancellation are allowed
      * to ignore the setting.
      */
    var cancellable: js.UndefOr[Boolean] = js.native
    
    var kind: begin = js.native
    
    /**
      * Optional, more detailed associated progress message. Contains
      * complementary information to the `title`.
      *
      * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
      * If unset, the previous progress message (if any) is still valid.
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * Optional progress percentage to display (value 100 is considered 100%).
      * If not provided infinite progress is assumed and clients are allowed
      * to ignore the `percentage` value in subsequent in report notifications.
      *
      * The value should be steadily rising. Clients are free to ignore values
      * that are not following this rule.
      */
    var percentage: js.UndefOr[Double] = js.native
    
    /**
      * Mandatory title of the progress operation. Used to briefly inform about
      * the kind of operation being performed.
      *
      * Examples: "Indexing" or "Linking dependencies".
      */
    var title: String = js.native
  }
  object WorkDoneProgressBegin {
    
    @scala.inline
    def apply(kind: begin, title: String): WorkDoneProgressBegin = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressBegin]
    }
    
    @scala.inline
    implicit class WorkDoneProgressBeginMutableBuilder[Self <: WorkDoneProgressBegin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
      
      @scala.inline
      def setKind(value: begin): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkDoneProgressCancelParams extends StObject {
    
    /**
      * The token to be used to report progress.
      */
    var token: ProgressToken = js.native
  }
  object WorkDoneProgressCancelParams {
    
    @scala.inline
    def apply(token: ProgressToken): WorkDoneProgressCancelParams = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressCancelParams]
    }
    
    @scala.inline
    implicit class WorkDoneProgressCancelParamsMutableBuilder[Self <: WorkDoneProgressCancelParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkDoneProgressClientCapabilities extends StObject {
    
    /**
      * Window specific client capabilities.
      */
    var window: js.UndefOr[`3`] = js.native
  }
  object WorkDoneProgressClientCapabilities {
    
    @scala.inline
    def apply(): WorkDoneProgressClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkDoneProgressClientCapabilities]
    }
    
    @scala.inline
    implicit class WorkDoneProgressClientCapabilitiesMutableBuilder[Self <: WorkDoneProgressClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: `3`): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait WorkDoneProgressCreateParams extends StObject {
    
    /**
      * The token to be used to report progress.
      */
    var token: ProgressToken = js.native
  }
  object WorkDoneProgressCreateParams {
    
    @scala.inline
    def apply(token: ProgressToken): WorkDoneProgressCreateParams = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressCreateParams]
    }
    
    @scala.inline
    implicit class WorkDoneProgressCreateParamsMutableBuilder[Self <: WorkDoneProgressCreateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkDoneProgressEnd extends StObject {
    
    var kind: end = js.native
    
    /**
      * Optional, a final message indicating to for example indicate the outcome
      * of the operation.
      */
    var message: js.UndefOr[String] = js.native
  }
  object WorkDoneProgressEnd {
    
    @scala.inline
    def apply(kind: end): WorkDoneProgressEnd = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressEnd]
    }
    
    @scala.inline
    implicit class WorkDoneProgressEndMutableBuilder[Self <: WorkDoneProgressEnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: end): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait WorkDoneProgressReport extends StObject {
    
    /**
      * Controls enablement state of a cancel button. This property is only valid if a cancel
      * button got requested in the `WorkDoneProgressStart` payload.
      *
      * Clients that don't support cancellation or don't support control the button's
      * enablement state are allowed to ignore the setting.
      */
    var cancellable: js.UndefOr[Boolean] = js.native
    
    var kind: report = js.native
    
    /**
      * Optional, more detailed associated progress message. Contains
      * complementary information to the `title`.
      *
      * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
      * If unset, the previous progress message (if any) is still valid.
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * Optional progress percentage to display (value 100 is considered 100%).
      * If not provided infinite progress is assumed and clients are allowed
      * to ignore the `percentage` value in subsequent in report notifications.
      *
      * The value should be steadily rising. Clients are free to ignore values
      * that are not following this rule.
      */
    var percentage: js.UndefOr[Double] = js.native
  }
  object WorkDoneProgressReport {
    
    @scala.inline
    def apply(kind: report): WorkDoneProgressReport = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkDoneProgressReport]
    }
    
    @scala.inline
    implicit class WorkDoneProgressReportMutableBuilder[Self <: WorkDoneProgressReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
      
      @scala.inline
      def setKind(value: report): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    }
  }
}
