package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.std.IterableIterator
import typings.std.Map
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentSelector
import typings.vscode.mod.Event
import typings.vscodeLanguageclient.anon.Send
import typings.vscodeLanguageclient.anon.TextDocument
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient/lib/common/features", "TextDocumentEventFeature")
@js.native
open class TextDocumentEventFeature[P /* <: TextDocument */, E, M] protected ()
  extends DynamicDocumentFeature[TextDocumentRegistrationOptions, M, js.Object]
     with TextDocumentSendFeature[js.Function1[/* data */ E, js.Promise[Unit]]]
     with NotifyingFeature[P] {
  def this(
    client: FeatureClient[M, js.Object],
    event: Event[E],
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typings.vscode.mod.TextDocument]
  ) = this()
  def this(
    client: FeatureClient[M, js.Object],
    event: Event[E],
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typings.vscode.mod.TextDocument],
    selectorFilter: js.Function2[/* selectors */ IterableIterator[DocumentSelector], /* data */ E, Boolean]
  ) = this()
  
  /* protected */ def _createParams(data: E): P = js.native
  
  /* private */ val _event: Any = js.native
  
  /* private */ var _listener: Any = js.native
  
  /* protected */ def _middleware(): js.UndefOr[NextSignature[E, js.Promise[Unit]]] = js.native
  
  /* private */ val _onNotificationSent: Any = js.native
  
  /* protected */ val _selectorFilter: js.UndefOr[
    js.Function2[/* selectors */ IterableIterator[DocumentSelector], /* data */ E, Boolean]
  ] = js.native
  
  /* protected */ val _selectors: Map[String, DocumentSelector] = js.native
  
  /* protected */ def _textDocument(data: E): typings.vscode.mod.TextDocument = js.native
  
  /* protected */ val _type: ProtocolNotificationType[P, TextDocumentRegistrationOptions] = js.native
  
  /* protected */ def callback(data: E): js.Promise[Unit] = js.native
  
  /**
    * Returns a provider for the given text document.
    */
  /* CompleteClass */
  override def getProvider(document: typings.vscode.mod.TextDocument): js.UndefOr[Send[js.Function1[/* data */ E, js.Promise[Unit]]]] = js.native
  
  /* protected */ def getStateInfo(): js.Tuple2[IterableIterator[DocumentSelector], Boolean] = js.native
  
  /* protected */ def getTextDocument(data: E): typings.vscode.mod.TextDocument = js.native
  
  /* private */ var matches: Any = js.native
  
  /* protected */ def notificationSent(
    textDocument: typings.vscode.mod.TextDocument,
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions],
    params: P
  ): Unit = js.native
  
  def onNotificationSent: Event[NotificationSendEvent[P]] = js.native
  /* CompleteClass */
  override def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[P], Any]): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[P], Any], thisArgs: Any): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[P], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[P], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /* CompleteClass */
  @JSName("onNotificationSent")
  var onNotificationSent_Original: Event[NotificationSendEvent[P]] = js.native
}
/* static members */
object TextDocumentEventFeature {
  
  @JSImport("vscode-languageclient/lib/common/features", "TextDocumentEventFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def textDocumentFilter(selectors: IterableIterator[DocumentSelector], textDocument: typings.vscode.mod.TextDocument): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textDocumentFilter")(selectors.asInstanceOf[js.Any], textDocument.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
