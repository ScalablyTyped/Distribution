package typings.vscodeLanguageserver.anon

import typings.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler1
import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidChangeNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidCloseNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidOpenNotebookDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.DidSaveNotebookDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDidChangeNotebookDocument extends StObject {
  
  def onDidChangeNotebookDocument(handler: NotificationHandler1[DidChangeNotebookDocumentParams]): Disposable
  
  def onDidCloseNotebookDocument(handler: NotificationHandler1[DidCloseNotebookDocumentParams]): Disposable
  
  def onDidOpenNotebookDocument(handler: NotificationHandler1[DidOpenNotebookDocumentParams]): Disposable
  
  def onDidSaveNotebookDocument(handler: NotificationHandler1[DidSaveNotebookDocumentParams]): Disposable
}
object OnDidChangeNotebookDocument {
  
  inline def apply(
    onDidChangeNotebookDocument: NotificationHandler1[DidChangeNotebookDocumentParams] => Disposable,
    onDidCloseNotebookDocument: NotificationHandler1[DidCloseNotebookDocumentParams] => Disposable,
    onDidOpenNotebookDocument: NotificationHandler1[DidOpenNotebookDocumentParams] => Disposable,
    onDidSaveNotebookDocument: NotificationHandler1[DidSaveNotebookDocumentParams] => Disposable
  ): OnDidChangeNotebookDocument = {
    val __obj = js.Dynamic.literal(onDidChangeNotebookDocument = js.Any.fromFunction1(onDidChangeNotebookDocument), onDidCloseNotebookDocument = js.Any.fromFunction1(onDidCloseNotebookDocument), onDidOpenNotebookDocument = js.Any.fromFunction1(onDidOpenNotebookDocument), onDidSaveNotebookDocument = js.Any.fromFunction1(onDidSaveNotebookDocument))
    __obj.asInstanceOf[OnDidChangeNotebookDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDidChangeNotebookDocument] (val x: Self) extends AnyVal {
    
    inline def setOnDidChangeNotebookDocument(value: NotificationHandler1[DidChangeNotebookDocumentParams] => Disposable): Self = StObject.set(x, "onDidChangeNotebookDocument", js.Any.fromFunction1(value))
    
    inline def setOnDidCloseNotebookDocument(value: NotificationHandler1[DidCloseNotebookDocumentParams] => Disposable): Self = StObject.set(x, "onDidCloseNotebookDocument", js.Any.fromFunction1(value))
    
    inline def setOnDidOpenNotebookDocument(value: NotificationHandler1[DidOpenNotebookDocumentParams] => Disposable): Self = StObject.set(x, "onDidOpenNotebookDocument", js.Any.fromFunction1(value))
    
    inline def setOnDidSaveNotebookDocument(value: NotificationHandler1[DidSaveNotebookDocumentParams] => Disposable): Self = StObject.set(x, "onDidSaveNotebookDocument", js.Any.fromFunction1(value))
  }
}
