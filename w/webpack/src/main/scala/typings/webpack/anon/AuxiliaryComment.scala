package typings.webpack.anon

import typings.webpack.mod.LibraryExport
import typings.webpack.mod.LibraryName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuxiliaryComment extends StObject {
  
  var auxiliaryComment: typings.webpack.mod.AuxiliaryComment
  
  var `export`: LibraryExport
  
  var name: LibraryName
  
  var `type`: String
  
  var umdNamedDefine: Boolean
}
object AuxiliaryComment {
  
  inline def apply(
    auxiliaryComment: typings.webpack.mod.AuxiliaryComment,
    `export`: LibraryExport,
    name: LibraryName,
    `type`: String,
    umdNamedDefine: Boolean
  ): AuxiliaryComment = {
    val __obj = js.Dynamic.literal(auxiliaryComment = auxiliaryComment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], umdNamedDefine = umdNamedDefine.asInstanceOf[js.Any])
    __obj.updateDynamic("export")(`export`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuxiliaryComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuxiliaryComment] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryComment(value: typings.webpack.mod.AuxiliaryComment): Self = StObject.set(x, "auxiliaryComment", value.asInstanceOf[js.Any])
    
    inline def setExport(value: LibraryExport): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setName(value: LibraryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUmdNamedDefine(value: Boolean): Self = StObject.set(x, "umdNamedDefine", value.asInstanceOf[js.Any])
  }
}
