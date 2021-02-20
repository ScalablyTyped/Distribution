package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Board extends BoardReference {
  
  var _links: js.Any = js.native
  
  var allowedMappings: StringDictionary[StringDictionary[js.Array[String]]] = js.native
  
  var canEdit: Boolean = js.native
  
  var columns: js.Array[BoardColumn] = js.native
  
  var fields: BoardFields = js.native
  
  var isValid: Boolean = js.native
  
  var revision: Double = js.native
  
  var rows: js.Array[BoardRow] = js.native
}
object Board {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BoardMutableBuilder[Self <: Board] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedMappings(value: StringDictionary[StringDictionary[js.Array[String]]]): Self = StObject.set(x, "allowedMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: js.Array[BoardColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: BoardColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: BoardFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[BoardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: BoardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
