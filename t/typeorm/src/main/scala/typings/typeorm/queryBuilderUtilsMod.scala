package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/QueryBuilderUtils", JSImport.Namespace)
@js.native
object queryBuilderUtilsMod extends js.Object {
  
  @js.native
  class QueryBuilderUtils () extends js.Object
  /* static members */
  @js.native
  object QueryBuilderUtils extends js.Object {
    
    /**
      * Checks if given value is a string representation of alias property,
      * e.g. "post.category" or "post.id".
      */
    def isAliasProperty(str: js.Any): /* is string */ Boolean = js.native
  }
}
