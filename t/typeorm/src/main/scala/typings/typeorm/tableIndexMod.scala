package typings.typeorm

import typings.typeorm.indexMetadataMod.IndexMetadata
import typings.typeorm.tableIndexOptionsMod.TableIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/schema-builder/table/TableIndex", JSImport.Namespace)
@js.native
object tableIndexMod extends js.Object {
  
  @js.native
  class TableIndex protected () extends js.Object {
    def this(options: TableIndexOptions) = this()
    
    /**
      * Columns included in this index.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Works only in MySQL.
      */
    var isFulltext: Boolean = js.native
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL.
      */
    var isSpatial: Boolean = js.native
    
    /**
      * Indicates if this index is unique.
      */
    var isUnique: Boolean = js.native
    
    /**
      * Index name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Fulltext parser.
      * Works only in MySQL.
      */
    var parser: js.UndefOr[String] = js.native
    
    /**
      * Index filter condition.
      */
    var where: String = js.native
  }
  /* static members */
  @js.native
  object TableIndex extends js.Object {
    
    /**
      * Creates index from the index metadata object.
      */
    def create(indexMetadata: IndexMetadata): TableIndex = js.native
  }
}
