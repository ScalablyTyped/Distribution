package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibJavascriptMod {
  
  @js.native
  sealed trait DateFunctions extends StObject
  @JSImport("timezonecomplete/dist/lib/javascript", "DateFunctions")
  @js.native
  object DateFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateFunctions & Double] = js.native
    
    /**
      * Use the Date.getFullYear(), Date.getMonth(), ... functions.
      */
    @js.native
    sealed trait Get
      extends StObject
         with DateFunctions
    /* 0 */ val Get: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.Get & Double = js.native
    
    /**
      * Use the Date.getUTCFullYear(), Date.getUTCMonth(), ... functions.
      */
    @js.native
    sealed trait GetUTC
      extends StObject
         with DateFunctions
    /* 1 */ val GetUTC: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.GetUTC & Double = js.native
  }
}
