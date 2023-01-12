package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamespaceSpecifier
  extends StObject
     with Node
     with HasSpan
     with ExportSpecifier {
  
  var name: ModuleExportName
  
  @JSName("type")
  var type_ExportNamespaceSpecifier: typings.swcCore.swcCoreStrings.ExportNamespaceSpecifier
}
object ExportNamespaceSpecifier {
  
  inline def apply(name: ModuleExportName, span: Span): ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[ExportNamespaceSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportNamespaceSpecifier] (val x: Self) extends AnyVal {
    
    inline def setName(value: ModuleExportName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
