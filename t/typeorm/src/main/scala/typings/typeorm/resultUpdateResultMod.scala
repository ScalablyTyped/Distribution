package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultUpdateResultMod {
  
  @JSImport("typeorm/query-builder/result/UpdateResult", "UpdateResult")
  @js.native
  class UpdateResult () extends StObject {
    
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
