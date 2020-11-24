package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/result/InsertResult", JSImport.Namespace)
@js.native
object resultInsertResultMod extends js.Object {
  
  @js.native
  class InsertResult () extends js.Object {
    
    /**
      * Generated values returned by a database.
      * Has entity-like structure (not just column database name and values).
      */
    var generatedMaps: js.Array[ObjectLiteral] = js.native
    
    /**
      * Contains inserted entity id.
      * Has entity-like structure (not just column database name and values).
      */
    var identifiers: js.Array[ObjectLiteral] = js.native
    
    /**
      * Raw SQL result returned by executed query.
      */
    var raw: js.Any = js.native
  }
}
