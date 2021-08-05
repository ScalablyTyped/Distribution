package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Board
  extends StObject
     with BoardReference {
  
  var _links: js.Any
  
  var allowedMappings: StringDictionary[StringDictionary[js.Array[String]]]
  
  var canEdit: Boolean
  
  var columns: js.Array[BoardColumn]
  
  var fields: BoardFields
  
  var isValid: Boolean
  
  var revision: Double
  
  var rows: js.Array[BoardRow]
}
object Board {
  
  inline def apply(
    _links: js.Any,
    allowedMappings: StringDictionary[StringDictionary[js.Array[String]]],
    canEdit: Boolean,
    columns: js.Array[BoardColumn],
    fields: BoardFields,
    id: String,
    isValid: Boolean,
    name: String,
    revision: Double,
    rows: js.Array[BoardRow],
    url: String
  ): Board = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], allowedMappings = allowedMappings.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Board]
  }
  
  extension [Self <: Board](x: Self) {
    
    inline def setAllowedMappings(value: StringDictionary[StringDictionary[js.Array[String]]]): Self = StObject.set(x, "allowedMappings", value.asInstanceOf[js.Any])
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[BoardColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: BoardColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setFields(value: BoardFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[BoardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: BoardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
