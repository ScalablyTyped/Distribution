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
    
    inline def apply(code2Protocol: /* value */ Uri => String, protocol2Code: /* value */ String => Uri): Code2Protocol = {
      val __obj = js.Dynamic.literal(code2Protocol = js.Any.fromFunction1(code2Protocol), protocol2Code = js.Any.fromFunction1(protocol2Code))
      __obj.asInstanceOf[Code2Protocol]
    }
    
    extension [Self <: Code2Protocol](x: Self) {
      
      inline def setCode2Protocol(value: /* value */ Uri => String): Self = StObject.set(x, "code2Protocol", js.Any.fromFunction1(value))
      
      inline def setProtocol2Code(value: /* value */ String => Uri): Self = StObject.set(x, "protocol2Code", js.Any.fromFunction1(value))
    }
  }
  
  trait Debug
    extends StObject
       with _ServerOptions {
    
    var debug: Executable
    
    var run: Executable
  }
  object Debug {
    
    inline def apply(debug: Executable, run: Executable): Debug = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Executable): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setRun(value: Executable): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document extends StObject {
    
    var document: TextDocument
    
    var range: Range
  }
  object Document {
    
    inline def apply(document: TextDocument, range: Range): Document = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentSelector extends StObject {
    
    var documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
  }
  object DocumentSelector {
    
    inline def apply(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): DocumentSelector = {
      val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentSelector]
    }
    
    extension [Self <: DocumentSelector](x: Self) {
      
      inline def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
      
      inline def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = StObject.set(x, "documentSelector", js.Array(value :_*))
    }
  }
  
  trait IncludeDeclaration extends StObject {
    
    var includeDeclaration: Boolean
  }
  object IncludeDeclaration {
    
    inline def apply(includeDeclaration: Boolean): IncludeDeclaration = {
      val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncludeDeclaration]
    }
    
    extension [Self <: IncludeDeclaration](x: Self) {
      
      inline def setIncludeDeclaration(value: Boolean): Self = StObject.set(x, "includeDeclaration", value.asInstanceOf[js.Any])
    }
  }
  
  trait Placeholder extends StObject {
    
    var placeholder: String
    
    var range: Range
  }
  object Placeholder {
    
    inline def apply(placeholder: String, range: Range): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    extension [Self <: Placeholder](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait Run
    extends StObject
       with _ServerOptions {
    
    var debug: NodeModule
    
    var run: NodeModule
  }
  object Run {
    
    inline def apply(debug: NodeModule, run: NodeModule): Run = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
      __obj.asInstanceOf[Run]
    }
    
    extension [Self <: Run](x: Self) {
      
      inline def setDebug(value: NodeModule): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setRun(value: NodeModule): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    }
  }
  
  trait Send[T /* <: js.Function */] extends StObject {
    
    var send: T
  }
  object Send {
    
    inline def apply[T /* <: js.Function */](send: T): Send[T] = {
      val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
      __obj.asInstanceOf[Send[T]]
    }
    
    extension [Self <: Send[?], T /* <: js.Function */](x: Self & Send[T]) {
      
      inline def setSend(value: T): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    }
  }
}
