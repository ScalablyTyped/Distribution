package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMetadataArgsMod {
  
  trait IndexMetadataArgs extends StObject {
    
    /**
      * Builds the index in the background so that building an index an does not block other database activities.
      * This option is only supported for mongodb database.
      */
    var background: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Columns combination to be used as index.
      */
    var columns: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ] = js.undefined
    
    /**
      * Specifies a time to live, in seconds.
      * This option is only supported for mongodb database.
      */
    var expireAfterSeconds: js.UndefOr[Double] = js.undefined
    
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
      * Works only in MySQL.
      */
    var spatial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if index must sync with database index.
      */
    var synchronize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class to which index is applied.
      */
    var target: js.Function | String
    
    /**
      * Indicates if index must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index filter condition.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object IndexMetadataArgs {
    
    inline def apply(target: js.Function | String): IndexMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexMetadataArgs]
    }
    
    extension [Self <: IndexMetadataArgs](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setColumns(
        value: (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsFunction1(value: /* object */ js.UndefOr[js.Any] => js.Array[js.Any] | StringDictionary[Double]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setExpireAfterSeconds(value: Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
      
      inline def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
      
      inline def setFulltext(value: Boolean): Self = StObject.set(x, "fulltext", value.asInstanceOf[js.Any])
      
      inline def setFulltextUndefined: Self = StObject.set(x, "fulltext", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      inline def setSpatial(value: Boolean): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
      
      inline def setSpatialUndefined: Self = StObject.set(x, "spatial", js.undefined)
      
      inline def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
