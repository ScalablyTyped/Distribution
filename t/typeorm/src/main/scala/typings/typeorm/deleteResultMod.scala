package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteResultMod {
  
  @JSImport("typeorm/browser/query-builder/result/DeleteResult", "DeleteResult")
  @js.native
  class DeleteResult () extends StObject {
    
    /**
      * Number of affected rows/documents
      * Not all drivers support this
      */
    var affected: js.UndefOr[Double | Null] = js.native
    
    /**
      * Raw SQL result returned by executed query.
      */
    var raw: js.Any = js.native
  }
}
