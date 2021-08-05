package typings.stylableCore

import typings.postcss.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("@stylable/core/cjs/diagnostics", "Diagnostics")
  @js.native
  class Diagnostics () extends StObject {
    def this(reports: js.Array[Diagnostic]) = this()
    
    def add(`type`: DiagnosticType, node: Node, message: String): Unit = js.native
    def add(`type`: DiagnosticType, node: Node, message: String, options: DiagnosticOptions): Unit = js.native
    
    def error(node: Node, message: String): Unit = js.native
    def error(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
    
    var reports: js.Array[Diagnostic] = js.native
    
    def warn(node: Node, message: String): Unit = js.native
    def warn(node: Node, message: String, options: DiagnosticOptions): Unit = js.native
  }
  
  trait Diagnostic extends StObject {
    
    var message: String
    
    var node: Node
    
    var options: DiagnosticOptions
    
    var `type`: DiagnosticType
  }
  object Diagnostic {
    
    inline def apply(message: String, node: Node, options: DiagnosticOptions, `type`: DiagnosticType): Diagnostic = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    extension [Self <: Diagnostic](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: DiagnosticOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: DiagnosticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiagnosticOptions extends StObject {
    
    var word: js.UndefOr[String] = js.undefined
  }
  object DiagnosticOptions {
    
    inline def apply(): DiagnosticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnosticOptions]
    }
    
    extension [Self <: DiagnosticOptions](x: Self) {
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylableCore.stylableCoreStrings.error
    - typings.stylableCore.stylableCoreStrings.warning
  */
  trait DiagnosticType extends StObject
  object DiagnosticType {
    
    inline def error: typings.stylableCore.stylableCoreStrings.error = "error".asInstanceOf[typings.stylableCore.stylableCoreStrings.error]
    
    inline def warning: typings.stylableCore.stylableCoreStrings.warning = "warning".asInstanceOf[typings.stylableCore.stylableCoreStrings.warning]
  }
}
