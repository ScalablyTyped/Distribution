package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToDateMod {
  
  @JSImport("validator/lib/toDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  inline def default(input: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
}
