package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverQueryMod {
  
  @JSImport("typeorm/driver/Query", "Query")
  @js.native
  class Query protected () extends StObject {
    def this(query: String) = this()
    def this(query: String, parameters: js.Array[_]) = this()
    
    var parameters: js.UndefOr[js.Array[_]] = js.native
    
    var query: String = js.native
  }
}
