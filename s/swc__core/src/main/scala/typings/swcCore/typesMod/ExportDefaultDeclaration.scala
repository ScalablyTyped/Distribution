package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var decl: DefaultDecl
  
  @JSName("type")
  var type_ExportDefaultDeclaration: typings.swcCore.swcCoreStrings.ExportDefaultDeclaration
}
object ExportDefaultDeclaration {
  
  inline def apply(decl: DefaultDecl, span: Span): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  
  extension [Self <: ExportDefaultDeclaration](x: Self) {
    
    inline def setDecl(value: DefaultDecl): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
