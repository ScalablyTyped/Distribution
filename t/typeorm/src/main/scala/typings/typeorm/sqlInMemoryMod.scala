package typings.typeorm

import typings.typeorm.queryMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlInMemoryMod {
  
  @JSImport("typeorm/browser/driver/SqlInMemory", "SqlInMemory")
  @js.native
  class SqlInMemory () extends StObject {
    
    var downQueries: js.Array[Query] = js.native
    
    var upQueries: js.Array[Query] = js.native
  }
}
