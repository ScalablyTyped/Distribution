package typings.tsNode

import typings.typescript.mod.CancellationToken
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticMessageChain
import typings.typescript.mod.DocumentRegistry
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageService
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.LanguageServiceMode
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SymbolDisplayPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): String = js.native
    def apply(displayParts: js.Array[SymbolDisplayPart]): String = js.native
  }
  
  @js.native
  trait FnCallDiagNewLineIndent extends StObject {
    
    def apply(diag: String, newLine: String): String = js.native
    def apply(diag: String, newLine: String, indent: Double): String = js.native
    def apply(diag: Unit, newLine: String): String = js.native
    def apply(diag: Unit, newLine: String, indent: Double): String = js.native
    def apply(diag: DiagnosticMessageChain, newLine: String): String = js.native
    def apply(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
  }
  
  @js.native
  trait FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode extends StObject {
    
    def apply(host: LanguageServiceHost): LanguageService = js.native
    def apply(host: LanguageServiceHost, documentRegistry: Unit, syntaxOnlyOrLanguageServiceMode: Boolean): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: Unit,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
    def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService = js.native
    def apply(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
  }
  
  @js.native
  trait FnCallProgramSourceFileCancellationToken extends StObject {
    
    def apply(program: Program): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: Unit, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
    def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  }
  
  @js.native
  trait FnCallSearchPathFileExistsConfigName extends StObject {
    
    def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
    def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
  }
  
  trait TypeofScriptSnapshot extends StObject {
    
    def fromString(text: String): IScriptSnapshot
  }
  object TypeofScriptSnapshot {
    
    inline def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofScriptSnapshot]
    }
    
    extension [Self <: TypeofScriptSnapshot](x: Self) {
      
      inline def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
}
