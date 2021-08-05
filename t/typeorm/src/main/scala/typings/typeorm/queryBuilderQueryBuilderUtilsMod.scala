package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderQueryBuilderUtilsMod {
  
  @JSImport("typeorm/query-builder/QueryBuilderUtils", "QueryBuilderUtils")
  @js.native
  class QueryBuilderUtils () extends StObject
  /* static members */
  object QueryBuilderUtils {
    
    @JSImport("typeorm/query-builder/QueryBuilderUtils", "QueryBuilderUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if given value is a string representation of alias property,
      * e.g. "post.category" or "post.id".
      */
    inline def isAliasProperty(str: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAliasProperty")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
