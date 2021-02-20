package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsIndexOptionsMod {
  
  @js.native
  trait IndexOptions extends StObject {
    
    /**
      * Builds the index in the background so that building an index an does not block other database activities.
      * This option is only supported for mongodb database.
      */
    var background: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies a time to live, in seconds.
      * This option is only supported for mongodb database.
      */
    var expireAfterSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Works only in MySQL.
      */
    var fulltext: js.UndefOr[Boolean] = js.native
    
    /**
      * Fulltext parser.
      * Works only in MySQL.
      */
    var parser: js.UndefOr[String] = js.native
    
    /**
      * If true, the index only references documents with the specified field.
      * These indexes use less space but behave differently in some situations (particularly sorts).
      * This option is only supported for mongodb database.
      */
    var sparse: js.UndefOr[Boolean] = js.native
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL and PostgreSQL.
      */
    var spatial: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if this composite index must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.native
    
    /**
      * Index filter condition.
      */
    var where: js.UndefOr[String] = js.native
  }
  object IndexOptions {
    
    @scala.inline
    def apply(): IndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexOptions]
    }
    
    @scala.inline
    implicit class IndexOptionsMutableBuilder[Self <: IndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setExpireAfterSeconds(value: Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
      
      @scala.inline
      def setFulltext(value: Boolean): Self = StObject.set(x, "fulltext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFulltextUndefined: Self = StObject.set(x, "fulltext", js.undefined)
      
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
