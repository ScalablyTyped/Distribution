package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTableIndexOptionsMod {
  
  trait TableIndexOptions extends StObject {
    
    /**
      * Columns included in this index.
      */
    var columnNames: js.Array[String]
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Supported only in MySQL & SAP HANA.
      */
    var isFulltext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL.
      */
    var isSpatial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this index is unique.
      */
    var isUnique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Fulltext parser.
      * Works only in MySQL.
      */
    var parser: js.UndefOr[String] = js.undefined
    
    /**
      * Index filter condition.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object TableIndexOptions {
    
    inline def apply(columnNames: js.Array[String]): TableIndexOptions = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableIndexOptions]
    }
    
    extension [Self <: TableIndexOptions](x: Self) {
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      inline def setIsFulltext(value: Boolean): Self = StObject.set(x, "isFulltext", value.asInstanceOf[js.Any])
      
      inline def setIsFulltextUndefined: Self = StObject.set(x, "isFulltext", js.undefined)
      
      inline def setIsSpatial(value: Boolean): Self = StObject.set(x, "isSpatial", value.asInstanceOf[js.Any])
      
      inline def setIsSpatialUndefined: Self = StObject.set(x, "isSpatial", js.undefined)
      
      inline def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
      
      inline def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
