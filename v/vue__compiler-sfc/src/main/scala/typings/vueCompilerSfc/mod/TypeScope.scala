package typings.vueCompilerSfc.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeScope extends StObject {
  
  var declares: Record[String, ScopeTypeNode]
  
  var exportedDeclares: Record[String, ScopeTypeNode]
  
  var exportedTypes: Record[String, ScopeTypeNode]
  
  var filename: String
  
  var imports: Record[String, Import]
  
  var offset: Double
  
  var resolvedImportSources: Record[String, String]
  
  var source: String
  
  var types: Record[String, ScopeTypeNode]
}
object TypeScope {
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeScope] (val x: Self) extends AnyVal {
    
    inline def setDeclares(value: Record[String, ScopeTypeNode]): Self = StObject.set(x, "declares", value.asInstanceOf[js.Any])
    
    inline def setExportedDeclares(value: Record[String, ScopeTypeNode]): Self = StObject.set(x, "exportedDeclares", value.asInstanceOf[js.Any])
    
    inline def setExportedTypes(value: Record[String, ScopeTypeNode]): Self = StObject.set(x, "exportedTypes", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setImports(value: Record[String, Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setResolvedImportSources(value: Record[String, String]): Self = StObject.set(x, "resolvedImportSources", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Record[String, ScopeTypeNode]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
