package typings.typeorm

import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/result/UpdateResult", JSImport.Namespace)
@js.native
object updateResultMod extends js.Object {
  
  @js.native
  class UpdateResult () extends js.Object {
    
    /**
      * Number of affected rows/documents
      * Not all drivers support this
      */
    var affected: js.UndefOr[Double] = js.native
    
    /**
      * Contains inserted entity id.
      * Has entity-like structure (not just column database name and values).
      */
    /**
      * Generated values returned by a database.
      * Has entity-like structure (not just column database name and values).
      */
    var generatedMaps: js.Array[ObjectLiteral] = js.native
    
    /**
      * Raw SQL result returned by executed query.
      */
    var raw: js.Any = js.native
  }
}
