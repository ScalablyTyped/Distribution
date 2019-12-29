package typings.timezonecomplete

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/javascript", JSImport.Namespace)
@js.native
object distLibJavascriptMod extends js.Object {
  @js.native
  sealed trait DateFunctions extends js.Object
  
  @js.native
  object DateFunctions extends js.Object {
    /**
      * Use the Date.getFullYear(), Date.getMonth(), ... functions.
      */
    @js.native
    sealed trait Get extends DateFunctions
    
    /**
      * Use the Date.getUTCFullYear(), Date.getUTCMonth(), ... functions.
      */
    @js.native
    sealed trait GetUTC extends DateFunctions
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateFunctions with Double] = js.native
    /* 0 */ @js.native
    object Get extends TopLevel[Get with Double]
    
    /* 1 */ @js.native
    object GetUTC extends TopLevel[GetUTC with Double]
    
  }
  
}

