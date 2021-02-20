package typings.vscodeLanguageclient

import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.codeConverterMod.URIConverter
import typings.vscodeLanguageclient.mod.Executable
import typings.vscodeLanguageclient.mod.NodeModule
import typings.vscodeLanguageclient.mod._ServerOptions
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code2Protocol extends StObject {
    
    def code2Protocol(value: Uri): String = js.native
    @JSName("code2Protocol")
    var code2Protocol_Original: URIConverter = js.native
    
    def protocol2Code(value: String): Uri = js.native
    @JSName("protocol2Code")
    var protocol2Code_Original: typings.vscodeLanguageclient.protocolConverterMod.URIConverter = js.native
  }
  
  @js.native
  trait Debug extends _ServerOptions {
    
    var debug: Executable = js.native
    
    var run: Executable = js.native
  }
  object Debug {
    
    @scala.inline
    def apply(debug: Executable, run: Executable): Debug = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Executable): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: Executable): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Document extends StObject {
    
    var document: TextDocument = js.native
    
    var range: Range = js.native
  }
  object Document {
    
    @scala.inline
    def apply(document: TextDocument, range: Range): Document = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentSelector extends StObject {
    
    var documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector = js.native
  }
  object DocumentSelector {
    
    @scala.inline
    def apply(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): DocumentSelector = {
      val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentSelector]
    }
    
    @scala.inline
    implicit class DocumentSelectorMutableBuilder[Self <: DocumentSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = StObject.set(x, "documentSelector", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IncludeDeclaration extends StObject {
    
    var includeDeclaration: Boolean = js.native
  }
  object IncludeDeclaration {
    
    @scala.inline
    def apply(includeDeclaration: Boolean): IncludeDeclaration = {
      val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncludeDeclaration]
    }
    
    @scala.inline
    implicit class IncludeDeclarationMutableBuilder[Self <: IncludeDeclaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDeclaration(value: Boolean): Self = StObject.set(x, "includeDeclaration", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Placeholder extends StObject {
    
    var placeholder: String = js.native
    
    var range: Range = js.native
  }
  object Placeholder {
    
    @scala.inline
    def apply(placeholder: String, range: Range): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Run extends _ServerOptions {
    
    var debug: NodeModule = js.native
    
    var run: NodeModule = js.native
  }
  object Run {
    
    @scala.inline
    def apply(debug: NodeModule, run: NodeModule): Run = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[Run]
    }
    
    @scala.inline
    implicit class RunMutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: NodeModule): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: NodeModule): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Send[T /* <: js.Function */] extends StObject {
    
    var send: T = js.native
  }
  object Send {
    
    @scala.inline
    def apply[T /* <: js.Function */](send: T): Send[T] = {
      val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
      __obj.asInstanceOf[Send[T]]
    }
    
    @scala.inline
    implicit class SendMutableBuilder[Self <: Send[_], T /* <: js.Function */] (val x: Self with Send[T]) extends AnyVal {
      
      @scala.inline
      def setSend(value: T): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    }
  }
}
