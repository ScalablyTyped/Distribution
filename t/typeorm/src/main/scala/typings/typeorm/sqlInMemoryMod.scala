package typings.typeorm

import typings.typeorm.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/SqlInMemory", JSImport.Namespace)
@js.native
object sqlInMemoryMod extends js.Object {
  
  @js.native
  class SqlInMemory () extends js.Object {
    
    var downQueries: js.Array[Query] = js.native
    
    var upQueries: js.Array[Query] = js.native
  }
}
