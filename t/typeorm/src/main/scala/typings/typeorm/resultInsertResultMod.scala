package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultInsertResultMod {
  
  @JSImport("typeorm/query-builder/result/InsertResult", "InsertResult")
  @js.native
  class InsertResult () extends StObject {
    
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
