package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The analysis of the document's tables. */
trait TableReturn extends StObject {
  
  /** Information about the parsed input document. */
  var document: js.UndefOr[DocInfo] = js.undefined
  
  /** The ID of the model used to extract the table contents. The value for table extraction is `tables`. */
  var model_id: js.UndefOr[String] = js.undefined
  
  /** The version of the `tables` model ID. */
  var model_version: js.UndefOr[String] = js.undefined
  
  /** Definitions of the tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.undefined
}
object TableReturn {
  
  @scala.inline
  def apply(): TableReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableReturn]
  }
  
  @scala.inline
  implicit class TableReturnMutableBuilder[Self <: TableReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: DocInfo): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setModel_version(value: String): Self = StObject.set(x, "model_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_versionUndefined: Self = StObject.set(x, "model_version", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[Tables]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: Tables*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
