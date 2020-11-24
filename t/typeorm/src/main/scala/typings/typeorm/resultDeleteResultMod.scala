package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/result/DeleteResult", JSImport.Namespace)
@js.native
object resultDeleteResultMod extends js.Object {
  
  @js.native
  class DeleteResult () extends js.Object {
    
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
