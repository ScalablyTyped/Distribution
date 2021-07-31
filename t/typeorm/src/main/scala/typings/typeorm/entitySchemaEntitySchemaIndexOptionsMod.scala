package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaEntitySchemaIndexOptionsMod {
  
  trait EntitySchemaIndexOptions extends StObject {
    
    /**
      * Index column names.
      */
    var columns: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ] = js.undefined
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Works only in MySQL.
      */
    var fulltext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Fulltext parser.
      * Works only in MySQL.
      */
    var parser: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the index only references documents with the specified field.
      * These indexes use less space but behave differently in some situations (particularly sorts).
      * This option is only supported for mongodb database.
      */
    var sparse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL and PostgreSQL.
      */
    var spatial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if index must sync with database index.
      */
    var synchronize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this index must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index filter condition.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object EntitySchemaIndexOptions {
    
    @scala.inline
    def apply(): EntitySchemaIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntitySchemaIndexOptions]
    }
    
    @scala.inline
    implicit class EntitySchemaIndexOptionsMutableBuilder[Self <: EntitySchemaIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(
        value: (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsFunction1(value: /* object */ js.UndefOr[js.Any] => js.Array[js.Any] | StringDictionary[Double]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFulltext(value: Boolean): Self = StObject.set(x, "fulltext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFulltextUndefined: Self = StObject.set(x, "fulltext", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      @scala.inline
      def setSpatial(value: Boolean): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpatialUndefined: Self = StObject.set(x, "spatial", js.undefined)
      
      @scala.inline
      def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
