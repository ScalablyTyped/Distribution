package typings.tableauJsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marksMod {
  
  @JSImport("tableau-js-api/marks", "Mark")
  @js.native
  open class Mark protected () extends StObject {
    def this(pairs: js.Array[Pair]) = this()
    
    // properties
    def getPairs(): js.Array[Pair] = js.native
  }
  
  @JSImport("tableau-js-api/marks", "Pair")
  @js.native
  open class Pair protected () extends StObject {
    def this(fieldName: String, value: String) = this()
    def this(fieldName: String, value: js.Date) = this()
    def this(fieldName: String, value: Boolean) = this()
    def this(fieldName: String, value: Double) = this()
    
    // fields
    var fieldName: String = js.native
    
    var formattedValue: String = js.native
    
    var value: String | Double | Boolean | js.Date = js.native
  }
}
