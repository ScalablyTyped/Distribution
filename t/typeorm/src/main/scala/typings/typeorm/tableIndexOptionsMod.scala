package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableIndexOptionsMod {
  
  @js.native
  trait TableIndexOptions extends StObject {
    
    /**
      * Columns included in this index.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Supported only in MySQL & SAP HANA.
      */
    var isFulltext: js.UndefOr[Boolean] = js.native
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL.
      */
    var isSpatial: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if this index is unique.
      */
    var isUnique: js.UndefOr[Boolean] = js.native
    
    /**
      * Constraint name.
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
    var where: js.UndefOr[String] = js.native
  }
  object TableIndexOptions {
    
    @scala.inline
    def apply(columnNames: js.Array[String]): TableIndexOptions = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableIndexOptions]
    }
    
    @scala.inline
    implicit class TableIndexOptionsMutableBuilder[Self <: TableIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      @scala.inline
      def setIsFulltext(value: Boolean): Self = StObject.set(x, "isFulltext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFulltextUndefined: Self = StObject.set(x, "isFulltext", js.undefined)
      
      @scala.inline
      def setIsSpatial(value: Boolean): Self = StObject.set(x, "isSpatial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSpatialUndefined: Self = StObject.set(x, "isSpatial", js.undefined)
      
      @scala.inline
      def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
