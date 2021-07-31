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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code2Protocol extends StObject {
    
    def code2Protocol(value: Uri): String
    @JSName("code2Protocol")
    var code2Protocol_Original: URIConverter
    
    def protocol2Code(value: String): Uri
    @JSName("protocol2Code")
    var protocol2Code_Original: typings.vscodeLanguageclient.protocolConverterMod.URIConverter
  }
  object Code2Protocol {
    
    @scala.inline
    def apply(code2Protocol: /* value */ Uri => String, protocol2Code: /* value */ String => Uri): Code2Protocol = {
      val __obj = js.Dynamic.literal(code2Protocol = js.Any.fromFunction1(code2Protocol), protocol2Code = js.Any.fromFunction1(protocol2Code))
      __obj.asInstanceOf[Code2Protocol]
    }
    
    @scala.inline
    implicit class Code2ProtocolMutableBuilder[Self <: Code2Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode2Protocol(value: /* value */ Uri => String): Self = StObject.set(x, "code2Protocol", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProtocol2Code(value: /* value */ String => Uri): Self = StObject.set(x, "protocol2Code", js.Any.fromFunction1(value))
    }
  }
  
  trait Debug
    extends StObject
       with _ServerOptions {
    
    var debug: Executable
    
    var run: Executable
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
  
  trait Document extends StObject {
    
    var document: TextDocument
    
    var range: Range
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
  
  trait DocumentSelector extends StObject {
    
    var documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
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
  
  trait IncludeDeclaration extends StObject {
    
    var includeDeclaration: Boolean
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
  
  trait Placeholder extends StObject {
    
    var placeholder: String
    
    var range: Range
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
  
  trait Run
    extends StObject
       with _ServerOptions {
    
    var debug: NodeModule
    
    var run: NodeModule
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
  
  trait Send[T /* <: js.Function */] extends StObject {
    
    var send: T
  }
  object Send {
    
    @scala.inline
    def apply[T /* <: js.Function */](send: T): Send[T] = {
      val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
      __obj.asInstanceOf[Send[T]]
    }
    
    @scala.inline
    implicit class SendMutableBuilder[Self <: Send[?], T /* <: js.Function */] (val x: Self & Send[T]) extends AnyVal {
      
      @scala.inline
      def setSend(value: T): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    }
  }
}
